package com.emarket.emarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	public UserEntity findById(Integer id);

}
