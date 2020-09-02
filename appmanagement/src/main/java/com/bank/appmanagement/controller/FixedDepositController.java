package com.bank.appmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.appmanagement.dto.FixedDepositEntity;
import com.bank.appmanagement.service.FixedDepositService;

@RestController
public class FixedDepositController 
{
	@Autowired
	private FixedDepositService fixedservice;
	@PostMapping("/addconsumerfixed")
	public FixedDepositEntity saveConsumer(@RequestBody FixedDepositEntity fixedentity){
		return fixedservice.saveConsumerToDb(fixedentity); 
	}
	@GetMapping("/fixedamount")
	public FixedDepositEntity fetchByID(int adhar)
	{
		return fixedservice.fetchById(adhar).get();
	}
}