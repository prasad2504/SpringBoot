package com.DTOExample.DTO.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	
	@Column(nullable=false)
	private String aname;
	
	@Column(nullable=false)
	private String amobile;

	public int getAid() {
		return aid;
	}


	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAmobile() {
		return amobile;
	}

	public void setAmobile(String amobile) {
		this.amobile = amobile;
	}
	
	
	

}
