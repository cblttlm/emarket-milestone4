package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.SubCategoryEntity;
import com.emarket.emarket.repository.SubCategoryRepository;

@Service
public class SunCategoryBusiness implements SubCategoryService{
	@Autowired
	private SubCategoryRepository subcategoryRepository;

	 /**
     * @Title: getSubCategoryList
     * <p>Description: get subcategory information list
     * </p>
     * @param
     * @return subcategory information list
     * @author: chenbl
     * @version 1.0
     */
	public List<SubCategoryEntity> getSubCategoryList() {
		return subcategoryRepository.getSubCategoryList();
	}

}
