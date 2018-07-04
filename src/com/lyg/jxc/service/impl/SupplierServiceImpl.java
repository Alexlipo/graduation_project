package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.SupplierDao;
import com.lyg.jxc.entity.Supplier;
import com.lyg.jxc.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {

	@Resource
	private SupplierDao supplierDao;
	
	@Override
	public void save(Supplier supplier) {
		supplierDao.save(supplier);
	}

	@Override
	public void update(Supplier supplier) {
		supplierDao.update(supplier);
	}

	@Override
	public void delete(Serializable id) {
		supplierDao.delete(id);
	}

	@Override
	public Supplier findObjectById(Serializable id) {
		return supplierDao.findObjectById(id);
	}

	@Override
	public List<Supplier> findObjects() {
		return supplierDao.findObjects();
	}

}
