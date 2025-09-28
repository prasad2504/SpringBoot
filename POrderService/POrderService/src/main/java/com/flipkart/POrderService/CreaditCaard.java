package com.flipkart.POrderService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreaditCaard implements PaymentService {

	@Override
	public void Pay() {
		
		System.out.println("Payment done from the credit card");

	}

}
