package com.f2c.social.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.security.SocialAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.f2c.prodmaint.entity.beans.ProductDetails;
import com.f2c.prodmaint.entity.beans.SocietyDetail;
import com.f2c.prodmaint.entity.beans.UserInfo;
import com.f2c.social.dao.AppUserDAO;
import com.f2c.social.entity.AppRole;
import com.f2c.social.entity.AppUser;
import com.f2c.social.form.AppUserForm;
import com.f2c.social.social.SocialUserDetailsImpl;
import com.f2c.social.utils.SecurityUtil;
import com.f2c.social.utils.WebUtils;
import com.f2c.social.validator.AppUserValidator;

@Controller
@Transactional
public class MainController {

	@Autowired
	private AppUserDAO appUserDAO;

	@Autowired
	private ConnectionFactoryLocator connectionFactoryLocator;

	@Autowired
	private UsersConnectionRepository connectionRepository;

	@Autowired
	private AppUserValidator appUserValidator;

	@Autowired
	RestTemplate restTemplate;
	
	@InitBinder
	protected void initBinder(WebDataBinder dataBinder) {

		// Form target
		Object target = dataBinder.getTarget();
		if (target == null) {
			return;
		}
		System.out.println("Target=" + target);

		if (target.getClass() == AppUserForm.class) {
			dataBinder.setValidator(appUserValidator);
		}
	}

	private List<SocietyDetail> getSocietyList() {
		ResponseEntity<List<SocietyDetail>> response = restTemplate.exchange(
				"http://localhost:8060/custmaint/getAllSocieties", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<SocietyDetail>>() {
				});
		return response.getBody();
	}
 
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcomePage(Model model, Principal principal) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		if(principal != null)
			model.addAttribute("userInfo" , getUserInfo(principal));
		model.addAttribute("myForm", new AppUserForm());
		
