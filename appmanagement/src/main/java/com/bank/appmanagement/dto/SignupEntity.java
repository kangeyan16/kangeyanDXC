package com.bank.appmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signup_info")
public class SignupEntity 
{
	@Id
	private String pan;
	private String name;
	private String address;
	private String email;
	private String phone;
	private String dob;
	public SignupEntity() {
		super();
	}
	public SignupEntity(String pan, String name, String address, String email, String phone, String dob) {
		super();
		this.pan = pan;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
