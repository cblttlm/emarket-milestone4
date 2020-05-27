package com.emarket.emarket.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.BuyerEntity;

@Repository
public interface BuyerRepository extends JpaRepository<BuyerEntity, Integer>{

	public BuyerEntity findById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "update s_user u set u.conformed='1' where u.id=?",nativeQuery = true)
	public int activeUser(@Param("id")Integer id);
}
