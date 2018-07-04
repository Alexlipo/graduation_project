<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>采购订单管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
      	//编辑
      	function doEdit(id){
      		document.forms[0].action = "${basePath}jxc/purchaseOrder_editUI.action?purchaseOrder.id=" + id;
      		document.forms[0].submit();
      	}
    </script>
</head>

<body>
<form name="form" action="" method="post" enctype="multipart/form-data">
	<table id="baseInfo" width="30%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td align="center" colspan="2"><s:property value="status?'已经入库':'尚未入库'" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">编号:</td>
							<td align="center"><s:property value="purchaseOrder.code" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">供应商名称:</td>
							<td align="center"><s:property value="purchaseOrder.supplier.name" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">供应商联系方式:</td>
							<td align="center"><s:property value="purchaseOrder.supplier.tel" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">药品名称</td>
							<td align="center"><s:property value="purchaseOrder.medicinal.name" /></td>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">单价:</td>
							<td align="center"><s:property value="purchaseOrder.unit_price" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">数量:</td>
							<td align="center"><s:property value="purchaseOrder.quantity" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">总额:</td>
							<td align="center"><s:property value="purchaseOrder.total_Money" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">下单日期:</td>
							<td align="center"><s:date name="purchaseOrder.order_date" format="yyyy-MM-dd HH:mm"/></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">交货地址:</td>
							<td align="center"><s:property value="purchaseOrder.address" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">运输方式:</td>
							<td align="center"><s:property value="purchaseOrder.transportation" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">交货日期:</td>
							<td align="center"><s:date name="purchaseOrder.deliver_date" format="yyyy-MM-dd HH:mm"/></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px" >备注：</td>
							<td align="center" ><s:property value="purchaseOrder.remark" /></td>
						</tr>
						<s:hidden name="purchaseOrder.id" />
						<tr>
						<td  colspan="2" align="center"><a href="javascript:doEdit('<s:property value='id'/>')">修改订单</a> ></td>
						</tr>
					</table>
	
	</form>
</body>
</html>
