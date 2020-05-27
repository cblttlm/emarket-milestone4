package com.emarket.emarket.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.PurchaseHistoryEntity;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistoryEntity, Integer>{

	public PurchaseHistoryEntity findById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "select * from E_PURCHASEHISTORY u where u.BUYERID=?1",nativeQuery = true)
	public List<PurchaseHistoryEntity> getPurchaseHistoryEntityList(@Param("buyid")String buyid);
}
