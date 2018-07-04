package com.lyg.jxc.dao;

import java.util.List;

import com.lyg.core.dao.BaseDao;
import com.lyg.jxc.entity.Stock;

public interface StockDao extends BaseDao<Stock> {

	public List<Stock> findStockByMedicinalId(String id);
}
