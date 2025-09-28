package com.sbi.sbi.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	
public class DoTransaction {

	@Autowired
	IPaymment payment;
	
	
	public void CompleteTrasaction() {
		
		payment.sendMoney();
		payment.gettMoney();
	}
}
