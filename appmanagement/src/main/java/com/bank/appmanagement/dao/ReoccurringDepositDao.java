package com.bank.appmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.appmanagement.dto.ReoccurringDepositEntity;

public interface ReoccurringDepositDao extends JpaRepository<ReoccurringDepositEntity, Integer> 
{

	
}
