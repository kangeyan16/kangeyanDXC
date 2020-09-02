package com.bank.appmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.appmanagement.dto.FixedDepositEntity;

@Repository
public interface FixedDepositDao extends JpaRepository<FixedDepositEntity, Integer>
{
}
