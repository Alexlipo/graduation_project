<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>供应商管理</title>
<script type="text/javascript">
function doSubmit(){
		var name = $("#name");
   		if(name.val() == ""){
   			alert("供应商名称不能为空！");
   			name.focus();
   			return false;
   		}
   		var code = $("#code");
   		if(code.val() == ""){
   			alert("编号不能为空！");
   			code.focus();
   			return false;
   		}
   		var tel = $("#tel");
   		if(tel.val() == ""){
   			alert("联系方式不能为空！");
   			tel.focus();
   			return false;
   		}
   		var address = $("#address");
   		if(address.val() == ""){
   			alert("地址不能为空！");
   			address.focus();
   			return false;
   		}
   		//提交表单
   		document.forms[0].submit();
}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form" action="${basePath }jxc/supplier_add.action"
		method="post" enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div align="center">
							<b></b><strong>供应商管理</strong>
						</div>
					</div>
					<div class="tableH2" align="center">新增供应商</div>
					<table id="baseInfo" width="60%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="200px">名称:</td>
							<td><s:textfield id="name" name="supplier.name" />
						</tr>
						<tr>
							<td class="tdBg" width="200px">编号:</td>
							<td><s:textfield id="code" name="supplier.code" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">联系方式:</td>
							<td><s:textfield id="tel" name="supplier.tel" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">地址:</td>
							<td><s:textfield id="address" name="supplier.address" /></td>
						</tr>
						<!--  <tr>
							<td class="tdBg" width="200px">性别：</td>
							<td><s:radio list="#{'true':'男','false':'女'}"
									name="user.gender" /></td>
						</tr>
						-->
						<tr>
							<td class="tdBg" width="200px">备注：</td>
							<td><s:textarea name="supplier.remark" cols="75" rows="3" /></td>
						</tr>
					</table>
					<div class="tc mt20" align="center">
						<input type="button" class="btnB2" value="保存" onclick="doSubmit()" />
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="button" onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>