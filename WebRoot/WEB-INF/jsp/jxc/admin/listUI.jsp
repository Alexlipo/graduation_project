<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>管理员管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
      	//全选、全反选
		function doSelectAll(){
			$("input[name=selectedRow]").prop("checked", $("#selAll").is(":checked"));		
		}
      	//新增
      	function doAdd(){
      		document.forms[0].action = "${basePath}jxc/admin_addUI.action";
      		document.forms[0].submit();
      	}
      	//编辑
      	function doEdit(id){
      		document.forms[0].action = "${basePath}jxc/admin_editUI.action?admin.id=" + id;
      		document.forms[0].submit();
      	}
      	//删除
      	function doDelete(id){
      		document.forms[0].action = "${basePath}jxc/admin_delete.action?admin.id=" + id;
      		document.forms[0].submit();
      	}
      	//批量删除
      	function doDeleteAll(){
      		document.forms[0].action = "${basePath}jxc/admin_deleteSelected.action";
      		document.forms[0].submit();
      	}
      	//返回主页
      	function returnHome(){
      		document.forms[0].action = "${basePath}jxc/home.action";
      		document.forms[0].submit();
      	}
    </script>
</head>

<body>
<form name="form" action="" method="post" enctype="multipart/form-data">
	<table width="50%" border="1" cellspacing="0" cellpadding="0" align="center">
		<tr><td colspan="8" align="center">管理员列表</td></tr>
		<tr>
			<td width="30" align="center"><input type="checkbox" id="selAll"
				onclick="doSelectAll()" />
			</td>
			<td width="120" align="center">姓名</td>
			<td width="120" align="center">性别</td>
			<td width="120" align="center">账号</td>
			<td width="140" align="center">联系方式</td>
		</tr>
		<s:iterator value="adminList" status="st">
			<tr <s:if test="#st.odd">bgcolor="f8f8f8"</s:if>>
				<td align="center"><input type="checkbox" name="selectedRow" value="<s:property value='id'/>" />
				</td>
				<td align="center"><s:property value="realName" />
				</td>
				<td align="center"><s:property value="gender?'男':'女'"/> 
				</td>
				<td align="center"><s:property value="account" />
				</td>
				<td align="center"><s:property value="tel" />
				</td>
				<td align="center"><a
					href="javascript:doEdit('<s:property value='id'/>')">编辑</a> <a
					href="javascript:doDelete('<s:property value='id'/>')">删除</a></td>
			</tr>
		</s:iterator>
		<tr>
			<td colspan="8" align="center"><input type="button" value="新增" class="s_button" onclick="doAdd()" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" value="批量删除" class="s_button" onclick="doDeleteAll()"/>&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="返回首页" onclick="returnHome()"/></td>
		</tr>
	</table>
	<!--   <table width="100%" class="pageDown" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="right">
			                 	总共1条记录，当前第 1 页，共 1 页 &nbsp;&nbsp;
			                            <a href="#">上一页</a>&nbsp;&nbsp;<a href="#">下一页</a>
								到&nbsp;<input type="text" style="width: 30px;" onkeypress="if(event.keyCode == 13){doGoPage(this.value);}" min="1"
								max="" value="1" /> &nbsp;&nbsp;
						    </td>
						</tr>
					</table>-->
	</form>
</body>
</html>
