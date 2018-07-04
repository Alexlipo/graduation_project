<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>销售订单管理</title>
<script type="text/javascript" src="${basePath }js/datepicker/WdatePicker.js"></script>
<script type="text/javascript">
function doSubmit(){
		var code = $("#code");
   		if(code.val() == ""){
   			alert("订单编号不能为空！");
   			code.focus();
   			return false;
   		}
   		var customerName = $("#customerName");
   		if(customerName.val() == ""){
   			alert("请选择客户！");
   			customerName.focus();
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
   			alert("收货地址不能为空！");
   			address.focus();
   			return false;
   		}
   		document.forms[0].submit();
}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form" action="${basePath }jxc/salesOrder_add.action"
		method="post" enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div align="center">
							<b></b><strong>销售订单管理</strong>
						</div>
					</div>
					<div class="tableH2" align="center">新建销售订单</div>
					<table id="baseInfo" width="60%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="200px">编号:</td>
							<td><s:textfield id="code" name="salesOrder.code" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">客户名称:</td>
							<td><s:select 
								label="选择客户"
								list="customerList" 
								listKey="id"  
      							listValue="name"
      							name="salesOrder.customer.id" 
      							id="customerName" />  
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">药品名称</td>
							<td><s:select 
								label="选择药品"
								list="medicinalList"
								listKey="id"  
      							listValue="name"
      							name="salesOrder.medicinal.id"
      							id="medicinalName" />
							</td>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">单价:</td>
							<td><s:textfield id="unit_price" name="salesOrder.unit_price" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">数量:</td>
							<td><s:textfield id="quantity" name="salesOrder.quantity" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">下单日期:</td>
							<td><s:textfield id="order_date" name="salesOrder.order_date" readonly="true"
									onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'});" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">收货地址:</td>
							<td><s:textfield id="address" name="salesOrder.address" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">运输方式:</td>
							<td><s:textfield name="salesOrder.transportation" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">发货日期:</td>
							<td><s:textfield id="deliver_date" name="salesOrder.deliver_date" readonly="true"
									onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'});" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">备注：</td>
							<td><s:textarea name="salesOrder.remark" cols="75" rows="3" /></td>
						</tr>
					</table>
					<div class="tc mt20" align="center">
						<input type="button" class="btnB2" value="保存" onclick="doSubmit()"/>
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="button" onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>