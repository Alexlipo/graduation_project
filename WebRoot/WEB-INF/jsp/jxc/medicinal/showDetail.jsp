<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>药品管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
      	//编辑
      	function doEdit(id){
      		document.forms[0].action = "${basePath}jxc/medicinal_editUI.action?medicinal.id=" + id;
      		document.forms[0].submit();
      	}
    </script>
</head>

<body>
<form name="form" action="" method="post" enctype="multipart/form-data">
	<table id="baseInfo" width="30%" align="center" class="list"
						border="1" cellpadding="0" cellspacing="0">
						<tr>
							<td class="tdBg" width="100px">编号:</td>
							<td align="center"><s:property value="medicinal.code" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">药品名称</td>
							<td align="center"><s:property value="medicinal.name" /></td>
							</td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">类型</td>
							<td align="center"><s:property value="medicinal.type" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">功能:</td>
							<td align="center"><s:property value="medicinal.component" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">组成成分:</td>
							<td align="center"><s:property value="medicinal.function" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px">生产厂家:</td>
							<td align="center"><s:property value="medicinal.producer" /></td>
						</tr>
						<tr>
							<td class="tdBg" width="100px" >备注：</td>
							<td align="center" ><s:property value="medicinal.remark" /></td>
						</tr>
						<s:hidden name="medicinal.id" />
						<tr>
						<td  colspan="2" align="center"><a href="javascript:doEdit('<s:property value='id'/>')">编辑</a> ></td>
						</tr>
					</table>
					<div class="tc mt20" align="center">
						<input type="button" onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
					</div>
	
	</form>
</body>
</html>
