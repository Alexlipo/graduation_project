package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.OutStock;


public interface OutStockService {

//	增加
	public void save(OutStock outStock);
//	根据id查找
	public OutStock findObjectById(Serializable id);
//	查找列表 
	public List<OutStock> findObjects();
}
