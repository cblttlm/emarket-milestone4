package com.emarket.emarket.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.ItemsEntity;
import com.emarket.emarket.repository.ItemsRepository;

@Service
public class ItemsBusiness implements ItemsService{
	@Autowired
	private ItemsRepository itemsRepository;

	 /**
     * @Title: getItemsEntity
     * <p>Description: get product information list by categoryId,startPrice,endPrice
     * </p>
     * @param
     * @return product information list
     * @author: chenbl
     * @version 1.0
     */
	public List<ItemsEntity> getItemsEntity(Integer categoryId,BigDecimal startPrice,BigDecimal endPrice) {
		return itemsRepository.getItemsEntity(categoryId,startPrice,endPrice);
	}

}
