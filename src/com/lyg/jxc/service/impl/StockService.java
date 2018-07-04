package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.StockDao;
import com.lyg.jxc.entity.Stock;

@Service("stockService")
public class StockService implements com.lyg.jxc.service.StockService {

	@Resource
	private StockDao stockDao;
	
	@Override
	public void save(Stock stock) {
		stockDao.save(stock);
	}

	@Override
	public void update(Stock stock) {
		stockDao.update(stock);
	}

	@Override
	public void delete(Serializable id) {
		stockDao.delete(id);
	}

	@Override
	public Stock findObjectById(Serializable id) {
		return stockDao.findObjectById(id);
	}

	@Override
	public List<Stock> findObjects() {
		return stockDao.findObjects();
	}

	@Override
	public List<Stock> findStockByMedicinalId(String id) {
		return stockDao.findStockByMedicinalId(id);
	}

}
