package com.lyg.jxc.action;

import java.util.List;

import javax.annotation.Resource;

import com.lyg.core.action.BaseAction;
import com.lyg.jxc.entity.Medicinal;
import com.lyg.jxc.service.MedicinalService;
import com.opensymphony.xwork2.ActionSupport;

public class MedicinalAction extends BaseAction {
	
	@Resource
	private MedicinalService medicinalService;
	private Medicinal medicinal;
	private List<Medicinal> medicinalList;
	
//	展示所有供应商信息
	public String listUI(){
		medicinalList = medicinalService.findObjects();
		return "listUI";
	}
//	跳转到添加页面
	public String addUI(){
		return "addUI";
	}
//	保存添加
	public String add(){
		if(medicinal!=null){
			medicinalService.save(medicinal);
		}
		return "list";
	}
//	跳转到编辑页面
	public String editUI(){
		if (medicinal!=null&&medicinal.getId()!=null) {
			medicinal = medicinalService.findObjectById(medicinal.getId());
		}
		return "editUI";
	}
//	保存更新
	public String edit(){
		if(medicinal!=null){
			medicinalService.update(medicinal);
		}
		return "list";
	}
//	删除
	public String delete(){
		if(medicinal!=null&&medicinal.getId()!=null){
			medicinalService.delete(medicinal.getId());
		}
		return "list";
	}
//	批量删除
	public String deleteSelected(){
		if(selectedRow!=null){
			for(String id :selectedRow){
				medicinalService.delete(id);
			}
		}
		return "list";
	}
//	查看药品详细信息
	public String showDetail(){
		medicinal = medicinalService.findObjectById(medicinal.getId());
		return "showDetail";
	}
	
	public Medicinal getMedicinal() {
		return medicinal;
	}
	public void setMedicinal(Medicinal medicinal) {
		this.medicinal = medicinal;
	}
	public List<Medicinal> getMedicinalList() {
		return medicinalList;
	}
	public void setMedicinalList(List<Medicinal> medicinalList) {
		this.medicinalList = medicinalList;
	}
	
}
