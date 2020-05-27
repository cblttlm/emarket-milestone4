package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.DiscountsEntity;

public interface DiscountsService {


	 /**
     * @Title: getDiscountsEntity
     * <p>Description: get discounts information by id
     * </p>
     * @param id
     * @return discounts information list
     * @author: chenbl
     * @version 1.0
     */
	public  List<DiscountsEntity> getDiscountsEntity(Integer id);


}
