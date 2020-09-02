package com.bank.appmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.appmanagement.dto.StaffEntity;
import com.bank.appmanagement.service.StaffLoginService;

@RestController
public class StaffLoginController 
{
	@Autowired
	private StaffLoginService staffservice;
	
	@PostMapping("/addstaff")
	public StaffEntity addStaffToDb(@RequestBody StaffEntity staffentity)
	{
		return staffservice.addStaff(staffentity);
	}
	@PostMapping("/loginstaff")
	public StaffEntity fetchStaff(@RequestBody StaffEntity staffentity) throws Exception
	{
		String temppass = staffentity.getPassword();
		StaffEntity sObject = null;
		if(temppass != null)
		{
			sObject = staffservice.fetchStaffByPassword(temppass);
		}
		if(sObject == null)
		{
			throw new Exception("User Does not Exists");
		}
		return sObject;
	}
}
