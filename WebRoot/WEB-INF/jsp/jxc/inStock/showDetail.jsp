<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>入库单管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
      	//编辑
      	function doEdit(id){
      		document.forms[0].action = "${basePath}jxc/inStock_editUI.action?inStock.id=" + id;
      		document.forms[0].submit();
      	}
    </script>
</head>

<body>
<form name="form" action="" method="post" enctype="multipart/form-data">
	<table id="baseInfo" width="40%" align="center" class="list" border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="150px">入库订单编号:</td>
							<td align="center"><s:property value="inStock.code" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">操作人名称:</td>
							<td align="center"><s:property value="inStock.admin.realName" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">操作人联系方式:</td>
							<td align="center"><s:property value="inStock.admin.tel" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">供应商名称:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.supplier.name" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">供应商联系方式:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.supplier.tel" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">药品名称:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.medicinal.name" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">药品类型:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.medicinal.type" /></td>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">数量:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.quantity" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">单价:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.unit_price" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">总金额:</td>
							<td align="center"><s:property value="inStock.purchaseOrder.total_Money" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px">入库日期:</td>
							<td align="center"><s:date name="inStock.inStockDate" format="yyyy-MM-dd HH:mm"/></td>
						</tr>
						<tr>
							<td class="tdBg" width="150px" >备注：</td>
							<td align="center" ><s:property value="inStock.remark" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="button" onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
							</td>
						</tr>
					</table>
	
	</form>
</body>
</html>
