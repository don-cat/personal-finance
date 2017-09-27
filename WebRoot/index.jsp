<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    		 
    <form action="/personal-finance/signup" method="post">
    	<fieldset>
    		<legend>登陆</legend>
    	
	    	<label for="username">用户名：</label>
	    	<input type="text" name="username" /> 
	        <label for="passwd">密码:</label>  
	        <input type="password" name="passwd"/> 
	        <input type="submit" value="登陆"/>
        </fieldset>
    </form>
    <form action="/personal-finance/register.jsp" method="post">
    	<fieldset>
    		<legend>注册</legend>
	        <input type="button" value="注册" onClick="window.location.href='register.jsp'"/>
        </fieldset>
        <fieldset>
    		<legend>记录一笔</legend>
	        <input type="button" value="记录一笔" onClick="window.location.href='SetRecord.jsp'"/>
        </fieldset>
    </form>
  </body>
</html>
