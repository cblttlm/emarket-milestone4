package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.DiscountsEntity;
import com.emarket.emarket.repository.DiscountsRepository;

@Service
public class DiscountsBusiness implements DiscountsService{
	@Autowired
	private DiscountsRepository discountsRepository;

	 /**
     * @Title: getDiscountsEntity
     * <p>Description: get discounts information by id
     * </p>
     * @param id
     * @return discounts information list
     * @author: chenbl
     * @version 1.0
     */
	public List<DiscountsEntity> getDiscountsEntity(Integer id) {
		return discountsRepository.getDiscountsEntity(id);
	}

}
