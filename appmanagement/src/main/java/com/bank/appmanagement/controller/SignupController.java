package com.bank.appmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.appmanagement.dto.SignupEntity;
import com.bank.appmanagement.service.SignupService;

@RestController
public class SignupController 
{
	@Autowired
	private SignupService signservice;
	
	@PostMapping("/addSignUpDetails")
	@CrossOrigin(origins = "http://localhost:4200")
	public SignupEntity addData(@RequestBody SignupEntity signentity)
	{
		return signservice.addConsumerToDb(signentity);
	}
	@GetMapping("/showSignUpDetailsByid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public SignupEntity fetchById(@PathVariable String pan)
	{
		return signservice.fetchById(pan).get();
	}
}
