package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Medicinal;
import com.lyg.jxc.entity.PurchaseOrder;
import com.lyg.jxc.entity.Supplier;
import com.lyg.jxc.service.MedicinalService;
import com.lyg.jxc.service.PurchaseOrderService;
import com.lyg.jxc.service.SupplierService;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseOrderAction extends BaseAction {

	@Resource
	private PurchaseOrderService purchaseOrderService;
	@Resource
	private SupplierService supplierService;
	@Resource
	private MedicinalService medicinalService;
	private List<Supplier> supplierList;
	private List<PurchaseOrder> purchaseOrderList;
	private List<Medicinal> medicinalList;
	private PurchaseOrder purchaseOrder;
	
//	展示所有订单信息
	public String listUI(){
		purchaseOrderList = purchaseOrderService.findObjects();
		return "listUI";
	}
//	跳转到新建订单页面
	public String addUI(){
		supplierList=supplierService.findObjects();
		medicinalList=medicinalService.findObjects();
		return "addUI";
	}
//	保存新增订单
	public String add(){
		if(purchaseOrder != null){
			purchaseOrder.setTotal_Money(purchaseOrder.getUnit_price()*purchaseOrder.getQuantity());
			purchaseOrderService.save(purchaseOrder);
		}
		return "list";
	}
//	跳转到修改订单页面
	public String editUI(){
		if(purchaseOrder != null && purchaseOrder.getId() != null){
			supplierList=supplierService.findObjects();
			medicinalList=medicinalService.findObjects();
			purchaseOrder=purchaseOrderService.findObjectById(purchaseOrder.getId());
		}
		return "editUI";
	}
//	保存更新
	public String edit(){
		if(purchaseOrder != null){
			purchaseOrder.setTotal_Money(purchaseOrder.getUnit_price()*purchaseOrder.getQuantity());
			purchaseOrderService.update(purchaseOrder);
		}
		return "list";
	}
//	查询单个采购订单详细
	public String showDetail(){
		if(purchaseOrder != null && purchaseOrder.getId() != null){
			purchaseOrder = purchaseOrderService.findObjectById(purchaseOrder.getId());
		}
		return "showDetail";
	}
//	删除订单
	public String delete(){
		if(purchaseOrder != null && purchaseOrder.getId() != null){
			purchaseOrderService.delete(purchaseOrder.getId());
		}
		return "list";
	}
//	批量删除订单
	public String deleteSelected(){
		if(selectedRow!=null){
			for(String id :selectedRow){
				purchaseOrderService.delete(id);
			}
		}
		return "list";
	}
	
	
	public List<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderList;
	}
	public void setPurchaseOrderList(List<PurchaseOrder> purchaseOrderList) {
		this.purchaseOrderList = purchaseOrderList;
	}
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public List<Supplier> getSupplierList() {
		return supplierList;
	}
	public void setSupplierList(List<Supplier> supplierList) {
		this.supplierList = supplierList;
	}
	public List<Medicinal> getMedicinalList() {
		return medicinalList;
	}
	public void setMedicinalList(List<Medicinal> medicinalList) {
		this.medicinalList = medicinalList;
	}
	
	
}
