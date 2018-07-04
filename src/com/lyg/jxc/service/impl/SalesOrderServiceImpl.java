package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.SalesOrderDao;
import com.lyg.jxc.entity.SalesOrder;
import com.lyg.jxc.service.SalesOrderService;

@Service("salesOrderService")
public class SalesOrderServiceImpl implements SalesOrderService {

	@Resource
	private SalesOrderDao salesOrderDao;
	
	@Override
	public void save(SalesOrder SalesOrder) {
		salesOrderDao.save(SalesOrder);
	}

	@Override
	public void update(SalesOrder SalesOrder) {
		salesOrderDao.update(SalesOrder);
	}

	@Override
	public void delete(Serializable id) {
		salesOrderDao.delete(id);
	}

	@Override
	public SalesOrder findObjectById(Serializable id) {
		return salesOrderDao.findObjectById(id);
	}

	@Override
	public List<SalesOrder> findObjects() {
		return salesOrderDao.findObjects();
	}

	@Override
	public List<SalesOrder> findObjectsNotOut() {
		return salesOrderDao.findObjectsNotOut();
	}

}
