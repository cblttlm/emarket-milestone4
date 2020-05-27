package com.emarket.emarket.repository;

import java.math.BigDecimal;
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
	@Query(value = "select * from E_ITEMS u where u.CATEGORYID = ?1 and  u.PRICE >= ?2 and u.PRICE <= ?3",nativeQuery = true)
	public List<ItemsEntity> getItemsEntity(@Param("categoryId")Integer categoryId,@Param("startPrice")BigDecimal startPrice,@Param("endPrice")BigDecimal endPrice);
}