		List<ProductDetails> products = getProductList();
		model.addAttribute("products", products);
		model.addAttribute("societyList", getSocietyList());
		return "index";
	}

	@RequestMapping(value = { "/my-profile" }, method = RequestMethod.GET)
	@PreAuthorize("isAuthenticated()")
	public String profilePage(Model model, Principal principal) {
		if (principal != null) {
			model.addAttribute("title", "Welcome");
			model.addAttribute("message", "This is welcome page!");
			if (principal != null)
				model.addAttribute("userInfo", getUserInfo(principal));
			model.addAttribute("myForm", new AppUserForm());
			model.addAttribute("products", getProductList());
			model.addAttribute("societyList", getSocietyList());
			return "my-profile";
		} else {
			return "403Page";
		}
	}

	private UserInfo getUserInfo(Principal principal) {
		UserInfo userInfo = new UserInfo();
		if (principal != null && ((Authentication) principal).isAuthenticated()) {
			UserDetails loginedUser = (UserDetails) ((Authentication) principal).getPrincipal();
			Connection conn;
			if(principal instanceof UsernamePasswordAuthenticationToken) {
				AppUser appUser = ((SocialUserDetailsImpl)((UsernamePasswordAuthenticationToken) principal).getPrincipal()).getAppUser();
				userInfo.setUserName(loginedUser.getUsername());
				userInfo.setFirstName(appUser.getFirstName());
				userInfo.setLastName(appUser.getLastName());
				userInfo.setIsAuthenticated("T");
				userInfo.setDisplayName(convertToTitleCaseSplitting(appUser.getFirstName() + " " + appUser.getLastName()));
			}

			if(principal instanceof SocialAuthenticationToken) {
				conn = ((SocialAuthenticationToken) principal).getConnection();
				userInfo.setUserName(loginedUser.getUsername());
				userInfo.setIsAuthenticated("T");
				userInfo.setDisplayName(convertToTitleCaseSplitting(conn.getDisplayName()));
				userInfo.setImageUrl(conn.getImageUrl());
				userInfo.setFirstName(conn.getDisplayName());
			}

		}
		return userInfo;
	}

	private List<ProductDetails> getProductList() {
		ResponseEntity<List<ProductDetails>> response = restTemplate.exchange(
				"http://localhost:8009/prodmaint/activeProducts", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProductDetails>>() {
				});
		return response.getBody();
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model, Principal principal) {

		// After user login successfully.
		String userName = principal.getName();
		System.out.println("User Name: " + userName);

		UserDetails loginedUser = (UserDetails) ((Authentication) principal).getPrincipal();

		String userInfo = WebUtils.toString(loginedUser);
		model.addAttribute("userInfo", userInfo);
		model.addAttribute("societyList", getSocietyList());
		return "adminPage";
	}

	@RequestMapping(value = "/loginSuccessful", method = RequestMethod.GET)
	public String loginSuccessfulPage(Model model, Principal principal) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		AppUser loginedUser = ((SocialUserDetailsImpl) ((Authentication) principal).getPrincipal()).getAppUser();
		loginedUser.getUserId();
		model.addAttribute("userInfo" , getUserInfo(principal));
		model.addAttribute("societyList", getSocietyList());
		model.addAttribute("products", getProductList());
		model.addAttribute("myForm", new AppUserForm());
		return "index";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model, Principal principal) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		model.addAttribute("userInfo" , getUserInfo(principal));
		model.addAttribute("products", getProductList());
		model.addAttribute("societyList", getSocietyList());
		model.addAttribute("myForm", new AppUserForm());
		return "index";
	}

	@RequestMapping(value = "/address-page", method = RequestMethod.GET)
	@Secured("ROLE_USER")
	public String myAddressPage(Model model, Principal principal) {
		model.addAttribute("userInfo" , getUserInfo(principal));
		model.addAttribute("products", getProductList());
		model.addAttribute("myForm", new AppUserForm());
		return "my-address";
	}
	
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			UserDetails loginedUser = (UserDetails) ((Authentication) principal).getPrincipal();
			String userInfo = WebUtils.toString(loginedUser);
			model.addAttribute("userInfo", userInfo);
			String message = "Hi " + principal.getName() + "<br> You do not have permission to access this page!";
			model.addAttribute("message", message);
		}
		return "403Page";
	}

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		ResponseEntity<List<ProductDetails>> response = restTemplate.exchange(
				"http://localhost:8009/prodmaint/activeProducts", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProductDetails>>() {
				});
		List<ProductDetails> products = response.getBody();
		model.addAttribute("products", products);
		model.addAttribute("societyList", getSocietyList());
		return "index";
	}

	@RequestMapping(value = { "/loginPage" }, method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "loginPage";
	}

	@RequestMapping(value = { "/signin" }, method = RequestMethod.GET)
	public String signInPage(Model model) {
		return "redirect:/login";
	}

	@RequestMapping(value = { "/signup" }, method = RequestMethod.GET)
	public String signupPage(WebRequest request, Model model) {
		ProviderSignInUtils providerSignInUtils = new ProviderSignInUtils(connectionFactoryLocator, connectionRepository);
		// Retrieve social networking information.
		Connection<?> connection = providerSignInUtils.getConnectionFromSession(request);
		AppUserForm myForm = null;
		if (connection != null) {
			myForm = new AppUserForm(connection);
		} else {
			myForm = new AppUserForm();
		}
		model.addAttribute("products", getProductList());
		model.addAttribute("myForm", myForm);
		model.addAttribute("societyList", getSocietyList());
		return "index";
	}

	@RequestMapping(value = { "/signup" }, method = RequestMethod.POST)
	public String signupSave(WebRequest request, Model model,
			@ModelAttribute("myForm") @Validated AppUserForm appUserForm, BindingResult result,
			final RedirectAttributes redirectAttributes,Principal principal) {

		if (result.hasErrors()) {
			return "index";
		}

		List<String> roleNames = new ArrayList<String>();
		roleNames.add(AppRole.ROLE_USER);

		AppUser registered = null;

		try {
			registered = appUserDAO.registerNewUserAccount(appUserForm, roleNames);
		} catch (Exception ex) {
			ex.printStackTrace();
			model.addAttribute("errorMessage", "Error " + ex.getMessage());
			return "signupPage";
		}

		if (appUserForm.getSignInProvider() != null) {
			ProviderSignInUtils providerSignInUtils = new ProviderSignInUtils(connectionFactoryLocator,
					connectionRepository);

			// (Spring Social API):
			// If user login by social networking.
			// This method saves social networking information to the UserConnection table.
			providerSignInUtils.doPostSignUp(registered.getUserName(), request);
		}

		// After registration is complete, automatic login.
		SecurityUtil.logInUser(registered, roleNames);
		model.addAttribute("myForm", new AppUserForm());
		model.addAttribute("societyList", getSocietyList());
		return "index";
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	private final String WORD_SEPARATOR = " ";

	public String convertToTitleCaseSplitting(String text) {
		if (text == null || text.isEmpty()) {
			return text;
		}

		return Arrays.stream(text.split(WORD_SEPARATOR)).map(
				word -> word.isEmpty() ? word : Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
				.collect(Collectors.joining(WORD_SEPARATOR));
	}

}