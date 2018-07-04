package com.lyg.jxc.entity;

import java.io.Serializable;

public class Admin implements Serializable {

//	管理员编号
	private String id;
//	登录账号
	private String account;
//	登录密码
	private String pwd;
//	管理员姓名
	private String realName;
//	性别
	private boolean gender;
//	联系方式
	private String tel;
	
	public Admin() {
	}
	public Admin(String id, String account, String pwd, String realName,
		boolean gender, String tel) {
		this.id = id;
		this.account = account;
		this.pwd = pwd;
		this.realName = realName;
		this.gender = gender;
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
