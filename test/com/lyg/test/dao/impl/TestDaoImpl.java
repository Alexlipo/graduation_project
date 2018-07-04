package com.lyg.test.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lyg.test.dao.TestDao;
import com.lyg.test.entity.User;
//HibernateDaoSupport类维护了一个sessionFactory变量也有一个setSessionFactory方法 但是是final修饰的，所以不能用注解方式注入
public class TestDaoImpl extends HibernateDaoSupport implements TestDao {
	
	@Override
	public void save(User user) {
//		HibernateTemplate有一个getSessionFactory()方法
		getHibernateTemplate().save(user);
	}

	@Override
	public User findUser(Serializable id) {
		return getHibernateTemplate().get(User.class, id);
	}

}
