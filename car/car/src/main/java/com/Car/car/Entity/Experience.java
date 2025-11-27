package com.Car.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Experience {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int EId;
	
	private String ECompany;
	
	private String tenure;
	
	private int year;

	public Experience() {
		
	}

	public Experience(int eId, String eCompany, String tenure, int year) {
		
		EId = eId;
		ECompany = eCompany;
		this.tenure = tenure;
		this.year = year;
	}

	public int getEId() {
		return EId;
	}



	public String getECompany() {
		return ECompany;
	}

	public void setECompany(String eCompany) {
		ECompany = eCompany;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "CeoId")
	private Ceo ceo;
	
	

}
