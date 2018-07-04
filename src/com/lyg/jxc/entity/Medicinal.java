package com.lyg.jxc.entity;

import java.io.Serializable;

public class Medicinal implements Serializable {

//	药品主键
	private String id;
//	药品名称
	private String name;
//	药品编号
	private String code;
//	药物类型
	private String type;
//	组成成分
	private String component;
//	药物功效
	private String function;
//	生产厂家
	private String producer;
//	备注
	private String remark;
	
	
	public Medicinal() {
	}
	public Medicinal(String id, String name, String code, String type, Float store,
		String component, String function, String producer, Float buyPrice,
		Float salePrice, String remark) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.type = type;
		this.component = component;
		this.function = function;
		this.producer = producer;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
