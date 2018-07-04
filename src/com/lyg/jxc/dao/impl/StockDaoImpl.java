package com.lyg.jxc.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.lyg.core.dao.impl.BaseDaoImpl;
import com.lyg.jxc.dao.StockDao;
import com.lyg.jxc.entity.Stock;

public class StockDaoImpl extends BaseDaoImpl<Stock> implements StockDao {

	@Override
	public List<Stock> findStockByMedicinalId(String id) {
		String hql = "FROM Stock WHERE medicinal.id = ?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		return query.list();
	}


}
