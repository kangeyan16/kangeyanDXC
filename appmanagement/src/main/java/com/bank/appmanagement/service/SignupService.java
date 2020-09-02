package com.bank.appmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.appmanagement.dao.SignupDao;
import com.bank.appmanagement.dto.SignupEntity;

@Service
public class SignupService 
{
	@Autowired
	private SignupDao signdao;
	
	public SignupEntity addConsumerToDb(SignupEntity signentity)
	{
		return signdao.save(signentity);
	}
	public Optional<SignupEntity> fetchById(String pan)
	{
		return signdao.findById(pan);
	}
}
