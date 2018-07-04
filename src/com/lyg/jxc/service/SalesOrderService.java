package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.SalesOrder;

public interface SalesOrderService {

//	增加
	public void save(SalesOrder SalesOrder);
//	更新
	public void update(SalesOrder SalesOrder);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public SalesOrder findObjectById(Serializable id);
//	查找列表 
	public List<SalesOrder> findObjects();
//	查找所有未出库的销售单
	public List<SalesOrder> findObjectsNotOut();
}
