package com.lyg.jxc.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Admin;
import com.lyg.jxc.entity.Customer;
import com.lyg.jxc.entity.Medicinal;
import com.lyg.jxc.entity.OutStock;
import com.lyg.jxc.entity.SalesOrder;
import com.lyg.jxc.entity.Stock;
import com.lyg.jxc.service.CustomerService;
import com.lyg.jxc.service.MedicinalService;
import com.lyg.jxc.service.OutStockService;
import com.lyg.jxc.service.SalesOrderService;
import com.lyg.jxc.service.StockService;

public class OutStockAction extends BaseAction {

	@Resource
	private OutStockService outStockService;
	@Resource
	private SalesOrderService salesOrderService;
	@Resource
	private StockService stockService;
	private List<SalesOrder> salesOrderList;
	private List<OutStock> outStockList;
	private List<Stock> stockList;
	private SalesOrder salesOrder;
	private OutStock outStock;
	private Stock stock;
	private String result;
	
//	跳转到展示所有出库单页面
	public String listUI(){
		outStockList = outStockService.findObjects();
		return "listUI";
	}
//	跳转到新建出库单页面
	public String addUI(){
		outStock=new OutStock();
		outStock.setOutStockDate(new Timestamp(new Date().getTime()));
		salesOrderList=salesOrderService.findObjectsNotOut();
		return "addUI";
	}
//	保存新增出库单并进行出库操作
	public String add(){
		if(outStock!=null){
			salesOrder=salesOrderService.findObjectById(outStock.getSalesOrder().getId());
			outStock.setSalesOrder(salesOrder);
			stockList=stockService.findStockByMedicinalId(outStock.getSalesOrder().getMedicinal().getId());
			//库存中有这种药品
			if(stockList!=null&&stockList.size()>0){
				stock=stockList.get(0);
				float store=stock.getAmount()-outStock.getSalesOrder().getQuantity();
//				库存足够
				if(store>=0){
					stock.setAmount(store);
					stockService.update(stock);
					outStock.setAdmin((Admin)ServletActionContext.getRequest().getSession().getAttribute("admin"));
					salesOrder.setStatus(true);
					salesOrderService.update(salesOrder);
					outStockService.save(outStock);
					return "list";
//					库存不够
				}else {
					result="库存不足";
				}
			}else{
				result="仓库中没有此药品";
			}
		}else{
			result="请填写出库单";
		}
		salesOrderList=salesOrderService.findObjectsNotOut();
		return "notEnough";
	}
//	查询单个出库单详细
	public String showDetail(){
		if(outStock != null && outStock.getId() != null){
			outStock = outStockService.findObjectById(outStock.getId());
		}
		return "showDetail";
	}
	public List<OutStock> getOutStockList() {
		return outStockList;
	}
	public void setOutStockList(List<OutStock> outStockList) {
		this.outStockList = outStockList;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	public OutStock getOutStock() {
		return outStock;
	}
	public void setOutStock(OutStock outStock) {
		this.outStock = outStock;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
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

