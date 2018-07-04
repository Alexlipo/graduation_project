package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.Customer;

public interface CustomerService {

//	增加
	public void save(Customer customer);
//	更新
	public void update(Customer customer);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public Customer findObjectById(Serializable id);
//	查找列表 
	public List<Customer> findObjects();
}
