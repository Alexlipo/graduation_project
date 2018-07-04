package com.lyg.jxc.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.lyg.core.dao.impl.BaseDaoImpl;
import com.lyg.jxc.dao.SalesOrderDao;
import com.lyg.jxc.entity.SalesOrder;

public class SalesOrderDaoImpl extends BaseDaoImpl<SalesOrder> implements
		SalesOrderDao {
	public List<SalesOrder> findObjectsNotOut(){
		String hql = "FROM SalesOrder WHERE status = ?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, false);
		return query.list();
	}

}