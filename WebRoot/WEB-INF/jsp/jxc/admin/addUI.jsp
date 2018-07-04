<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%@include file="/common/header.jsp"%>
<title>管理员管理</title>
<script type="text/javascript">
 var vResult = false;
//校验帐号唯一
   	function doVerify(){
   		//1、获取帐号
   		var account = $("#account").val();
   		if(account != ""){
   			//2、校验 
   			$.ajax({
   				url:"${basePath}/admin_verifyAccount.action",
   				data: {"admin.account": account},
   				type: "post",
   				async: false,//非异步
   				success: function(msg){
   					if("true" != msg){
   						//帐号已经存在
   						alert("帐号已经存在。请使用其它帐号！");
   						//定焦
   						$("#account").focus();
   						vResult = false;
   					} else {
   						vResult = true;
   					}
   				}
   			});
   		}
   	}
function doSubmit(){
		var realName = $("#realName");
   		if(realName.val() == ""){
   			alert("管理员名称不能为空！");
   			realName.focus();
   			return false;
   		}
   		var account = $("#account");
   		if(account.val() == ""){
   			alert("账号不能为空！");
   			account.focus();
   			return false;
   		}
   		var pwd = $("#pwd");
   		if(pwd.val() == ""){
   			alert("密码不能为空！");
   			pwd.focus();
   			return false;
   		}
   		var tel = $("#tel");
   		if(tel.val() == ""){
   			alert("联系方式不能为空！");
   			tel.focus();
   			return false;
   		}
   		
   		//帐号校验
    		doVerify();
    		if(vResult){
	    		//提交表单
	    		document.forms[0].submit();
    		}
}
</script>
</head>
<body class="rightBody">
	<form id="form" name="form" action="${basePath }jxc/admin_add.action"
		method="post" enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div align="center">
							<b></b><strong>管理员管理</strong>
						</div>
					</div>
					<div class="tableH2" align="center">注册管理员</div>
					<table id="baseInfo" width="30%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="100px">姓名:</td>
							<td><s:textfield id="realName" name="admin.realName" />
						</tr>
						<tr>
							<td class="tdBg" width="100px">帐号:</td>
							<td><s:textfield id="account" name="admin.account" onchange="doVerify()"/>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">密码:</td>
							<td><s:textfield id="pwd" name="admin.pwd" />
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">性别：</td>
							<td><s:radio list="#{'true':'男','false':'女'}"
									name="admin.gender" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">联系方式:</td>
							<td><s:textfield id="tel" name="admin.tel" /></td>
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