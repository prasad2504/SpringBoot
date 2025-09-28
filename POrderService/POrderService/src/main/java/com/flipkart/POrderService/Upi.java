package com.flipkart.POrderService;

import org.springframework.stereotype.Component;

@Component
public class Upi implements PaymentService {

	@Override
	public void Pay() {
		
		System.out.println("Payment done from upi method");
		
	}

}
