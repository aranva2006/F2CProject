package com.f2c.productbooking.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.f2c.productbooking.component.BookingComponent;
import com.f2c.productbooking.component.BookingStatus;

@Controller
public class Receiver {
	
	BookingComponent bookingComponent;
	
	@Autowired
	public Receiver(BookingComponent bookingComponent){
		this.bookingComponent = bookingComponent;
	}
	@RabbitListener(queues = "CheckINQ")
    public void processMessage(long bookingID ) {
		bookingComponent.updateStatus(BookingStatus.CHECKED_IN, bookingID);
    }
	
}



