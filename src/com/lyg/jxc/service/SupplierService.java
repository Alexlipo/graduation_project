package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.Supplier;

public interface SupplierService {

//	增加
	public void save(Supplier supplier);
//	更新
	public void update(Supplier supplier);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public Supplier findObjectById(Serializable id);
//	查找列表 
	public List<Supplier> findObjects();
}

