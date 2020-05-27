package com.emarket.emarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{

	public AdminEntity findById(Integer id);

}