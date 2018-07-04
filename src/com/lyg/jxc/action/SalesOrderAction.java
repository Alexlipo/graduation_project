package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Customer;
import com.lyg.jxc.entity.Medicinal;
import com.lyg.jxc.entity.SalesOrder;
import com.lyg.jxc.service.CustomerService;
import com.lyg.jxc.service.MedicinalService;
import com.lyg.jxc.service.SalesOrderService;
import com.opensymphony.xwork2.ActionSupport;

public class SalesOrderAction extends BaseAction {

	@Resource
	private SalesOrderService salesOrderService;
	@Resource
	private CustomerService customerService;
	@Resource
	private MedicinalService medicinalService;
	private List<Customer> customerList;
	private List<Medicinal> medicinalList;
	private List<SalesOrder> salesOrderList;
	private SalesOrder salesOrder;
	
//	展示所有订单信息
	public String listUI(){
		salesOrderList = salesOrderService.findObjects();
		return "listUI";
	}
//	跳转到新建订单页面
	public String addUI(){
		customerList=customerService.findObjects();
		medicinalList=medicinalService.findObjects();
		return "addUI";
	}
//	保存新增订单
	public String add(){
		if(salesOrder != null){
			salesOrder.setTotal_Money(salesOrder.getQuantity()*salesOrder.getUnit_price());
			salesOrderService.save(salesOrder);
		}
		return "list";
	}
//	跳转到修改订单页面
	public String editUI(){
		if(salesOrder != null && salesOrder.getId() != null){
			customerList=customerService.findObjects();
			medicinalList=medicinalService.findObjects();
			salesOrder=salesOrderService.findObjectById(salesOrder.getId());
		}
		return "editUI";
	}
//	保存更新
	public String edit(){
		if(salesOrder != null){
			salesOrderService.update(salesOrder);
		}
		return "list";
	}
//	查询单个采购订单详细
	public String showDetail(){
		if(salesOrder != null && salesOrder.getId() != null){
			salesOrder = salesOrderService.findObjectById(salesOrder.getId());
		}
		return "showDetail";
	}
//	删除订单
	public String delete(){
		if(salesOrder != null && salesOrder.getId() != null){
			salesOrderService.delete(salesOrder.getId());
		}
		return "list";
	}
//	批量删除订单
	public String deleteSelected(){
		if(selectedRow!=null){
			for(String id :selectedRow){
				salesOrderService.delete(id);
			}
		}
		return "list";
	}
	
	
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public List<Medicinal> getMedicinalList() {
		return medicinalList;
	}
	public void setMedicinalList(List<Medicinal> medicinalList) {
		this.medicinalList = medicinalList;
	}
	public List<SalesOrder> getSalesOrderList() {
		return salesOrderList;
	}
	public void setSalesOrderList(List<SalesOrder> salesOrderList) {
		this.salesOrderList = salesOrderList;
	}
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}
	
}
