package com.emarket.emarket.model;

public class SellerModel {
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

	private int count;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getComAddr() {
		return comAddr;
	}

	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

}
