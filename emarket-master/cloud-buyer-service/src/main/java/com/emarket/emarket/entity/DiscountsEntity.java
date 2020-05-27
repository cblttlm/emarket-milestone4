package com.emarket.emarket.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="E_DISCOUNTS")
public class DiscountsEntity {
	private Integer id;
	private Integer discountCode;
	private BigDecimal percentage;
	private Date start_date;
	private Date end_date;
	private String description;

	@Id
	@GeneratedValue
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="DISCOUNTCODE")
	public Integer getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(Integer discountCode) {
		this.discountCode = discountCode;
	}
	@Column(name="PERCENTAGE")
	public BigDecimal getPercentage() {
		return percentage;
	}
	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	@Column(name="START_DATE")
	public Date getStartDate() {
		return start_date;
	}
	public void setStartDate(Date start_date) {
		this.start_date = start_date;
	}
	@Column(name="END_DATE")
	public Date getEndDate() {
		return end_date;
	}
	public void setEndDate(Date end_date) {
		this.end_date = end_date;
	}
	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
