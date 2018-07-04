package com.lyg.login.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.lyg.jxc.entity.Admin;
import com.lyg.jxc.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	@Resource
	private AdminService adminService;
	private Admin admin;
	private String loginResult;
	//	跳转到登录页面
	public String toLoginUI(){
		return "loginUI";
	}
	//登录
	public String login(){
		if(admin != null){
			if(StringUtils.isNotBlank(admin.getAccount()) && StringUtils.isNotBlank(admin.getPwd()) ){
				//根据用户的帐号和密码查询用户列表
				List<Admin> list = adminService.findAdminByAccountAndPwd(admin.getAccount(), admin.getPwd());
				if(list != null && list.size() > 0){//说明登录成功
					//2.1、登录成功
					Admin admin = list.get(0);
					//2.1.2、将用户信息保存到session中
					ServletActionContext.getRequest().getSession().setAttribute("admin", admin);
					//2.1.3、将用户登录记录到日志文件
					Log log = LogFactory.getLog(getClass());
					log.info("用户名称为：" + admin.getRealName() + " 的用户登录了系统。");
					//2.1.4、重定向跳转到首页
					return "home";
				} else {//登录失败
					loginResult = "帐号或密码不正确！";
				}
			} else {
				loginResult = "帐号或密码不能为空！";
			}
		} else {
			loginResult = "请输入帐号和密码！";
		}
		return toLoginUI();
	}
	//退出，注销
	public String logout(){
		//清除session中保存的用户信息
		ServletActionContext.getRequest().getSession().removeAttribute("admin");
		return toLoginUI();
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}

}
