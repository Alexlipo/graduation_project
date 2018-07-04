<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>出库单管理</title>
<%@include file="/common/header.jsp"%>
</head>
<body>
<form name="form" action="" method="post" enctype="multipart/form-data">
	<table id="baseInfo" width="40%" align="center" class="list" border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="150px">出库订单编号:</td>
							<td align="center"><s:property value="outStock.code" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">操作人名称:</td>
							<td align="center"><s:property value="outStock.admin.realName" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">操作人联系方式:</td>
							<td align="center"><s:property value="outStock.admin.tel" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">客户名称:</td>
							<td align="center"><s:property value="outStock.salesOrder.customer.name" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">客户联系方式:</td>
							<td align="center"><s:property value="outStock.salesOrder.customer.tel" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">药品名称:</td>
							<td align="center"><s:property value="outStock.salesOrder.medicinal.name" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">药品类型:</td>
							<td align="center"><s:property value="outStock.salesOrder.medicinal.type" /></td>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">数量:</td>
							<td align="center"><s:property value="outStock.salesOrder.quantity" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">单价:</td>
							<td align="center"><s:property value="outStock.salesOrder.unit_price" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">总额:</td>
							<td align="center"><s:property value="outStock.salesOrder.total_Money" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">出库日期:</td>
							<td align="center"><s:date name="outStock.salesOrder.outStockDate" format="yyyy-MM-dd HH:mm"/></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px" >备注：</td>
							<td align="center" ><s:property value="outStock.remark" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="button" onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
							</td>
						</tr>
					</table>
	
	</form>
</body>
</html>
