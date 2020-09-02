package com.bank.appmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.appmanagement.dto.SignupEntity;

public interface SignupDao extends JpaRepository<SignupEntity, String>
{

}
