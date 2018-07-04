package com.lyg.core.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

//	增加
	public void save(T entity);
//	更新
	public void update(T entity);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public T findObjectById(Serializable id);
//	查找列表 
	public List<T> findObjects();
}
