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
<title>消息列表</title>
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
			<h3>消息列表  - ConnextSystem</h3>
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
<div class="mdui-container mdui-color-grey-50 col-md-10" style="margin-top: 100px;height:800px;">
		<div class="col-md-2" style="margin-top: 100px">
			<a href="<%=basePath%>toAdd.do">
		            <button id="ma" 
		            		class="mdui-btn mdui-color-green-200 mdui-ripple" >
						新增
					</button>
			</a>
		</div>
		<div class="col-md-8" style="margin-top: 100px">
		<table class="mdui-table ">
        <thead>
        <tr>
            <th style="white-space: nowrap; text-align:center">消息标题</th>
            <th style=" white-space: nowrap; text-align:center" class="mdui-table-col-numeric">时间</th>
            <th style="white-space: nowrap; text-align:center" class="mdui-table-col-numeric">消息详情</th>
            <th style=" white-space: nowrap; text-align:center" class="mdui-table-col-numeric">编辑</th>
            <th style="white-space: nowrap; text-align:center" class="mdui-table-col-numeric">删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${msglist}" var="msg">
	        <tr class="mdui-table-row-selected">
	            <td style="width:100px; white-space: nowrap; text-align:center"  mdui-tooltip="{content: '这条消息的标题'}">${msg.msgtitle}</td>
	            
	            <td class="msgdate" style="width:100px; white-space: nowrap; text-align:center" mdui-tooltip="{content: '这条消息的时间'}"><fmt:formatDate value="${msg.msgdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	            <td style="white-space: nowrap"  mdui-tooltip="{content: '点击按钮查看该消息详情'}">
		            <button id="mm" 
		            		class="mdui-btn mdui-color-blue mdui-ripple" 
		            		onclick="moreMsg(${msg.msgid},this)">
						查看详情
					</button>
				</td>
	            <td style="white-space: nowrap" mdui-tooltip="{content: '点击按钮对该消息进行编辑'}">
	            <a href="<%=basePath%>toEdit.do?msgid=${msg.msgid}">
		            <button id="me" 
		            		class="mdui-btn mdui-color-green mdui-ripple" >
						编辑
					</button>
				</a>
				</td>
	            <td style="white-space: nowrap;  "  mdui-tooltip="{content: '点击按钮删除该消息'}">
		            <button id="md" 
		            		class="mdui-btn mdui-color-red mdui-ripple" 
		            		onclick="delAd(${msg.msgid},this)">
						删除
					</button>
				</td>
	        </tr>
        </c:forEach>
        </tbody>
    </table>
			

		</div>
	</div>
<div class="col-md-2" style="margin-top: 100px"></div>

<div class="col-md-1" style="margin-top: 100px"></div>
  <div class="mdui-dialog" id="dialog">
    <div class="mdui-dialog-title">你确定要删除吗?</div>
    <div class="mdui-dialog-content">你将会失去这条消息的所有信息！</div>
    <div class="mdui-dialog-actions">
      <button class="mdui-btn mdui-ripple" mdui-dialog-cancel>算了</button>
      <button id="dc" class="mdui-btn mdui-ripple mdui-color-blue" mdui-dialog-confirm>确定</button>
    </div>
  </div>	
	 <div class="mdui-dialog" id="dialog2">
    <div class="mdui-dialog-title">
	    <h1 class="mdui-text-color-blue"  style="text-align: middle" id="messageTitle"></h1>
	    <h4 class="mdui-text-color-grey"  style="text-align: middle" id="messageDate"></h4>
    </div>
    <div class="mdui-dialog-content"><h2 class="mdui-text-color-black"  id="messageContent"></h2></div>
    <div class="mdui-dialog-actions">
      <button class="mdui-btn mdui-ripple" mdui-dialog-cancel>关闭</button>
    </div>
  </div>	
	
</body>
<script src="<%=basePath%>js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="<%=basePath%>js/mdui.js"></script>
<script src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript">
//欢迎提示
mdui.snackbar({
    message: '欢迎进入消息列表！',
    position: 'top'
});
//删除消息
function delAd(id,_this) {
	var _this=$(_this);
	new mdui.Dialog('#dialog').open();
	$('#dc').click(function () {
  		$.post("<%=basePath%>msgDel.do",
	  {
	    msgid:id,
	  },
	  function(data,status){
	     mdui.snackbar({
            message: '删除成功！',
            position: 'top'
        });
        console.log($(this).parents(".mdui-table-row-selected"));
       _this.parents(".mdui-table-row-selected").remove();
	  });
});
}
//查看消息
function formatDate(now)
{ 
var year=now.getYear()+1900; 
var month=now.getMonth()+1; 
var date=now.getDate(); 
var hour=now.getHours(); 
var minute=now.getMinutes(); 
var second=now.getSeconds(); 
return year+"年"+month+"月"+date+"日  "+hour+":"+minute+":"+second; 
} 

function moreMsg(id,_this) {
	var _this=$(_this);
	
  		$.post("<%=basePath%>msgMore.do",
	  {
	    msgid:id,
	  },
	  function(data,status){
		  new mdui.Dialog('#dialog2').open();
       	  $("#messageTitle").text(data.msgtitle);
		  $("#messageContent").text(data.msgcontent);
		  var d=new Date(data.msgdate); 
		  $("#messageDate").text(formatDate(d));
	  });
}
</script>
</html>