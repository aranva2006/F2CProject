package com.f2c.order.component;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.order.entity.CustomerOrder;
import com.f2c.order.entity.beans.CustomerOrderDetails;
import com.f2c.order.entity.beans.CustomerOrderInfo;
import com.f2c.order.repository.OrderRepository;

@Service
public class OrderComponent {
	private static final Logger logger = LoggerFactory.getLogger(OrderComponent.class);

	OrderRepository orderRepository;

	@Autowired
	public OrderComponent(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public List<CustomerOrderDetails> getCustomerOrders(String phone_number) {
		logger.info("Finding order history for user : " + phone_number);
		List<CustomerOrder> customerOrders = orderRepository.findCustomerOrderByPhoneNumber(phone_number);
		List<CustomerOrderDetails> customerOrderDetails = new ArrayList<>();
		List<CustomerOrderInfo> customerOrderInfos = new ArrayList<>();
		for (CustomerOrder order : customerOrders) {
			CustomerOrderDetails orderHistory = new CustomerOrderDetails();
			orderHistory.setOrderId(order.getOrderId());
			orderHistory.setScocietyId(order.getScocietyId());
			orderHistory.setOrderDate(order.getOrderDate());
			orderHistory.setPaymentDetailId(order.getPaymentDetailId());
			orderHistory.setOrderState(order.getOrderState());
			orderHistory.setOrderAmount(order.getOrderAmount());
			for (com.f2c.order.entity.CustomerOrderInfo orderInfo : order.getCustomerOrderInfos()) {
				CustomerOrderInfo customerOrderInfo = new CustomerOrderInfo();
				customerOrderInfo.setOrderInfoId(orderInfo.getOrderInfoId());
				customerOrderInfo.setProductId(orderInfo.getProductId());
				customerOrderInfo.setProductAmount(orderInfo.getProductAmount());
				customerOrderInfo.setStatus(orderInfo.getDeliveryStatus());
				customerOrderInfo.setDeliveryStatus(orderInfo.getDeliveryStatus());
				customerOrderInfo.setDeliveryDate(orderInfo.getDeliveryDate());
				customerOrderInfos.add(customerOrderInfo);
			}
			orderHistory.setCustomerOrders(customerOrderInfos);
			customerOrderDetails.add(orderHistory);
		}
		return customerOrderDetails;
	}

	public CustomerOrderDetails updateOrder(int orderId) {
		return null;
	}

	public CustomerOrderDetails createOrder(int orderId) {
		return null;
	}
}
