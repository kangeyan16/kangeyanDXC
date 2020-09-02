package com.bank.appmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.appmanagement.dto.ReoccurringDepositEntity;
import com.bank.appmanagement.service.ReoccurringDepositService;

@RestController
public class ReoccurringDepositController 
{
	@Autowired
	private ReoccurringDepositService recservice;
	
	@PostMapping("/addconsumerrec")
	public ReoccurringDepositEntity saveConsumer(@RequestBody ReoccurringDepositEntity recentity)
	{
		return recservice.saveConsumerToDb(recentity);
	}
	@GetMapping("/recamount")
	public ReoccurringDepositEntity fetchRecAmount(int adhar)
	{
		return recservice.fetchById(adhar).get();
	}
	
}
