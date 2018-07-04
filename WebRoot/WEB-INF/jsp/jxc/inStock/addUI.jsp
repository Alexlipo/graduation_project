<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>入库订单管理</title>
<script type="text/javascript" src="${basePath }js/datepicker/WdatePicker.js"></script>
<script type="text/javascript">
function doSubmit(){
		var code = $("#code");
   		if(code.val() == ""){
   			alert("入库单编号不能为空！");
   			code.focus();
   			return false;
   		}
   		var purchaseOrderCode = $("#purchaseOrderCode");
   		if(purchaseOrderCode.val() == ""){
   			alert("请选择要入库的采购订单！");
   			purchaseOrderCode.focus();
   			return false;
   		}
   		var inStockDate = $("#inStockDate");
   		if(inStockDate.val() == ""){
   			alert("请选择入库日期！");
   			inStockDate.focus();
   			return false;
   		}
   		document.forms[0].submit();
}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form" action="${basePath }jxc/inStock_add.action"
		method="post" enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
						<div align="center">
							<b></b><strong>入库订单管理</strong>
						</div>
					<div class="tableH2" align="center">新建入库订单</div>
					<table id="baseInfo" width="40%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="150px">编号:</td>
							<td><s:textfield id="code" name="inStock.code" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">采购订单编号:</td>
							<td><s:select 
								label="选择采购订单编号"
								list="purchaseOrderList"
								listKey="id"  
      							listValue="code"
      							name="inStock.purchaseOrder.id"
      							id="purchaseOrderCode" />
      							<s:if test="purchaseOrderList.size()==0">所有采购订单都已经完成入库</s:if>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">备注:</td>
							<td><s:textarea name="inStock.remark" cols="45" rows="3" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">操作人:</td>
							<td><s:property value="#session.admin.realName"/></td>
							<s:hidden name="inStock.admin" value="%{#session.admin}"></s:hidden>
						</tr>
						<tr>
							<td class="tdBg" width="150px">入库时间:</td>
							<td><s:date name="inStock.inStockDate" format="yyyy-MM-dd HH:mm" /></td>
							<s:hidden name="inStock.inStockDate" ></s:hidden>
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