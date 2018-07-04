package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Admin;
import com.lyg.jxc.service.AdminService;

public class AdminAction extends BaseAction {

	@Resource
	private AdminService adminService;
	private Admin admin;
	private List<Admin> adminList;

	//	跳转到管理员列表
	public String listUI(){
		adminList=adminService.findObjects();
		return "listUI";
	}
	//	跳转到添加页面
	public String addUI(){
		return "addUI";
	}
	//	保存添加
	public String add(){
		if(admin!=null){
			adminService.save(admin);
		}
		return "list";
	}
	//	跳转到编辑页面
	public String editUI(){
		if(admin!=null&&admin.getId()!=null){
			admin=adminService.findObjectById(admin.getId());
		}
		return "editUI";
	}
	//	保存更新
	public String edit(){
		if(admin!=null){
			adminService.update(admin);
		}
		return "list";
	}
	//	删除
	public String delete(){
		if(admin!=null&&admin.getId()!=null){
			adminService.delete(admin.getId());
		}
		return "list";
	}
	//	批量删除
	public String deleteSelected(){
		if(selectedRow!=null){
			for(String id :selectedRow){
				adminService.delete(id);
			}
		}
		return "list";
	}
	//校验管理员帐号唯一
	public void verifyAccount(){
		try {
			//1、获取帐号
			if(admin != null && StringUtils.isNotBlank(admin.getAccount())){
				//2、根据帐号到数据库中校验是否存在该帐号对应的用户
				List<Admin> list = adminService.findAdminByAccountAndId(admin.getAccount(),admin.getId());
				String strResult = "true";
				if(list != null && list.size() > 0){
					//说明该帐号已经存在
					strResult = "false";
				}

				//输出
				HttpServletResponse response = ServletActionContext.getResponse();
				response.setContentType("text/html");
				ServletOutputStream outputStream = response.getOutputStream();
				outputStream.write(strResult.getBytes());
				outputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Admin> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<Admin> adminList) {
		this.adminList = adminList;
	}


}
