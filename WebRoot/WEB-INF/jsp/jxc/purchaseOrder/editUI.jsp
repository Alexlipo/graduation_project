<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>采购订单管理</title>
<script type="text/javascript" src="${basePath }js/datepicker/WdatePicker.js"></script>
<script type="text/javascript">
function doSubmit(){
		var code = $("#code");
   		if(code.val() == ""){
   			alert("订单编号不能为空！");
   			code.focus();
   			return false;
   		}
   		var supplierName = $("#supplierName");
   		if(supplierName.val() == ""){
   			alert("请选择供应商！");
   			supplierName.focus();
   			return false;
   		}
   		var medicinalName = $("#medicinalName");
   		if(medicinalName.val() == ""){
   			alert("请选择药品！");
   			medicinalName.focus();
   			return false;
   		}
   		var unit_price = $("#unit_price");
   		if(unit_price.val() == ""){
   			alert("单价不能为空！");
   			unit_price.focus();
   			return false;
   		}
   		var quantity = $("#quantity");
   		if(quantity.val() == ""){
   			alert("数量不能为空！");
   			quantity.focus();
   			return false;
   		}
   		var order_date = $("#order_date");
   		if(order_date.val() == ""){
   			alert("请选择下单日期！");
   			order_date.focus();
   			return false;
   		}
   		var address = $("#address");
   		if(address.val() == ""){
   			alert("交货地址不能为空！");
   			address.focus();
   			return false;
   		}
   		document.forms[0].submit();
}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form"
		action="${basePath }jxc/purchaseOrder_edit.action" method="post"
		enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div align="center">
							<b></b><strong>采购订单管理</strong>
						</div>
					</div>
					<div class="tableH2" align="center">编辑订单</div>
					<table id="baseInfo" width="60%" align="center" class="list" border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="200px">编号:</td>
							<td><s:textfield id="code" name="purchaseOrder.code" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">供应商名称:</td>
							<td><s:select list="supplierList" 
								listKey="id"  
      							listValue="name"
      							name="purchaseOrder.supplier.id"  
      							value="supplier"
      							id="supplierName" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">药品名称</td>
							<td><s:select list="medicinalList"
								listKey="id"  
      							listValue="name"
								name="purchaseOrder.medicinal.id"
								value="medicinal"
								id="medicinalName" /></td>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">单价:</td>
							<td><s:textfield id="unit_price" name="purchaseOrder.unit_price" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">数量:</td>
							<td><s:textfield id="quantity" name="purchaseOrder.quantity" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">下单日期:</td>
							<td><s:textfield id="order_date" name="purchaseOrder.order_date" readonly="true"
									onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'});" >
									<s:param name="value"><s:date name="purchaseOrder.order_date" format="yyyy-MM-dd"/></s:param></s:textfield>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">交货地址:</td>
							<td><s:textfield id="address" name="purchaseOrder.address" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">运输方式:</td>
							<td><s:textfield name="purchaseOrder.transportation" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">交货日期:</td>
							<td><s:textfield id="deliver_date" name="purchaseOrder.deliver_date" readonly="true"
									onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'});" >
									<s:param name="value"><s:date name="purchaseOrder.order_date" format="yyyy-MM-dd"/></s:param>
									</s:textfield>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">备注：</td>
							<td><s:textarea name="purchaseOrder.remark" cols="75" rows="3" /></td>
						</tr>
					</table>
					<s:hidden name="purchaseOrder.id" />
					<div class="tc mt20" align="center">
						<input type="button" class="btnB2" value="保存" onclick="doSubmit()"/>&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="button" onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>