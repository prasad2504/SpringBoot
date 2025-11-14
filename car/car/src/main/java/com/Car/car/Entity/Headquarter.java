package com.Car.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Headquarter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int HId;
	
	private String HCity;
	
	private String HState;
	
	private int HPincode;

	public Headquarter() {
		
	}

	public Headquarter(int hId, String hCity, String hState, int hPincode) {
		
		HId = hId;
		HCity = hCity;
		HState = hState;
		HPincode = hPincode;
	}

	public int getHId() {
		return HId;
	}

	

	public String getHCity() {
		return HCity;
	}

	public void setHCity(String hCity) {
		HCity = hCity;
	}

	public String getHState() {
		return HState;
	}

	public void setHState(String hState) {
		HState = hState;
	}

	public int getHPincode() {
		return HPincode;
	}

	public void setHPincode(int hPincode) {
		HPincode = hPincode;
	}
	
	
	@OneToOne(mappedBy="hq")
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Headquarter(int hId, String hCity, String hState, int hPincode, Company company) {
		super();
		HId = hId;
		HCity = hCity;
		HState = hState;
		HPincode = hPincode;
		this.company = company;
	}
	
	
	
	
	
}
