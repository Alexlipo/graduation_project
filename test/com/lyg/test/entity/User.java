package com.lyg.test.entity;

import java.io.Serializable;

public class User implements Serializable {

//	String类型，用uuid生成 避免重复
	private String id;
	private String name;
	
	
	public User() {
	}
	public User(String name) {
		this.name = name;
	}
	public User(String id, String name) {
		this.id = id;
		this.name = name;
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
	
	
}
