package com.sbi.sbi.payment;

import org.springframework.stereotype.Component;

@Component
public interface IPaymment {

	
	public String sendMoney();
	
	public String gettMoney();
}
