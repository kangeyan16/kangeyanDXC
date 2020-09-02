package com.bank.appmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.appmanagement.dao.SavingsDao;
import com.bank.appmanagement.dto.SavingsEntity;

@Service
public class SavingsService 
{
	@Autowired
	private SavingsDao savingsdao;
	
	public SavingsEntity saveConsumer(SavingsEntity saveentity)
	{
		return savingsdao.save(saveentity);
	}
	public Optional<SavingsEntity> fetchById(int adhar)
	{
		return savingsdao.findById(adhar);
	}
}
