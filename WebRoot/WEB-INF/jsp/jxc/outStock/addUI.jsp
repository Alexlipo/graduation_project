<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>出库订单管理</title>
<script type="text/javascript"
	src="${basePath }js/datepicker/WdatePicker.js"></script>
<script type="text/javascript">
	function doSubmit() {
		var code = $("#code");
		if (code.val() == "") {
			alert("出库单编号不能为空！");
			code.focus();
			return false;
		}
		var salesOrderCode = $("#salesOrderCode");
		if (salesOrderCode.val() == "") {
			alert("请选择要出库的销售订单！");
			salesOrderCode.focus();
			return false;
		}
		var outStockDate = $("#outStockDate");
		if (outStockDate.val() == "") {
			alert("请选择出库日期！");
			outStockDate.focus();
			return false;
		}
		document.forms[0].submit();
	}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form"
		action="${basePath }jxc/outStock_add.action" method="post"
		enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div align="center">
						<b></b><strong>出库订单管理</strong>
					</div>
					<div class="tableH2" align="center">新建出库订单</div>
					<table id="baseInfo" width="40%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="150px">编号:</td>
							<td><s:textfield id="code" name="outStock.code" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">销售订单编号:</td>
							<td><s:select label="选择销售订单" list="salesOrderList"
								listKey="id" listValue="code" name="outStock.salesOrder.id"
								id="salesOrderCode" /><span><div height=20 valign="middle">
								<font color="red" id="errMsg"><s:property value="result" /></font></div></span>
								<s:if test="salesOrderList.size()==0">所有销售订单都已经完成出库</s:if></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">出库日期:</td>
							<td><s:textfield id="outStockDate"
									name="outStock.outStockDate" readonly="true"
									onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'});" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">备注：</td>
							<td><s:textarea name="outStock.remark" cols="45" rows="3" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">操作人:</td>
							<td><s:property value="#session.admin.realName"/></td>
							<s:hidden name="outStock.admin" value="%{#session.admin}"></s:hidden>
						</tr>
						<tr>
							<td class="tdBg" width="150px">出库时间:</td>
							<td><s:date name="outStock.outStockDate" format="yyyy-MM-dd HH:mm" /></td>
							<s:hidden name="outStock.outStockDate" ></s:hidden>
						</tr>
					</table>
					<div class="tc mt20" align="center">
						<input type="button" class="btnB2" value="保存" onclick="doSubmit()" />
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="button"
							onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>