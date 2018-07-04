package com.lyg.core.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lyg.core.dao.BaseDao;

//实现通用的增删改查方法
public abstract class BaseDaoImpl<T> extends HibernateDaoSupport implements
		BaseDao<T> {

	Class<T> clazz;
//	通过反射在实现类实例化的时候得到clazz
	public BaseDaoImpl(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();//得到BaseDaoImpl<Admin>
		clazz=(Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public void save(T entity) {
		getHibernateTemplate().save(entity);

	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().update(entity);

	}

	@Override
	public void delete(Serializable id) {
		getHibernateTemplate().delete(findObjectById(id));

	}

	@Override
	public T findObjectById(Serializable id) {
		return getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List<T> findObjects() {
//		hibernateDaoSupport类中有一个getsession()方法
		Query query = getSession().createQuery("FROM "+clazz.getSimpleName());
		return query.list();
	}

}
