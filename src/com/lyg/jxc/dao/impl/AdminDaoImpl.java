package com.lyg.jxc.dao.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;

import com.lyg.core.dao.impl.BaseDaoImpl;
import com.lyg.jxc.dao.AdminDao;
import com.lyg.jxc.entity.Admin;

public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {

	@Override
	public List<Admin> findAdminByAccountAndId(String account, String id) {
		String hql = "FROM Admin WHERE account = ?";
		if(StringUtils.isNotBlank(id)){
			hql += " AND id!=?";
		}
		Query query = getSession().createQuery(hql);
		query.setParameter(0, account);
		if(StringUtils.isNotBlank(id)){
			query.setParameter(1, id);
		}
		
		return query.list();
	}

	@Override
	public List<Admin> findAdminByAccountAndPwd(String account, String pwd) {
		Query query = getSession().createQuery("FROM Admin WHERE account=? AND pwd=?");
		query.setParameter(0, account);
		query.setParameter(1, pwd);
		return query.list();
	}


}
