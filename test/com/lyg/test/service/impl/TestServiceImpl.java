package com.lyg.test.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyg.test.dao.TestDao;
import com.lyg.test.entity.User;
import com.lyg.test.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Resource
	TestDao testDao;
	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public void save(User user) {
		testDao.save(user);
//		int i=1/0;    如果出现异常事务会回滚
	}

	@Override
	public User findUser(Serializable id) {
//		org.springframework.dao.InvalidDataAccessApiUsageException: Write operations are not allowed in read-only mode (FlushMode.MANUAL): Turn your Session into FlushMode.COMMIT/AUTO or remove 'readOnly' marker from transaction definition.
//		如果在只读操作中出现更新会出现上述异常
//		save(new User("测试"));
		return testDao.findUser(id);
	}

}
