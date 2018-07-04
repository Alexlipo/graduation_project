<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
</script>
</head>
<title>中成药进销存管理系统首页</title>
<body>
	<table width="50%" border="1" cellspacing="0" cellpadding="0" align="center">
	<tr><td colspan="2" align="right">欢迎您:<s:property value="#session.admin.realName"/>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="${basePath }/login_logout.action">退出</a></td></tr>
	<tr><td colspan="2" align="center">中成药进销存管理系统首页</td></tr>
	<tr><td colspan="2" align="center">请选择要操作的模块</td></tr>
	<tr><td align="center"><a href="${basePath }/purchaseOrder_listUI.action">采购订单模块</a></td>
	<td  align="center"><a href="${basePath }/salesOrder_listUI.action">销售订单模块</a></td></tr>
	<tr><td align="center"><a href="${basePath }/inStock_listUI.action">入库管理模块</a></td>
	<td  align="center"><a href="${basePath }/outStock_listUI.action">出库管理模块</a></td></tr>
	<tr><td align="center"><a href="${basePath }/supplier_listUI.action">供应商管理模块</a></td>
	<td align="center"><a href="${basePath }/customer_listUI.action">客户管理模块</a></td></tr>	
	<tr><td align="center"><a href="${basePath }/medicinal_listUI.action">中成药管理模块</a></td>
	<td  align="center"><a href="${basePath }/stock_listUI.action">查看中成药库存</a></td></tr>
	<s:if test="#session.admin.realName=='管理员'">
		<tr><td colspan="2" align="center"><a href="${basePath }/admin_listUI.action">用户管理模块</a></td></tr>
	</s:if>
	</table>

</body>
</html>
