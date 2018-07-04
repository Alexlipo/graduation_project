package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.PurchaseOrder;


public interface PurchaseOrderService {
	
//	增加
	public void save(PurchaseOrder purchaseOrder);
//	更新
	public void update(PurchaseOrder purchaseOrder);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public PurchaseOrder findObjectById(Serializable id);
//	查找列表 
	public List<PurchaseOrder> findObjects();
//	根据状态查找未入库的订单
	public List<PurchaseOrder> findObjectsNotIn();
}
