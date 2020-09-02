package com.bank.appmanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.appmanagement.dao.StaffLoginDao;
import com.bank.appmanagement.dto.StaffEntity;

@Service
public class StaffLoginService 
{
	@Autowired
	private StaffLoginDao staffdao;
	public StaffEntity addStaff(StaffEntity staffentity)
	{
		return staffdao.save(staffentity);
	}
	public StaffEntity fetchStaffByPassword(String pass)
	{
		return staffdao.findByPassword(pass);
	}
}
