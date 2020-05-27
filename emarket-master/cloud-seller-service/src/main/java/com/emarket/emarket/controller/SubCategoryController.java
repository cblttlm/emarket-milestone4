package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.SubCategoryEntity;
import com.emarket.emarket.service.SubCategoryService;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {
	@Autowired
	private SubCategoryService subcategoryService;

	 /**
     * @Title: getSubCategoryList
     * <p>Description: get subcategory information list
     * </p>
     * @param
     * @return subcategory information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping()
	public List<SubCategoryEntity> getSubCategoryList(){

		return subcategoryService.getSubCategoryList();
	}


}
