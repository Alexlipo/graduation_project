package com.lyg.jxc.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.lyg.core.dao.impl.BaseDaoImpl;
import com.lyg.jxc.dao.PurchaseOrderDao;
import com.lyg.jxc.entity.PurchaseOrder;

public class PurchaseOrderDaoImpl extends BaseDaoImpl<PurchaseOrder> implements
		PurchaseOrderDao {

	public List<PurchaseOrder> findObjectsNotIn(){
		String hql = "FROM PurchaseOrder WHERE status = ?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, false);
		return query.list();
	}
}
