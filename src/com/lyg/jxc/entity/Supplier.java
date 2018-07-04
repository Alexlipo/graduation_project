package com.lyg.jxc.entity;

import java.io.Serializable;

public class Supplier implements Serializable {
	
//	供应商主键
	private String id;
//	供应商名称
	private String name;
//	供应商编号
	private String code;
//	供应商联系方式
	private String tel;
//	供应商地址
	private String address;
//	备注
	private String remark;
	
	public Supplier() {
	}
	public Supplier(String id, String name, String code, String tel,
			String address, String remark) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.tel = tel;
		this.address = address;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
