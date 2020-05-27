package com.emarket.emarket.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.ItemsEntity;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsEntity, Integer>{

	public ItemsEntity findById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "select * from E_ITEMS u where u.CATEGORYID = ?1 and  u.SUBCATEGORYID >= ?2",nativeQuery = true)
	public List<ItemsEntity> getItemsList(@Param("categoryId")Integer categoryId,@Param("subcategoryId")Integer subcategoryId);

	@Modifying
	@Transactional
	@Query(value = "select * from E_ITEMS u where u.SELLERID = ?1",nativeQuery = true)
	public List<ItemsEntity> getItemsListBySellerId(@Param("sellerId")String sellerId);
}
