package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.InStockDao;
import com.lyg.jxc.entity.InStock;
import com.lyg.jxc.service.InStockService;

@Service("inStockService")
public class InStockServiceImpl implements InStockService {

	@Resource
	private InStockDao inStockDao;
	
	@Override
	public void save(InStock inStock) {
		inStockDao.save(inStock);
	}

	@Override
	public InStock findObjectById(Serializable id) {
		return inStockDao.findObjectById(id);
	}

	@Override
	public List<InStock> findObjects() {
		return inStockDao.findObjects();
	}

}
