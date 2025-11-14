package com.DTOExample.DTO.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie  {
	
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mid;
	
	@Column(nullable=false)
	private String mname;
	
	private double mcollection;

	public int getMid() {
		return mid;
	}

	

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public double getMcollection() {
		return mcollection;
	}

	public void setMcollection(double mcollection) {
		this.mcollection = mcollection;
	}
	
	

}
