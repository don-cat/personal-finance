<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tools.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1 align="center" style="color:green">猫驴理财</h1>
    <form action="/personal-finance/Servlet/signup" method="post">
    	<fieldset>
    		<legend>添加一条记录</legend>
    	
	    	<label>收/支：</label>
	    	<select name="收/支">
	    		<option value="1">收</option>
	    		<option value="0">支</option>
	    	</select> 
	        <label>金额:</label>  
	        <input type="test" name="amount" />
	        <label>类别：</label>
	    	<select name="收/支">
	    		<option value="1">收</option>
	    		<option value="0">支</option>
	    	</select>
	        <input type="submit" value="登陆"/>
        </fieldset>
    </form>
  </body>
</html>
