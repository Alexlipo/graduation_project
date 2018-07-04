package com.lyg.test.action;

import javax.annotation.Resource;

import com.lyg.test.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	
	@Resource
	TestService testService;
	
	public String execute(){
		testService.test();
		return SUCCESS;
	}
}
