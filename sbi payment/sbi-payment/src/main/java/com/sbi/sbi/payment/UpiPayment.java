package com.sbi.sbi.payment;

import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements IPaymment {

	@Override
	public String sendMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money send by Upi...");
		return "Money send by Upi....";
	}

	@Override
	public String gettMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money received in upi format...");
		return "Money received in upi format...";
	}

}
