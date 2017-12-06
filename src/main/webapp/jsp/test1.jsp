<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://static.jjshome.com/js/common/jquery-min.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		$("button").click(function() {
			$("p").hide();
		});
	});
	
	var jsonStr="{'name':'suguisen'}";
	//alert(jsonStr);
	var jsonStr=eval("("+jsonStr+")");
	alert(jsonStr.name);
</script>
</head>
<body>

<h2>This is a heading</h2>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<button type="button">Click me</button>


</body>
</html>