package com.lyg.jxc.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class InStock implements Serializable {

	//主键
	private String id;
	//入库单编号
	private String code;
	//入库对应的采购订单
	private PurchaseOrder purchaseOrder;
	//操作的管理员
	private Admin admin;
	//入库日期
	private Timestamp inStockDate;
	//备注
	private String remark;
	
	
	public InStock() {
	}
	public InStock(String id, String code, PurchaseOrder purchaseOrder,
			Admin admin, Timestamp inStockDate, String remark) {
		this.id = id;
		this.code = code;
		this.purchaseOrder = purchaseOrder;
		this.admin = admin;
		this.inStockDate = inStockDate;
		this.remark = remark;
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
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Timestamp getInStockDate() {
		return inStockDate;
	}
	public void setInStockDate(Timestamp inStockDate) {
		this.inStockDate = inStockDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	
}
