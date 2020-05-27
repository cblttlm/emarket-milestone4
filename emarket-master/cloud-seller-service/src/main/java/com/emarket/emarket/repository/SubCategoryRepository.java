package com.emarket.emarket.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.SubCategoryEntity;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Integer>{

	@Modifying
	@Transactional
	@Query(value = "select * from E_SUBCATEGORY",nativeQuery = true)
	public List<SubCategoryEntity> getSubCategoryList();
}
