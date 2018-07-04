package com.lyg.jxc.dao;

import java.util.List;

import com.lyg.core.dao.BaseDao;
import com.lyg.jxc.entity.PurchaseOrder;

public interface PurchaseOrderDao extends BaseDao<PurchaseOrder> {

	public List<PurchaseOrder> findObjectsNotIn();
}
