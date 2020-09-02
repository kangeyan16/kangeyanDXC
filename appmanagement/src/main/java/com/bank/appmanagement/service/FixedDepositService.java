package com.bank.appmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.appmanagement.dao.FixedDepositDao;
import com.bank.appmanagement.dto.FixedDepositEntity;


@Service
public class FixedDepositService 
{
	@Autowired
	private FixedDepositDao fixeddao;
	
	public FixedDepositEntity saveConsumerToDb(FixedDepositEntity fixedentity){
		return fixeddao.save(fixedentity);
	}
	public Optional<FixedDepositEntity> fetchById(int adhar)
	{
		return fixeddao.findById(adhar);
	}
}
