package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.OutStockDao;
import com.lyg.jxc.entity.OutStock;
import com.lyg.jxc.service.OutStockService;

@Service("outStockService")
public class OutStockServiceImpl implements OutStockService {

	@Resource
	private OutStockDao outStockDao;
	
	@Override
	public void save(OutStock outStock) {
		outStockDao.save(outStock);

	}

	@Override
	public OutStock findObjectById(Serializable id) {
		return outStockDao.findObjectById(id);
	}

	@Override
	public List<OutStock> findObjects() {
		return outStockDao.findObjects();
	}

}
