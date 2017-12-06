<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>
<script type="text/javascript" src="http://static.jjshome.com/js/common/jquery-min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			$.post("../hello/getPerson", 
			{
				name1:$("#name").val(),
				name2:$("#name").html()
			}, 
			function(data) {
				var name= $(data).find("name").text();
				alert(name);
				$("#data1").empty().append("<h2><a>"+name+"</a></h2>");
			});
		});
	});
</script>
</head>

<body>
	<div id="data1"></div>
	haha_home
	<form action="qqq">
		<input type="submit" value="提交">
	</form>
	<button id="name" value="hhh">sgs</button>
	<button id="btn">name</button>
</body>
</html>