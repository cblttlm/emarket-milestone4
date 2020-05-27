package com.emarket.emarket.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.ItemsEntity;
import com.emarket.emarket.service.ItemsService;

@RestController
@RequestMapping("/products")
public class ProductsController {
	@Autowired
	private ItemsService itemsService;
	 /**
     * @Title: getProductsList
     * <p>Description: get product information list by categoryId,startPrice,endPrice
     * </p>
     * @param
     * @return product information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<ItemsEntity> getProductsList(@RequestParam("categoryId") String categoryId,@RequestParam("startPrice") String startPrice,@RequestParam("endPrice") String endPrice){
		return itemsService.getItemsEntity(Integer.parseInt(categoryId),new BigDecimal(startPrice),new BigDecimal(endPrice));
	}
}
