<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>用户登录</title>
<script type="text/javascript">
function doSubmit(){
document.forms[0].submit();
}
function setClean(){
	document.getElementById("account").value = "";
	document.getElementById("password").value = "";
}
</script>
</head>
<body>
	<form id="form" name="form" action="${basePath }/login_login.action"
		method="post" enctype="multipart/form-data">
		<table id="baseInfo" width="30%" align="center" class="list"
			border="1" cellpadding="0" cellspacing="0">
			<tr align="center"><td colspan="2">请填写登录信息<span><div height=20 valign="middle" >
			<font color="red" id="errMsg"><s:property value="loginResult"/></font></div></span></td></tr>
			<tr>
				<td height="32" align="left">帐号:</td>
				<td align="left"><s:textfield id="account" name="admin.account" /></td>
			</tr>
			<tr>
				<td height="32" align="left">密码:</td>
				<td align="left"><s:password id="password" name="admin.pwd" /></td>
			</tr>
			<tr align="center">
			<td colspan="2" ><input type="button" class="btnB2" value="登录" onclick="doSubmit()"/>&nbsp;&nbsp;
			<input type="button" onclick="setClean()" class="btnB2" value="清空" /></td>
			</tr>
		</table>

	</form>
</body>
</html>
