package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.PurchaseHistoryEntity;

public interface PurchaseHistoryService {

	 /**
     * @Title: getPurchaseHistoryList
     * <p>Description: get purchase history list by buyid
     * </p>
     * @param
     * @return purchase history list
     * @author: chenbl
     * @version 1.0
     */
	public List<PurchaseHistoryEntity> getPurchaseHistoryEntityList(String buyId);
	 /**
     * @Title: update
     * <p>Description: save purchase history information
     * </p>
     * @param purchasehistory
     * @return  purchase history information
     * @author: chenbl
     * @version 1.0
     */
	public PurchaseHistoryEntity update(PurchaseHistoryEntity purchaseHistoryEntity);
	 /**
     * @Title: savePurchaseHistory
     * <p>Description: save purchase history information
     * </p>
     * @param purchaseHistoryEntity
     * @return
     * @author: chenbl
     * @version 1.0
     */

	public void savePurchaseHistory(PurchaseHistoryEntity purchaseHistoryEntity) ;


}
