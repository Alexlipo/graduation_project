package com.lyg.jxc.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.jxc.dao.AdminDao;
import com.lyg.jxc.entity.Admin;
import com.lyg.jxc.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminDao adminDao;
	
	@Override
	public void save(Admin admin) {
		adminDao.save(admin);
	}

	@Override
	public void update(Admin admin) {
		adminDao.update(admin);
	}

	@Override
	public void delete(Serializable id) {
		adminDao.delete(id);
	}

	@Override
	public Admin findObjectById(Serializable id) {
		return adminDao.findObjectById(id);
	}

	@Override
	public List<Admin> findObjects() {
		return adminDao.findObjects();
	}

	@Override
	public List<Admin> findAdminByAccountAndId(String account, String id) {
		return adminDao.findAdminByAccountAndId(account, id);
	}

	@Override
	public List<Admin> findAdminByAccountAndPwd(String account, String pwd) {
		return adminDao.findAdminByAccountAndPwd(account,pwd);
	}

}
