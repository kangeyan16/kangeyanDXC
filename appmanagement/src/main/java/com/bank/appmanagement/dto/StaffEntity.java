package com.bank.appmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff_info")
public class StaffEntity 
{
	@Id
	private int id;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StaffEntity(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public StaffEntity() {
		super();
	}
}
