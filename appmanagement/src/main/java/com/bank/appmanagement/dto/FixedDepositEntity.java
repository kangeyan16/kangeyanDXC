package com.bank.appmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fixed_deposit_account")
public class FixedDepositEntity 
{
	@Id
	private String adhar;
	private String first_name;
	private String last_name;
	private String nomine_name;
	private int time;
	private int amount;
	public FixedDepositEntity() {
		super();
	}
	public FixedDepositEntity(String adhar, String first_name, String last_name, String nomine_name, int time,
			int amount) {
		super();
		this.adhar = adhar;
		this.first_name = first_name;
		this.last_name = last_name;
		this.nomine_name = nomine_name;
		this.time = time;
		this.amount = amount;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
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
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
