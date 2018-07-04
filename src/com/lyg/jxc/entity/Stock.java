package com.lyg.jxc.entity;

import java.io.Serializable;

public class Stock implements Serializable {
	
	private String id;
//	药品
	private Medicinal medicinal;
//	库存数量
	private float amount;
	
	
	public Stock() {
	}
	public Stock(String id, Medicinal medicinal, float amount) {
		this.id = id;
		this.medicinal = medicinal;
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Medicinal getMedicinal() {
		return medicinal;
	}
	public void setMedicinal(Medicinal medicinal) {
		this.medicinal = medicinal;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
