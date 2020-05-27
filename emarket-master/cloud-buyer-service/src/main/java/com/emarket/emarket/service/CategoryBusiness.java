package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.CategoryEntity;
import com.emarket.emarket.repository.CategoryRepository;

@Service
public class CategoryBusiness implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;
	 /**
     * @Title: getManufacturerList
     * <p>Description: get category information list
     * </p>
     * @param
     * @return category information list
     * @author: chenbl
     * @version 1.0
     */
	public List<CategoryEntity> getManufacturerList() {
		return categoryRepository.getManufacturerList();
	}

}
