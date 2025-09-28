package com.sbi.sbi.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MoneyOrder implements IPaymment {

	@Override
	public String sendMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money send by postal.....");
		return "Money send by postal......";
	}

	@Override
	public String gettMoney() {
		// TODO Auto-generated method stub
		System.out.println("\"Money Received by Postal order....\"");
		return "Money Received by Postal order....";
	}

}
