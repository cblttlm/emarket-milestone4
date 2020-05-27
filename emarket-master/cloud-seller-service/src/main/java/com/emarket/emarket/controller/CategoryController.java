package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.CategoryEntity;
import com.emarket.emarket.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	 /**
     * @Title: getCategoryList
     * <p>Description: get category information list
     * </p>
     * @param
     * @return category information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping()
	public List<CategoryEntity> getCategoryList(){

		return categoryService.getCategoryList();
	}


}
