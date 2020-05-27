package com.emarket.emarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTIONS")
public class TransactionsEntity {
	private Integer id;
	private Integer buyerId;
	private Integer sellerId;
	private Integer transactionId;
	private String  transactionType;
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
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	@Column(name="SELLERID")
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	@Column(name="TRANSACTIONID")
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	@Column(name="TRANSACTION_TYPE")
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Column(name="REMARKS")
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
