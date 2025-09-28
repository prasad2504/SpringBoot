package com.flipkart.POrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoTransaction {
	
	
	@Autowired
	PaymentService service;
	
	
	public void Dotransaction() {
		service.Pay();
	}

}
