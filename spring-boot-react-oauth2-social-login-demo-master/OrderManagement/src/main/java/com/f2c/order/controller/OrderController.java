package com.f2c.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.order.component.OrderComponent;
import com.f2c.order.entity.beans.CustomerOrderDetails;

@RestController
@CrossOrigin
@RequestMapping("/custmaint")
public class OrderController {
	OrderComponent orderComponent;

	@Autowired
	OrderController(OrderComponent orderComponent) {
		this.orderComponent = orderComponent;
	}

	@RequestMapping(value = "/getCustomerOrders/{phone_number}", method = RequestMethod.GET)
	public List<CustomerOrderDetails> getCustomerOrders(@PathVariable String phone_number) {
		return orderComponent.getCustomerOrders(phone_number);
	}

	@RequestMapping(value = "/createOrder/", method = RequestMethod.POST)
	public CustomerOrderDetails createOrder(@PathVariable int orderId) {
		return orderComponent.createOrder(orderId);
	}

	@RequestMapping(value = "/updateOrder/", method = RequestMethod.POST)
	public CustomerOrderDetails updateOrder(@PathVariable int orderId) {
		return orderComponent.updateOrder(orderId);
	}
}
