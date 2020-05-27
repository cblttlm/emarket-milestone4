package com.emarket.emarket.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="E_ITEMS")
public class ItemsEntity {
	private Integer id;
	private Integer categoryId;
	private Integer subCategoryId;
	private BigDecimal price;
	private String itemName;
	private String description;
	private Integer stockNumber;
	private String remarks;

	@Id
	@GeneratedValue
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="CATEGORYID")
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	@Column(name="SUBCATEGORYID")
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Column(name="PRICE")
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Column(name="ITEMNAME")
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Column(name="DESCRIPTION")
	public String getDiscription() {
		return description;
	}
	public void setDiscription(String description) {
		this.description = description;
	}
	@Column(name="STOCKNUMBER")
	public Integer getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(Integer stockNumber) {
		this.stockNumber = stockNumber;
	}
	@Column(name="REMARKS")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
