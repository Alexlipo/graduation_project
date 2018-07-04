package com.lyg.jxc.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class OutStock implements Serializable {

	//主键
	private String id;
	//出库单编号
	private String code;
	//对应的销售单
	private SalesOrder salesOrder;
	//操作的管理员
	private Admin admin;
	//出库日期
	private Timestamp outStockDate;
	//备注
	private String remark;
		
		
	public OutStock() {
	}
	
	public OutStock(String id, String code, SalesOrder salesOrder, Admin admin,
			Timestamp outStockDate, String remark) {
		this.id = id;
		this.code = code;
		this.salesOrder = salesOrder;
		this.admin = admin;
		this.outStockDate = outStockDate;
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
	public Timestamp getOutStockDate() {
		return outStockDate;
	}
	public void setOutStockDate(Timestamp outStockDate) {
		this.outStockDate = outStockDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}
		
}
