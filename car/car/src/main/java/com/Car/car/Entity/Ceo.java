package com.Car.car.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Ceo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CeoId;
	
	private String CeoName;

	public Ceo() {
		
	}

	public Ceo(int ceoId, String ceoName) {
		
		CeoId = ceoId;
		CeoName = ceoName;
	}

	public int getCeoId() {
		return CeoId;
	}

	

	public String getCeoName() {
		return CeoName;
	}

	public void setCeoName(String ceoName) {
		CeoName = ceoName;
	}
	
	
	@JoinColumn
	@OneToMany
	private List<Experience> ex;

	
	
	
	public List<Experience> getEx() {
		return ex;
	}

	public void setEx(List<Experience> ex) {
		this.ex = ex;
	}

	

	public Ceo(int ceoId, String ceoName, List<Experience> ex) {
		super();
		CeoId = ceoId;
		CeoName = ceoName;
		this.ex = ex;
	}


	@OneToOne(mappedBy="ceo")
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Ceo(int ceoId, String ceoName, List<Experience> ex, Company company) {
		super();
		CeoId = ceoId;
		CeoName = ceoName;
		this.ex = ex;
		this.company = company;
	}
	
	
	
}
