package com.ssm.model;

import java.util.Date;

import com.ssm.util.BaseData;

public class Staff extends BaseData{

	Integer id;
	String loginName;
	String password;
	Date createdTime;
	Date updateTime;
	
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(Integer id, String loginName, String password, Date createdTime, Date updateTime) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.createdTime = createdTime;
		this.updateTime = updateTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
