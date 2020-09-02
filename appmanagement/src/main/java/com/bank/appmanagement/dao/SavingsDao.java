package com.bank.appmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.appmanagement.dto.SavingsEntity;

public interface SavingsDao extends JpaRepository<SavingsEntity, Integer> 
{
}
