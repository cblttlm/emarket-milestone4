package com.emarket.emarket.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{

	@Modifying
	@Transactional
	@Query(value = "select * from E_CATEGORY",nativeQuery = true)
	public List<CategoryEntity> getCategoryList();
}
