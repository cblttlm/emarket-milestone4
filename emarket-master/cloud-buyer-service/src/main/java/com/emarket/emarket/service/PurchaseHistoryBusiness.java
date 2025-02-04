package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.OrderEntity;
import com.emarket.emarket.entity.PurchaseHistoryEntity;
import com.emarket.emarket.repository.PurchaseHistoryRepository;

@Service
public class PurchaseHistoryBusiness implements PurchaseHistoryService{
	@Autowired
	private PurchaseHistoryRepository purchaseHistoryRepository;
	 /**
     * @Title: getPurchaseHistoryList
     * <p>Description: get purchase history list by buyid
     * </p>
     * @param
     * @return purchase history list
     * @author: chenbl
     * @version 1.0
     */

	public List<PurchaseHistoryEntity> getPurchaseHistoryEntityList(String buyId) {
		return purchaseHistoryRepository.getPurchaseHistoryEntityList(buyId);
	}
	 /**
     * @Title: update
     * <p>Description: save purchase history information
     * </p>
     * @param purchasehistory
     * @return  purchase history information
     * @author: chenbl
     * @version 1.0
     */
	public PurchaseHistoryEntity update(PurchaseHistoryEntity purchaseHistoryEntity) {
		return purchaseHistoryRepository.save(purchaseHistoryEntity);
	}

	 /**
     * @Title: savePurchaseHistory
     * <p>Description: save PurchaseHistory information
     * </p>
     * @param purchaseHistoryEntity
     * @return
     * @author: chenbl
     * @version 1.0
     */
	public void savePurchaseHistory(PurchaseHistoryEntity purchaseHistoryEntity) {
		purchaseHistoryRepository.saveAndFlush(purchaseHistoryEntity);
	}

}
