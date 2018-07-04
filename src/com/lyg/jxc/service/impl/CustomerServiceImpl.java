package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.CustomerDao;
import com.lyg.jxc.entity.Customer;
import com.lyg.jxc.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Resource
	private CustomerDao customerDao;
	
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
	}

	@Override
	public void delete(Serializable id) {
		customerDao.delete(id);
	}

	@Override
	public Customer findObjectById(Serializable id) {
		return customerDao.findObjectById(id);
	}

	@Override
	public List<Customer> findObjects() {
		return customerDao.findObjects();
	}

}
