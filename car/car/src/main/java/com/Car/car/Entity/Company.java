package com.Car.car.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Company {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CompanyId;
	
	private String CompanyName;
	
	private double CompanyValuation;

	public Company() {
	
	}

	public Company(int companyId, String companyName, double companyValuation) {
		
		CompanyId = companyId;
		CompanyName = companyName;
		CompanyValuation = companyValuation;
	}

	public int getCompanyId() {
		return CompanyId;
	}


	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public double getCompanyValuation() {
		return CompanyValuation;
	}

	public void setCompanyValuation(double companyValuation) {
		CompanyValuation = companyValuation;
	}
	
	
	@JoinColumn
	@OneToOne(cascade=CascadeType.ALL)
	private Ceo ceo;

	public Ceo getCeo() {
		return ceo;
	}

	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}

	public Company(int companyId, String companyName, double companyValuation, Ceo ceo) {
		
		CompanyId = companyId;
		CompanyName = companyName;
		CompanyValuation = companyValuation;
		this.ceo = ceo;
	}
	
	
	@JoinColumn
	@OneToOne(cascade=CascadeType.ALL)
	private Headquarter hq;

	public Headquarter getHq() {
		return hq;
	}

	public void setHq(Headquarter hq) {
		this.hq = hq;
	}

	public Company(int companyId, String companyName, double companyValuation, Ceo ceo, Headquarter hq) {
		
		CompanyId = companyId;
		CompanyName = companyName;
		CompanyValuation = companyValuation;
		this.ceo = ceo;
		this.hq = hq;
	}
	
	
	
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	private List<Car> cars;

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Company(int companyId, String companyName, double companyValuation, Ceo ceo, Headquarter hq,
			List<Car> cars) {
	
		CompanyId = companyId;
		CompanyName = companyName;
		CompanyValuation = companyValuation;
		this.ceo = ceo;
		this.hq = hq;
		this.cars = cars;
	}

	
	
	
	
	

}
