package com.lyg.jxc.service;

import java.io.Serializable;
import java.util.List;

import com.lyg.jxc.entity.Admin;


public interface AdminService {
	
//	增加
	public void save(Admin admin);
//	更新
	public void update(Admin admin);
//	根据id删除
	public void delete(Serializable id);
//	根据id查找
	public Admin findObjectById(Serializable id);
//	查找列表 
	public List<Admin> findObjects();
	/**
	 * 根据帐号和管理员id查询管理员
	 * @param id 用户ID
	 * @param account 用户帐号
	 * @return 用户列表
	 */
	public List<Admin> findAdminByAccountAndId(String account, String id);
	//根据管理员的帐号和密码查询管理员列表
	public List<Admin> findAdminByAccountAndPwd(String account, String pwd);
}
