package com.emarket.emarket.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="E_ORDER")
public class OrderEntity {
	private Integer id;
	private String buyerId;
	private String sellerId;
	private String transactionId;
	private String itemname;
	private BigDecimal price;
	private BigDecimal totalprice;
	private String numberOfItems;
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
	@Column(name="BUYERID")
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	@Column(name="SELLERID")
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	@Column(name="TRANSACTIONID")
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	@Column(name="ITEMNAME")
	public String getItemName() {
		return itemname;
	}
	public void setItemName(String itemname) {
		this.itemname = itemname;
	}
	@Column(name="NUMBEROFITEMS")
	public String getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(String numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	@Column(name="REMARKS")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
