package com.lyg.test.dao;

import java.io.Serializable;

import com.lyg.test.entity.User;

public interface TestDao {

//	保存用户
	public void save(User user);
	
//	根据id查询用户
	public User findUser(Serializable id);
}
