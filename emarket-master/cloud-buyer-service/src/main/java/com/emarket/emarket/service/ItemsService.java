package com.emarket.emarket.service;

import java.math.BigDecimal;
import java.util.List;

import com.emarket.emarket.entity.ItemsEntity;

public interface ItemsService {

	 /**
     * @Title: getProductsList
     * <p>Description: get product information list by categoryId,startPrice,endPrice
     * </p>
     * @param
     * @return product information list
     * @author: chenbl
     * @version 1.0
     */
	public  List<ItemsEntity> getItemsEntity(Integer id,BigDecimal startPrice,BigDecimal endPrice);


}
