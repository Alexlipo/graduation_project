package com.lyg.jxc.entity;

import java.io.Serializable;

public class Customer implements Serializable {
	
//	客户主键
	private String id;
//	客户名称
	private String name;
//	客户编号
	private String code;
//	联系方式
	private String tel;
//	客户地址
	private String address;
//	邮编号码
	private String postcode;
//	邮箱地址
	private String email;
//	备注
	private String remark;
	
	
	public Customer() {
	}
	public Customer(String id, String name, String code, String tel,
			String address, String postcode, String email, String remark) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.tel = tel;
		this.address = address;
		this.postcode = postcode;
		this.email = email;
		this.remark = remark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
