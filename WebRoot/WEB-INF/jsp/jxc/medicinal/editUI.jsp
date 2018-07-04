<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>药品管理</title>
<script type="text/javascript">
function doSubmit(){
		var name = $("#name");
   		if(name.val() == ""){
   			alert("药品名称不能为空！");
   			name.focus();
   			return false;
   		}
   		var code = $("#code");
   		if(code.val() == ""){
   			alert("编号不能为空！");
   			code.focus();
   			return false;
   		}
   		var type = $("#type");
   		if(type.val() == ""){
   			alert("中成药类型不能为空！");
   			type.focus();
   			return false;
   		}
   		var component = $("#component");
   		if(component.val() == ""){
   			alert("中成药组成成分不能为空！");
   			component.focus();
   			return false;
   		}
   		var producer = $("#producer");
   		if(producer.val() == ""){
   			alert("生产厂家不能为空！");
   			producer.focus();
   			return false;
   		}
   		//提交表单
   		document.forms[0].submit();
}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form"
		action="${basePath }jxc/medicinal_edit.action" method="post"
		enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div align="center">
							<b></b><strong>药品管理</strong>
						</div>
					</div>
					<div class="tableH2" align="center">修改药物信息</div>
					<table id="baseInfo" width="60%" align="center" class="list" border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="200px">名称:</td>
							<td><s:textfield id="name" name="medicinal.name" />
						</tr>
						<tr>
							<td class="tdBg" width="200px">编号:</td>
							<td><s:textfield id="code" name="medicinal.code" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">类型:</td>
							<td><s:textfield id="type" name="medicinal.type" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">组成成分:</td>
							<td><s:textfield id="component" name="medicinal.component" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">药物功效:</td>
							<td><s:textfield name="medicinal.function" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">生产厂家:</td>
							<td><s:textfield id="producer" name="medicinal.producer" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="200px">备注：</td>
							<td><s:textarea name="medicinal.remark" cols="75" rows="3" /></td>
						</tr>
					</table>
					<s:hidden name="medicinal.id" />
					<div class="tc mt20" align="center">
						<input type="button" class="btnB2" value="保存" onclick="doSubmit()"/>
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="button"
							onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>