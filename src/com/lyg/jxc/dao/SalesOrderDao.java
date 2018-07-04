package com.lyg.jxc.dao;

import java.util.List;

import com.lyg.core.dao.BaseDao;
import com.lyg.jxc.entity.SalesOrder;

public interface SalesOrderDao extends BaseDao<SalesOrder> {

	public List<SalesOrder> findObjectsNotOut();
}
