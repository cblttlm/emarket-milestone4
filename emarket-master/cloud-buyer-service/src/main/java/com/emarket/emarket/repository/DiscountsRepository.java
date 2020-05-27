package com.emarket.emarket.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.DiscountsEntity;

@Repository
public interface DiscountsRepository extends JpaRepository<DiscountsEntity, Integer>{

	public DiscountsEntity findById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "select * from E_DISCOUNTS u where u.id=?",nativeQuery = true)
	public List<DiscountsEntity> getDiscountsEntity(@Param("id")Integer id);
}
