package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.DiscountsEntity;
import com.emarket.emarket.service.DiscountsService;

@RestController
@RequestMapping("/discounts")
public class DiscountsController {
	@Autowired
	private DiscountsService discountsService;
	 /**
     * @Title: getDiscountsEntity
     * <p>Description: get discounts information by id
     * </p>
     * @param id
     * @return discounts information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<DiscountsEntity> getDiscountsEntity(@RequestParam("id") String id){
		return discountsService.getDiscountsEntity(Integer.parseInt(id));
	}
}
