package com.mkyong.customer.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer{

	@Id @GeneratedValue
	@Column(name = "CUSTOMER_ID")
	public long customerId;

	@Column(name = "NAME")
	public String name;

	@Column(name = "ADDRESS")
	public String address;

	@Column(name = "CREATED_DATE")
	public Date createdDate;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}