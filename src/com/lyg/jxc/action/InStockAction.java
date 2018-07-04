package com.lyg.jxc.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Admin;
import com.lyg.jxc.entity.InStock;
import com.lyg.jxc.entity.PurchaseOrder;
import com.lyg.jxc.entity.Stock;
import com.lyg.jxc.service.InStockService;
import com.lyg.jxc.service.PurchaseOrderService;
import com.lyg.jxc.service.StockService;

public class InStockAction extends BaseAction {

	@Resource
	private InStockService inStockService;
	@Resource
	private StockService stockService;
	@Resource
	private PurchaseOrderService purchaseOrderService;
	private List<PurchaseOrder> purchaseOrderList;
	private List<InStock> inStockList;
	private List<Stock> stockList;
	private PurchaseOrder purchaseOrder;
	private InStock inStock;
	private Stock stock;
	
//	展示所有入库单信息
	public String listUI(){
		inStockList = inStockService.findObjects();
		return "listUI";
	}
//	跳转到新建入库单页面
	public String addUI(){
		inStock=new InStock();
		inStock.setInStockDate(new Timestamp(new Date().getTime()));
		purchaseOrderList=purchaseOrderService.findObjectsNotIn();
		return "addUI";
	}
//	保存新增入库单
	public String add(){
		if(inStock != null){
			purchaseOrder=purchaseOrderService.findObjectById(inStock.getPurchaseOrder().getId());
			inStock.setPurchaseOrder(purchaseOrder);
			stockList=stockService.findStockByMedicinalId(inStock.getPurchaseOrder().getMedicinal().getId());
//			库存中已经有该药品了
			if(stockList!=null&&stockList.size()>0){
				stock=stockList.get(0);
				stock.setAmount(stock.getAmount()+inStock.getPurchaseOrder().getQuantity());
				stockService.update(stock);
			}else{
//				新药品
				Stock newStock=new Stock();
				newStock.setMedicinal(inStock.getPurchaseOrder().getMedicinal());
				newStock.setAmount(inStock.getPurchaseOrder().getQuantity());
				stockService.save(newStock);
			}
			inStock.setAdmin((Admin)ServletActionContext.getRequest().getSession().getAttribute("admin"));
			purchaseOrder.setStatus(true);
			purchaseOrderService.update(purchaseOrder);
			inStockService.save(inStock);
		}
		return "list";
	}
//	查询单个入库单详细
	public String showDetail(){
		if(inStock != null && inStock.getId() != null){
			inStock = inStockService.findObjectById(inStock.getId());
		}
		return "showDetail";
	}
	public List<InStock> getInStockList() {
		return inStockList;
	}
	public void setInStockList(List<InStock> inStockList) {
		this.inStockList = inStockList;
	}
	public InStock getInStock() {
		return inStock;
	}
	public void setInStock(InStock inStock) {
		this.inStock = inStock;
	}
	public List<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderList;
	}
	public void setPurchaseOrderList(List<PurchaseOrder> purchaseOrderList) {
		this.purchaseOrderList = purchaseOrderList;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	
}
