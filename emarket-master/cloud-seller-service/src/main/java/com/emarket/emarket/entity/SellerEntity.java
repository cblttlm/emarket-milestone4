package com.emarket.emarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="E_SELLER")
public class SellerEntity {
	private Integer id;
	private String userName;
	private String password;
	private String comName;
	private String gstin;
	private String brief;
	private String comAddr;
	private String website;
	private String email;
	private String contactNum;


	@Id
	@GeneratedValue
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="USER_NAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="COM_NAME")
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}

	@Column(name="GSTIN")
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	@Column(name="BRIEF")
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	@Column(name="COM_ADDR")
	public String getComAddr() {
		return comAddr;
	}
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}
	@Column(name="WEB_SITE")
	public String getWebSite() {
		return website;
	}
	public void setWebSite(String website) {
		this.website = website;
	}
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="CONTACT_NUM")
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
