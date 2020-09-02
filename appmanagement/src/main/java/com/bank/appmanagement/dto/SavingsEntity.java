package com.bank.appmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "savings_account")
public class SavingsEntity 
{
	@Id
	private int adhar;
	private String first_name;
	private String last_name;
	private String nomine_name;
	private int amount;
	public SavingsEntity() {
		super();
	}
	public SavingsEntity(int adhar, String first_name, String last_name, String nomine_name, int amount) {
		super();
		this.adhar = adhar;
		this.first_name = first_name;
		this.last_name = last_name;
		this.nomine_name = nomine_name;
		this.amount = amount;
	}
	public int getAdhar() {
		return adhar;
	}
	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getNomine_name() {
		return nomine_name;
	}
	public void setNomine_name(String nomine_name) {
		this.nomine_name = nomine_name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
