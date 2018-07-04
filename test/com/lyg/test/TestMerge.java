package com.lyg.test;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyg.test.entity.User;
import com.lyg.test.service.TestService;

public class TestMerge {

	ClassPathXmlApplicationContext ctx;
	
//	加载application.xml文件
	@Before
	public void loadCtx() {
		ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
	}
	
	@Test
	public void testSpring() {
//		测试spring加载、调用bean的方法
		TestService ts = (TestService)ctx.getBean("testService");
		ts.test();
	}
//	测试hibernate连接数据库
	@Test
	public void testHibernate() {
		SessionFactory sf=(SessionFactory) ctx.getBean("sessionFactory");
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
//		保存用户
		session.save(new User("用户1"));
		transaction.commit();
		session.close();
	}
	
	@Test
	public void testServiceAndDao() {
		TestService ts = (TestService)ctx.getBean("testService");
//		ts.save(new User("用户2"));
		System.out.println(ts.findUser("4028ca16628bb5ab01628bb5abf00000").getName());
	}

	@Test
	public void testTransationReadOnly() {//测试只读事务，如果出现更新操作则回滚
		TestService ts = (TestService)ctx.getBean("testService");
		System.out.println(ts.findUser("4028ca16628bb5ab01628bb5abf00000").getName());
	}
	@Test
	public void testTransationRollBack() {//测试回滚事务，如果出现异常则回滚之前的操作
		TestService ts = (TestService)ctx.getBean("testService");
		ts.save(new User("用户4"));
	}
	
}
