package com.bank.appmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.appmanagement.dao.ReoccurringDepositDao;
import com.bank.appmanagement.dto.ReoccurringDepositEntity;

@Service
public class ReoccurringDepositService 
{
	@Autowired
	private ReoccurringDepositDao recdao;
	
	public ReoccurringDepositEntity saveConsumerToDb(ReoccurringDepositEntity recentity)
	{
		return recdao.save(recentity);
	}
	public Optional<ReoccurringDepositEntity> fetchById(int adhar)
	{
		return recdao.findById(adhar);
	}
}
