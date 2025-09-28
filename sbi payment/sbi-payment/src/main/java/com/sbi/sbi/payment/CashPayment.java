package com.sbi.sbi.payment;

import org.springframework.stereotype.Component;

@Component
public class CashPayment implements IPaymment {

	@Override
	public String sendMoney() {
		// TODO Auto-generated method stub
		System.out.println("Send money by cash...");
		return "Send money by cash...";
	}

	@Override
	public String gettMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money received in Cash format");
		return "Money received in Cash format";
	}

}
