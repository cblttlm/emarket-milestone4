package com.emarket.emarket.auth.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.auth.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	public UserEntity findById(Integer id);

	public UserEntity findUserByUserName(String userName);

	@Modifying
	@Transactional
	@Query(value = "update E_USER u set u.conformed='1' where u.id=?",nativeQuery = true)
	public int activeUser(@Param("id")Integer id);
}
