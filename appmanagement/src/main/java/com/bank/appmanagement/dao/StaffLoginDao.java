package com.bank.appmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.appmanagement.dto.StaffEntity;

public interface StaffLoginDao extends JpaRepository<StaffEntity, Integer>
{
	public StaffEntity findByPassword(String pass);	
}
