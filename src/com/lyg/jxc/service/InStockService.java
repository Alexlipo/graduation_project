package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.InStock;


public interface InStockService {

//	增加
	public void save(InStock inStock);
//	根据id查找
	public InStock findObjectById(Serializable id);
//	查找列表 
	public List<InStock> findObjects();
}
