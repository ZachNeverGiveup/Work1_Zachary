<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息新增</title>
<link rel="stylesheet" href="<%=basePath%>css/mdui.css">
<link
	href="<%=basePath%>css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
	<style type="text/css">
<!--
a:link {
	text-decoration: none;
}

a:visited {
	text-decoration: none;
}

a:hover {
	text-decoration: none;
}

a:active {
	text-decoration: none;
}
-->
</style>
</head>
<body class="mdui-theme-primary-blue mdui-theme-accent-blue  mdui-color-grey-200"
	style="height:1000px">
	<div class="mdui-appbar  mdui-appbar-fixed">
		<div class="mdui-toolbar mdui-color-theme">
			<a id="toggle" href="javascript:;" class="mdui-btn mdui-btn-icon"><i
				class="mdui-icon material-icons">menu</i></a>
			<h3>消息新增  - ConnextSystem</h3>
			<div class="mdui-toolbar-spacer"></div>
			<div
				class="mdui-textfield mdui-textfield-expandable mdui-float-right">
				<button class="mdui-textfield-icon mdui-btn mdui-btn-icon">
					<i class="mdui-icon material-icons">search</i>
				</button>
				<input class="mdui-textfield-input" type="text" placeholder="Search" />
				<button class="mdui-textfield-close mdui-btn mdui-btn-icon">
					<i class="mdui-icon material-icons">close</i>
				</button>
			</div>
			<h4>欢迎回来，用户${user.userphone}</h4>
			<h5>当前积分：${user.usergrade}</h5>
		</div>

	</div>
<div class="col-md-1" style="margin-top: 100px"></div>
<div class="mdui-container mdui-color-grey-100 col-md-10" style="margin-top: 100px;height:800px;">
		<div class="col-md-2" style="margin-top: 100px"></div>
		<div class="col-md-8" style="margin-top: 100px">
			<form action="<%=basePath%>addMsg.do" method="post" >
				<div class="mdui-textfield mdui-textfield-floating-label" id="userphone">
					<i class="mdui-icon material-icons">&#xe3c9;</i> 
					<label class="mdui-textfield-label">在此填写标题</label> 
					<input id="mt" name="msgtitle" class="mdui-textfield-input"  />
					<input type="hidden" name="msguser" class="mdui-textfield-input" value="${user.userid}"  />
				</div>
				<div class="mdui-textfield mdui-textfield-floating-label" id="userphone">
					<i class="mdui-icon material-icons">message</i> 
					<label class="mdui-textfield-label">在此填写内容</label> 
					<input id="mc" name="msgcontent" class="mdui-textfield-input"   />
				</div>
				<button id="mu" class="mdui-btn mdui-btn-block mdui-color-blue mdui-ripple" >
					<i class="mdui-icon material-icons">touch_app</i>完成
				</button>
			</form>
		</div>
	</div>
<div class="col-md-2" style="margin-top: 100px"></div>

<div class="col-md-1" style="margin-top: 100px"></div>
  
	
</body>
<script src="<%=basePath%>js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="<%=basePath%>js/mdui.js"></script>
<script src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript">
// 欢迎提示
mdui.snackbar({
    message: '进入新建消息模式……',
    position: 'top'
});

</script>
</html>