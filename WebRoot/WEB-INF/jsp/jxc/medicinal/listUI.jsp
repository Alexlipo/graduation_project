<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>药品管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
      	//全选、全反选
		function doSelectAll(){
			$("input[name=selectedRow]").prop("checked", $("#selAll").is(":checked"));		
		}
      	//新增
      	function doAdd(){
      		document.forms[0].action = "${basePath}jxc/medicinal_addUI.action";
      		document.forms[0].submit();
      	}
      	//查看详细信息
      	function showDetail(id){
      		document.forms[0].action = "${basePath}jxc/medicinal_showDetail.action?medicinal.id=" + id;
      		document.forms[0].submit();
      	}
      	//删除
      	function doDelete(id){
      		document.forms[0].action = "${basePath}jxc/medicinal_delete.action?medicinal.id=" + id;
      		document.forms[0].submit();
      	}
      	//批量删除
      	function doDeleteAll(){
      		document.forms[0].action = "${basePath}jxc/medicinal_deleteSelected.action";
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
	<table width="60%" border="1" cellspacing="0" cellpadding="0" align="center">
		<tr><td colspan="10" align="center">药品列表</td></tr>
		<tr>
			<td width="30" align="center"><input type="checkbox" id="selAll"
				onclick="doSelectAll()" />
			</td>
			<td width="30" align="center">编号</td>
			<td width="100" align="center">名称</td>
			<td width="100" align="center">生产厂家</td>
			<td width="240" align="center">备注</td>
		</tr>
		<s:iterator value="medicinalList" status="st">
			<tr <s:if test="#st.odd">bgcolor="f8f8f8"</s:if>>
				<td align="center"><input type="checkbox" name="selectedRow" value="<s:property value='id'/>" />
				</td>
				<td align="center"><s:property value="code" />
				</td>
				<td align="center"><s:property value="name" />
				</td>
				<td align="center"><s:property value="producer" />
				</td>
				<td align="center"><s:property value="remark" />
				</td>
				<td align="center"><a
					href="javascript:showDetail('<s:property value='id'/>')">查看详细信息</a> <a
					href="javascript:doDelete('<s:property value='id'/>')">删除</a></td>
			</tr>
		</s:iterator>
		<tr>
			<td colspan="10" align="center"><input type="button" value="新增" class="s_button" onclick="doAdd()" />&nbsp;&nbsp;&nbsp;&nbsp;
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
