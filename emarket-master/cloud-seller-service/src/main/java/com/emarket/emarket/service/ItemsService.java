package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.ItemsEntity;

public interface ItemsService {


	 /**
     * @Title: getItemsList
     * <p>Description: get item information list by categoryId,subCategoryId
     * </p>
     * @param  categoryId
     * @param  subCategoryId
     * @return item information list
     * @author: chenbl
     * @version 1.0
     */
	public  List<ItemsEntity> getItemsList(Integer categoryId,Integer subCategoryId);

	 /**
     * @Title: saveItems
     * <p>Description: save item information
     * </p>
     * @param itemsEntity
     * @return item information
     * @author: chenbl
     * @version 1.0
     */
	public ItemsEntity saveItems(ItemsEntity itemsEntity);
	 /**
     * @Title: getItemsListBySellerId
     * <p>Description: get item information list by sellerId
     * </p>
     * @param  sellerId
     * @return item information list
     * @author: chenbl
     * @version 1.0
     */
	public  List<ItemsEntity> getItemsListBySellerId(String sellerId);


}
