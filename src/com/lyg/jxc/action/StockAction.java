package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Stock;
import com.lyg.jxc.service.StockService;

public class StockAction extends BaseAction {

	@Resource
	private StockService stockService;
	private Stock Stock;
	private List<Stock> stockList;
	
//	跳转到查看所有库存列表
	public String listUI(){
		stockList=stockService.findObjects();
		return "listUI";
	}
	
	public Stock getStock() {
		return Stock;
	}

	public void setStock(Stock stock) {
		Stock = stock;
	}

	public List<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}

	
}
