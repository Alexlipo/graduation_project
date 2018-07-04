package com.lyg.jxc.dao;

import java.util.List;

import com.lyg.core.dao.BaseDao;
import com.lyg.jxc.entity.Admin;

public interface AdminDao extends BaseDao<Admin> {
	
	public List<Admin> findAdminByAccountAndId(String account, String id);

	public List<Admin> findAdminByAccountAndPwd(String account, String pwd);

}
