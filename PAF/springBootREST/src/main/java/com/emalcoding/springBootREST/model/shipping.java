package com.emalcoding.springBootREST.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="shipping")
@EntityListeners(AuditingEntityListener.class)

public class shipping {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
//	@NotBlank
	private String name;
	
	@NotBlank
	private String address;
	
//	@NotBlank
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date date;
	
//	@NotBlank
	private String mail;
	
	private int phonenum;

	public shipping() {
	}
	
	
	

	public shipping(int id, String name, String address, Date date, String mail, int phonenum) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
		this.mail = mail;
		this.phonenum = phonenum;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}




	public int getPhonenum() {
		return phonenum;
	}




	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	

	
}
