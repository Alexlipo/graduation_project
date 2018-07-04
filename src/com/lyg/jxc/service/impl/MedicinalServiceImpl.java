package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.MedicinalDao;
import com.lyg.jxc.entity.Medicinal;
import com.lyg.jxc.service.MedicinalService;

@Service("medicinalService")
public class MedicinalServiceImpl implements MedicinalService {
	
	@Resource
	private MedicinalDao medicinalDao;

	@Override
	public void save(Medicinal medicinal) {
		medicinalDao.save(medicinal);
	}

	@Override
	public void update(Medicinal medicinal) {
		medicinalDao.update(medicinal);
	}

	@Override
	public void delete(Serializable id) {
		medicinalDao.delete(id);
	}

	@Override
	public Medicinal findObjectById(Serializable id) {
		return medicinalDao.findObjectById(id);
	}

	@Override
	public List<Medicinal> findObjects() {
		return medicinalDao.findObjects();
	}

}
