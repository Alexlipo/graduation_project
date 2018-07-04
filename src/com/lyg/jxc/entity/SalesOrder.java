package com.lyg.jxc.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class SalesOrder implements Serializable {

//	订单主键
	private String id;
//	订单编码
	private String code;
//	客户
	private Customer customer;
//	药品
	private Medicinal medicinal;
//	数量
	private Float quantity;
//	单价
	private Float unit_price;
//	总金额
	private Float total_Money;
//	下单日期
	private Timestamp order_date;
//	收货地址
	private String address;
//	运输方式
	private String transportation;
//	发货日期
	private Date deliver_date;
//	备注
	private String remark;
//	是否出库
	private boolean status;
	
	public SalesOrder() {
	}
	
	public SalesOrder(String id, String code, Customer customer,
			Medicinal medicinal, Float quantity, Float unit_price,
			Float total_Money, Timestamp order_date, String address,
			String transportation, Date deliver_date, String remark,
			boolean status) {
		this.id = id;
		this.code = code;
		this.customer = customer;
		this.medicinal = medicinal;
		this.quantity = quantity;
		this.unit_price = unit_price;
		this.total_Money = total_Money;
		this.order_date = order_date;
		this.address = address;
		this.transportation = transportation;
		this.deliver_date = deliver_date;
		this.remark = remark;
		this.status = status;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Medicinal getMedicinal() {
		return medicinal;
	}
	public void setMedicinal(Medicinal medicinal) {
		this.medicinal = medicinal;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public Float getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(Float unit_price) {
		this.unit_price = unit_price;
	}
	public Float getTotal_Money() {
		return total_Money;
	}
	public void setTotal_Money(Float total_Money) {
		this.total_Money = total_Money;
	}
	public Timestamp getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public Date getDeliver_date() {
		return deliver_date;
	}
	public void setDeliver_date(Date deliver_date) {
		this.deliver_date = deliver_date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
