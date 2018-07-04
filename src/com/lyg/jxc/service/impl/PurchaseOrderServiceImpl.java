package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.PurchaseOrderDao;
import com.lyg.jxc.entity.PurchaseOrder;
import com.lyg.jxc.service.PurchaseOrderService;

@Service("purchaseOrderService")
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
	
	@Resource
	private PurchaseOrderDao purchaseOrderDao;

	@Override
	public void save(PurchaseOrder purchaseOrder) {
		purchaseOrderDao.save(purchaseOrder);
	}

	@Override
	public void update(PurchaseOrder purchaseOrder) {
		purchaseOrderDao.update(purchaseOrder);

	}

	@Override
	public void delete(Serializable id) {
		purchaseOrderDao.delete(id);

	}

	@Override
	public PurchaseOrder findObjectById(Serializable id) {
		return purchaseOrderDao.findObjectById(id);
	}

	@Override
	public List<PurchaseOrder> findObjects() {
		return purchaseOrderDao.findObjects();
	}
	
	@Override
	public List<PurchaseOrder> findObjectsNotIn(){
		return purchaseOrderDao.findObjectsNotIn();
	}

}
