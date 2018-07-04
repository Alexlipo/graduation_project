package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.Medicinal;

public interface MedicinalService {

//	增加
	public void save(Medicinal medicinal);
//	更新
	public void update(Medicinal medicinal);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public Medicinal findObjectById(Serializable id);
//	查找列表 
	public List<Medicinal> findObjects();
}
