<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>库存管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
      	//查看详细信息
      	function showDetail(id){
      		document.forms[0].action = "${basePath}jxc/medicinal_showDetail.action?medicinal.id=" + id;
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
	<table width="30%" border="1" cellspacing="0" cellpadding="0" align="center">
		<tr><td colspan="6" align="center">中成药库存列表</td></tr>
		<tr>
			<td width="120" align="center">药品名称</td>
			<td width="100" align="center">数量</td>
		</tr>
		<s:iterator value="stockList" status="st">
			<tr <s:if test="#st.odd">bgcolor="f8f8f8"</s:if>>
				<td align="center"><s:property value="medicinal.name" />
				</td>
				<td align="center"><s:property value="amount" />
				</td>
				<td align="center"><a href="javascript:showDetail('<s:property value='medicinal.id'/>')">查看药品详细信息</a>
				</td>
			</tr>
		</s:iterator>
		<tr>
			<td colspan="3" align="center"><input type="button" value="返回首页" onclick="returnHome()"/></td>
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
