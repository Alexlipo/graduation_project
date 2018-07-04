package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Customer;
import com.lyg.jxc.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends BaseAction {
	
	@Resource
	private CustomerService customerService;
	private Customer customer;
	private List<Customer> customerList;
	
//	跳转到客户列表
	public String listUI(){
		customerList=customerService.findObjects();
		return "listUI";
	}
//	跳转到添加页面
	public String addUI(){
		return "addUI";
	}
//	保存添加
	public String add(){
		if(customer!=null){
			customerService.save(customer);
		}
		return "list";
	}
//	跳转到编辑页面
	public String editUI(){
		if(customer!=null&&customer.getId()!=null){
			customer=customerService.findObjectById(customer.getId());
		}
		return "editUI";
	}
//	保存更新
	public String edit(){
		if(customer!=null){
			customerService.update(customer);
		}
		return "list";
	}
//	删除
	public String delete(){
		if(customer!=null&&customer.getId()!=null){
			customerService.delete(customer.getId());
		}
		return "list";
	}
//	批量删除
	public String deleteSelected(){
		if(selectedRow!=null){
			for(String id :selectedRow){
				customerService.delete(id);
			}
		}
		return "list";
	}
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	
}
