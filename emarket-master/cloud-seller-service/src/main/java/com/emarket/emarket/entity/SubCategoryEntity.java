package com.emarket.emarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="E_SUBCATEGORY")
public class SubCategoryEntity {
	private Integer subCategoryId;
	private Integer categoryId;
	private String subCategoryName;
	private String briefDetails;
	private Float gst;

	@Id
	@GeneratedValue
	@Column(name="SUBCATEGORYID")
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subcategoryId) {
		this.subCategoryId = subcategoryId;
	}

	@Column(name="CATEGORYID")
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	@Column(name="SUBCATEGORYNAME")
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subcategoryName) {
		this.subCategoryName = subcategoryName;
	}
	@Column(name="BRIEF_DETAILS")
	public String getBriefdetails() {
		return briefDetails;
	}
	public void setBriefdetails(String briefdetails) {
		this.briefDetails = briefdetails;
	}
	public Float getGst() {
		return gst;
	}
	public void setGst(Float gst) {
		this.gst = gst;
	}
}
