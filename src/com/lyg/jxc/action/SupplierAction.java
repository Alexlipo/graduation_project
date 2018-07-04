package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Supplier;
import com.lyg.jxc.service.SupplierService;
import com.opensymphony.xwork2.ActionSupport;

public class SupplierAction extends BaseAction {

	@Resource
	private SupplierService supplierService;
	private List<Supplier> supplierList;
	private Supplier supplier;
	
//	展示所有供应商信息
	public String listUI(){
		supplierList = supplierService.findObjects();
		return "listUI";
	}
//	跳转到添加页面
	public String addUI(){
		return "addUI";
	}
//	保存添加
	public String add(){
		if(supplier!=null){
			supplierService.save(supplier);
		}
		return "list";
	}
//	跳转到编辑页面
	public String editUI(){
		if (supplier!=null&&supplier.getId()!=null) {
			supplier = supplierService.findObjectById(supplier.getId());
		}
		return "editUI";
	}
//	保存更新
	public String edit(){
		if(supplier!=null){
			supplierService.update(supplier);
		}
		return "list";
	}
//	删除
	public String delete(){
		if(supplier!=null&&supplier.getId()!=null){
			supplierService.delete(supplier.getId());
		}
		return "list";
	}
//	批量删除
	public String deleteSelected(){
		if(selectedRow!=null){
			for(String id :selectedRow){
				supplierService.delete(id);
			}
		}
		return "list";
	}
	public List<Supplier> getSupplierList() {
		return supplierList;
	}
	public void setSupplierList(List<Supplier> supplierList) {
		this.supplierList = supplierList;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
}
