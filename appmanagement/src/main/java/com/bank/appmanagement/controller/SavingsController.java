package com.bank.appmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.appmanagement.dto.SavingsEntity;
import com.bank.appmanagement.service.SavingsService;

@RestController

public class SavingsController 
{
	@Autowired
	private SavingsService savingsservice;
	
	@PostMapping("/addsavings")
	public SavingsEntity saveConsumer(@RequestBody SavingsEntity savingsentity) throws Exception
	{
		return savingsservice.saveConsumer(savingsentity);
	}
	
	@GetMapping("/getsavings/{id}")
	public SavingsEntity fetchById(@PathVariable int adhar)
	{
		return savingsservice.fetchById(adhar).get();
	}
}
