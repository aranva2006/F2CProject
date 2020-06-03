<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta name="description" content="Askbootstrap">
      <meta name="author" content="Askbootstrap">
      <title>Groci - Organic Food & Grocery Market Template</title>
      <!-- Favicon Icon -->
      <link rel="icon" type="image/png" href="https://askbootstrap.com/preview/groci/img/favicon2.png">
      <!-- Bootstrap core CSS -->
      <link href="./vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <!-- Material Design Icons -->
      <link href="./vendor/icons/css/materialdesignicons.min.css" media="all" rel="stylesheet" type="text/css" />
      <!-- Select2 CSS -->
      <link href="./vendor/select2/css/select2-bootstrap.css" />
      <link href="./vendor/select2/css/select2.min.css" rel="stylesheet" />
      <!-- Custom styles for this template -->
      <link href="./css/osahan2.css" rel="stylesheet">
      <!-- Owl Carousel -->
      <link rel="stylesheet" href="./vendor/owl-carousel/owl.carousel.css">
      <link rel="stylesheet" href="./vendor/owl-carousel/owl.theme.css">
   </head>
   <body>
      <div class="modal fade login-modal-main" id="bd-example-modal">
         <div class="modal-dialog modal-lg modal-dialog-centered" role="document">
            <div class="modal-content">
               <div class="modal-body">
                  <div class="login-modal">
                     <div class="row">
                        <div class="col-lg-6 pad-right-0 login-background">
                           <div class="login-modal-left">
                           </div>
                        </div>
                        <div class="col-lg-6 pad-left-0">
                           <button type="button" class="close close-top-right" data-dismiss="modal" aria-label="Close">
                           <span aria-hidden="true"><i class="mdi mdi-close"></i></span>
                           <span class="sr-only">Close</span>
                           </button>
                           <form>
                              <div class="login-modal-right">
                                 <!-- Tab panes -->
                                 <div class="tab-content">
                                    <div class="tab-pane active" id="login" role="tabpanel">
                                       <h5 class="heading-design-h5">Login to your account</h5>
                                       <fieldset class="form-group">
                                          <label>Enter Email/Mobile number</label>
                                          <input type="text" class="form-control" placeholder="+91 123 456 7890">
                                       </fieldset>
                                       <fieldset class="form-group">
                                          <label>Enter Password</label>
                                          <input type="password" class="form-control" placeholder="********">
                                       </fieldset>
                                       <fieldset class="form-group">
                                          <button type="submit" class="btn btn-lg btn-secondary btn-block">Enter to your account</button>
                                       </fieldset>
                                       <div class="login-with-sites text-center">
                                          <p>or Login with your social profile:</p>
                                          <button class="btn-facebook login-icons btn-lg"><i class="mdi mdi-facebook"></i><a th:href="@{/auth/facebook}">Face Book</a></button>
                                          <button class="btn-google login-icons btn-lg"><i class="mdi mdi-google"></i> <a th:href="@{/auth/google}">Google</a></button>
                                       </div>
                                       <div class="custom-control custom-checkbox">
                                          <input type="checkbox" class="custom-control-input" id="customCheck1">
                                          <label class="custom-control-label" for="customCheck1">Remember me</label>
                                       </div>
                                    </div>
                                    <div class="tab-pane" id="register" role="tabpanel">
                                       <h5 class="heading-design-h5">Register Now!</h5>
                                       <fieldset class="form-group">
                                          <label>Enter Email/Mobile number</label>
                                          <input type="text" class="form-control" placeholder="+91 123 456 7890">
                                       </fieldset>
                                       <fieldset class="form-group">
                                          <label>Enter Password</label>
                                          <input type="password" class="form-control" placeholder="********">
                                       </fieldset>
                                       <fieldset class="form-group">
                                          <label>Enter Confirm Password </label>
                                          <input type="password" class="form-control" placeholder="********">
                                       </fieldset>
                                       <fieldset class="form-group">
                                          <button type="submit" class="btn btn-lg btn-secondary btn-block">Create Your Account</button>
                                       </fieldset>
                                       <div class="custom-control custom-checkbox">
                                          <input type="checkbox" class="custom-control-input" id="customCheck2">
                                          <label class="custom-control-label" for="customCheck2">I Agree with <a href="#">Term and Conditions</a></label>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="clearfix"></div>
                                 <div class="text-center login-footer-tab">
                                    <ul class="nav nav-tabs" role="tablist">
                                       <li class="nav-item">
                                          <a class="nav-link active" data-toggle="tab" href="#login" role="tab"><i class="mdi mdi-lock"></i> LOGIN</a>
                                       </li>
                                       <li class="nav-item">
                                          <a class="nav-link" data-toggle="tab" href="#register" role="tab"><i class="mdi mdi-pencil"></i> REGISTER</a>
                                       </li>
                                    </ul>
                                 </div>
                                 <div class="clearfix"></div>
                              </div>
                           </form>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <nav class="navbar navbar-light navbar-expand-lg bg-dark bg-faded osahan-menu">
         <div class="container-fluid">
            <a class="navbar-brand" href="index.html"> <img src="./vendor/icon.jpg" alt="logo"> </a>
			<a class="location-top" href="#"><i class="mdi mdi-map-marker-circle" aria-hidden="true"></i>Shobha Dream Acres</a>
            <button class="navbar-toggler navbar-toggler-white" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="navbar-collapse" id="navbarNavDropdown">
               <div class="navbar-nav mr-auto mt-2 mt-lg-0 margin-auto top-categories-search-main">
                  <div class="top-categories-search">
                     <div class="input-group">
                        <span class="input-group-btn categories-dropdown">
                           <select class="form-control-select">
                              <option selected="selected" value="0">Bengaluru</option>
                           </select>
                        </span>
                        <input class="form-control" placeholder="Search products in Your City" aria-label="Search products in Your City" type="text">
                        <span class="input-group-btn">
                        <button class="btn btn-secondary" type="button"><i class="mdi mdi-file-find"></i> Search</button>
                        </span>
                     </div>
                  </div>
               </div>
               <div class="my-2 my-lg-0">
                  <ul class="list-inline main-nav-right">
                     <li class="list-inline-item">
                        <a href="#" data-target="#bd-example-modal" data-toggle="modal" class="btn btn-link"><i class="mdi mdi-account-circle"></i> Login/Sign Up</a>
                     </li>
                     <li class="list-inline-item cart-btn">
                        <a href="#" data-toggle="offcanvas" class="btn btn-link border-none"><i class="mdi mdi-cart"></i> My Cart <small class="cart-value">5</small></a>
                     </li>
                  </ul>
               </div>
            </div>
         </div>
      </nav>
      <nav class="dontshow">
         <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbarText">
               <ul class="navbar-nav mr-auto mt-2 mt-lg-0 margin-auto">
                  <li class="nav-item">
                     <a class="nav-link shop" href="index.html"><span class="mdi mdi-store"></span> Super Store</a>
                  </li>
                  <li class="nav-item">
                     <a href="index.html" class="nav-link">Home</a>
                  </li>
                  <li class="nav-item">
                     <a href="about.html" class="nav-link">About Us</a>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" href="shop.html">Fruits & Vegetables</a>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" href="shop.html">Grocery & Staples</a>
                  </li>
                  <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     Pages
                     </a>
                     <div class="dropdown-menu">
                        <a class="dropdown-item" href="shop.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i> Shop Grid</a>
                        <a class="dropdown-item" href="single.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i> Single Product</a>
                        <a class="dropdown-item" href="cart.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i> Shopping Cart</a>
                        <a class="dropdown-item" href="checkout.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i> Checkout</a> 
                     </div>
                  </li>
                  <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     My Account
                     </a>
                     <div class="dropdown-menu">
                        <a class="dropdown-item" href="my-profile.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  My Profile</a>
                        <a class="dropdown-item" href="my-address.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  My Address</a>
                        <a class="dropdown-item" href="wishlist.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  Wish List </a>
                        <a class="dropdown-item" href="orderlist.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  Order List</a> 
                     </div>
                  </li>
                  <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     Blog Page
                     </a>
                     <div class="dropdown-menu">
                        <a class="dropdown-item" href="blog.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i> Blog</a>
                        <a class="dropdown-item" href="blog-detail.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i> Blog Detail</a>
                     </div>
                  </li>
                  <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     More Pages
                     </a>
                     <div class="dropdown-menu">
                        <a class="dropdown-item" href="about.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  About Us</a>
                        <a class="dropdown-item" href="contact.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  Contact Us</a>
                        <a class="dropdown-item" href="faq.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  FAQ </a>
                        <a class="dropdown-item" href="not-found.html"><i class="mdi mdi-chevron-right" aria-hidden="true"></i>  404 Error</a> 
                     </div>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" href="contact.html">Contact</a>
                  </li>
               </ul>
            </div>
         </div>
      </nav>
      <section class="account-page section-padding">
         <div class="container">
            <div class="row">
               <div class="col-lg-12 mx-auto">
                  <div class="row no-gutters">
                     <div class="col-md-2">
                        <div class="card account-left">
                           <div class="user-profile-header">
                              <img alt="logo" src="https://askbootstrap.com/preview/groci/img/user/1.jpg">
                              <h5 class="mb-1 text-secondary"><strong>Hi </strong> OSAHAN</h5>
                              <p> +91 8568079956</p>
                           </div>
                           <div class="list-group">
                              <a href="my-profile.html" class="list-group-item list-group-item-action active"><i aria-hidden="true" class="mdi mdi-account-outline"></i>  Products</a>
                              <a href="my-address.html" class="list-group-item list-group-item-action"><i aria-hidden="true" class="mdi mdi-map-marker-circle"></i>  My Profile</a>
                              <a href="my-address.html" class="list-group-item list-group-item-action"><i aria-hidden="true" class="mdi mdi-map-marker-circle"></i>  My Address</a>
                              <a href="wishlist.html" class="list-group-item list-group-item-action "><i aria-hidden="true" class="mdi mdi-heart-outline"></i>  Wish List </a>
                              <a href="orderlist.html" class="list-group-item list-group-item-action"><i aria-hidden="true" class="mdi mdi-format-list-bulleted"></i>  Order List</a> 
                              <a href="#" class="list-group-item list-group-item-action"><i aria-hidden="true" class="mdi mdi-lock"></i>  Logout</a> 
                           </div>
                        </div>
                     </div>
                     <div class="col-md-10">
                        <div class="card card-body account-right">
                           <div class="widget">
                              <div class="section-header">
                                 <h5 class="heading-design-h5">
                                    Available Products
                                 </h5>
                              </div>
                              <div class="row no-gutters">
                              	 <c:forEach var="product" items="${products}">
								     <div class="col-md-12">
                                      <div class="product">
                                       <a href="#">
                                          <div class="product-header">
                                             <span class="badge badge-success"><c:out value="${product.productCode}"/></span>
                                             <!-- <img alt="" src="https://images.pexels.com/photos/1591447/pexels-photo-1591447.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" class="img-fluid"> -->
                                             <img alt="" src="<c:url value="/images/prod-image-500x500.jpg"/>" class="img-fluid"/>
                                          </div>
                                          <div class="product-body">
                                             <h5><c:out value="${product.productCode}"/></h5>
                                             <h6><strong><span class="mdi mdi-approval"></span> Available in</strong> - 500 gm</h6>
                                             <p class="offer-price mb-0">$450.99 <i class="mdi mdi-tag-outline"></i><br><span class="regular-price">$800.99</span></p>
                                          </div>
                                          <div class="product-detail">
                                             <p>
                                                <c:out value="${product.productDesc}"/> 
                                             </p>
                                          </div>
                                          <div class="product-footer">
                                             <button class="btn btn-secondary btn-sm float-right" type="button"><i class="mdi mdi-cart-outline"></i> Add To Cart</button>
                                          </div>
                                       </a>
                                    </div>
                                  </div>
								 </c:forEach>
                              </div>
							  <nav>
								 <ul class="pagination justify-content-center mt-4">
									<li class="page-item disabled">
									   <span class="page-link">Previous</span>
									</li>
									<li class="page-item"><a href="#" class="page-link">1</a></li>
									<li class="page-item active">
									   <span class="page-link">
									   2
									   <span class="sr-only">(current)</span>
									   </span>
									</li>
									<li class="page-item"><a href="#" class="page-link">3</a></li>
									<li class="page-item">
									   <a href="#" class="page-link">Next</a>
									</li>
								 </ul>
							  </nav>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <section class="dontshow">
         <div class="container">
            <div class="row">
               <div class="col-lg-4 col-sm-6">
                  <div class="feature-box">
                     <i class="mdi mdi-truck-fast"></i>
                     <h6>Free & Next Day Delivery</h6>
                     <p>Lorem ipsum dolor sit amet, cons...</p>
                  </div>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <div class="feature-box">
                     <i class="mdi mdi-basket"></i>
                     <h6>100% Satisfaction Guarantee</h6>
                     <p>Rorem Ipsum Dolor sit amet, cons...</p>
                  </div>
               </div>
               <div class="col-lg-4 col-sm-6">
                  <div class="feature-box">
                     <i class="mdi mdi-tag-heart"></i>
                     <h6>Great Daily Deals Discount</h6>
                     <p>Sorem Ipsum Dolor sit amet, Cons...</p>
                  </div>
               </div>
            </div>
         </div>
      </section>
      
      <!-- Copyright -->
      <section class="pt-4 pb-4 footer-bottom">
         <div class="container">
            <div class="row no-gutters">
               <div class="col-lg-6 col-sm-6">
                  <p class="mt-1 mb-0">&copy; Copyright 2020 <strong class="text-dark">XXXX</strong>. All Rights Reserved<br>
				  </p>
               </div>
              </div>
         </div>
      </section>
      <!-- End Copyright -->
      <div class="cart-sidebar">
         <div class="cart-sidebar-header">
            <h5>
               My Cart <span class="text-success">(5 item)</span> <a data-toggle="offcanvas" class="float-right" href="#"><i class="mdi mdi-close"></i>
               </a>
            </h5>
         </div>
         <div class="cart-sidebar-body">
            <div class="cart-list-product">
               <a class="float-right remove-cart" href="#"><i class="mdi mdi-close"></i></a>
               <img class="img-fluid" src="https://askbootstrap.com/preview/groci/img/item/11.jpg" alt="">
               <span class="badge badge-success">50% OFF</span>
               <h5><a href="#">Product Title Here</a></h5>
               <h6><strong><span class="mdi mdi-approval"></span> Available in</strong> - 500 gm</h6>
               <p class="offer-price mb-0">$450.99 <i class="mdi mdi-tag-outline"></i> <span class="regular-price">$800.99</span></p>
            </div>
            <div class="cart-list-product">
               <a class="float-right remove-cart" href="#"><i class="mdi mdi-close"></i></a>
               <img class="img-fluid" src="https://askbootstrap.com/preview/groci/img/item/7.jpg" alt="">
               <span class="badge badge-success">50% OFF</span>
               <h5><a href="#">Product Title Here</a></h5>
               <h6><strong><span class="mdi mdi-approval"></span> Available in</strong> - 500 gm</h6>
               <p class="offer-price mb-0">$450.99 <i class="mdi mdi-tag-outline"></i> <span class="regular-price">$800.99</span></p>
            </div>
            <div class="cart-list-product">
               <a class="float-right remove-cart" href="#"><i class="mdi mdi-close"></i></a>
               <img class="img-fluid" src="https://askbootstrap.com/preview/groci/img/item/9.jpg" alt="">
               <span class="badge badge-success">50% OFF</span>
               <h5><a href="#">Product Title Here</a></h5>
               <h6><strong><span class="mdi mdi-approval"></span> Available in</strong> - 500 gm</h6>
               <p class="offer-price mb-0">$450.99 <i class="mdi mdi-tag-outline"></i> <span class="regular-price">$800.99</span></p>
            </div>
            <div class="cart-list-product">
               <a class="float-right remove-cart" href="#"><i class="mdi mdi-close"></i></a>
               <img class="img-fluid" src="https://askbootstrap.com/preview/groci/img/item/1.jpg" alt="">
               <span class="badge badge-success">50% OFF</span>
               <h5><a href="#">Product Title Here</a></h5>
               <h6><strong><span class="mdi mdi-approval"></span> Available in</strong> - 500 gm</h6>
               <p class="offer-price mb-0">$450.99 <i class="mdi mdi-tag-outline"></i> <span class="regular-price">$800.99</span></p>
            </div>
            <div class="cart-list-product">
               <a class="float-right remove-cart" href="#"><i class="mdi mdi-close"></i></a>
               <img class="img-fluid" src="https://askbootstrap.com/preview/groci/img/item/2.jpg" alt="">
               <span class="badge badge-success">50% OFF</span>
               <h5><a href="#">Product Title Here</a></h5>
               <h6><strong><span class="mdi mdi-approval"></span> Available in</strong> - 500 gm</h6>
               <p class="offer-price mb-0">$450.99 <i class="mdi mdi-tag-outline"></i> <span class="regular-price">$800.99</span></p>
            </div>
         </div>
         <div class="cart-sidebar-footer">
            <div class="cart-store-details">
               <p>Sub Total <strong class="float-right">$900.69</strong></p>
               <p>Delivery Charges <strong class="float-right text-danger">+ $29.69</strong></p>
               <h6>Your total savings <strong class="float-right text-danger">$55 (42.31%)</strong></h6>
            </div>
            <a href="checkout.html"><button class="btn btn-secondary btn-lg btn-block text-left" type="button"><span class="float-left"><i class="mdi mdi-cart-outline"></i> Proceed to Checkout </span><span class="float-right"><strong>$1200.69</strong> <span class="mdi mdi-chevron-right"></span></span></button></a>
         </div>
      </div>
      <!-- Bootstrap core JavaScript -->
      <script src="./vendor/jquery/jquery.min.js"></script>
      <script src="./vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
      <!-- select2 Js -->
      <script src="./vendor/select2/js/select2.min.js"></script>
      <!-- Owl Carousel -->
      <script src="./vendor/owl-carousel/owl.carousel.js"></script>
      <!-- Custom -->
      <script src="https://askbootstrap.com/preview/groci/js/custom.js"></script>
      <script>
          $(window).on('load',function(){
        $('#bd-example-modal').modal('show');
    	});
      </script>
   </body>

<!-- Mirrored from askbootstrap.com/preview/groci/theme-two/wishlist.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 27 May 2020 17:05:20 GMT -->
</html>

