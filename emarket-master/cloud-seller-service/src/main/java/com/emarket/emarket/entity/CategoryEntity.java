package com.emarket.emarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="E_CATEGORY")
public class CategoryEntity {
	private Integer categoryId;
	private String categoryName;
	private String briefDetails;


	@Id
	@GeneratedValue
	@Column(name="CATEGORYID")
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	@Column(name="CATEGORYNAME")
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Column(name="BRIEF_DETAILS")
	public String getBriefdetails() {
		return briefDetails;
	}
	public void setBriefdetails(String briefdetails) {
		this.briefDetails = briefdetails;
	}
}
