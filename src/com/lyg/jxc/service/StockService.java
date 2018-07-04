package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.Stock;

public interface StockService {

//	增加库存信息
	public void save(Stock stock);
//	更新库存信息
	public void update(Stock stock);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public Stock findObjectById(Serializable id);
//	查找列表 
	public List<Stock> findObjects();
//	根据药品id查找
	public List<Stock> findStockByMedicinalId(String id);
}
