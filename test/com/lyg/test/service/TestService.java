package com.lyg.test.service;

import java.io.Serializable;

import com.lyg.test.entity.User;

public interface TestService {
	
//	输出
	public void test();
	
//	保存用户
	public void save(User user);
	
//	根据id查询用户
	public User findUser(Serializable id);
}
