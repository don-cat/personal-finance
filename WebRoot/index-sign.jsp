<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index-sign.jsp' starting page</title>
    
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
  <%
  	request.setCharacterEncoding("UTF-8");//因为刚才的中文乱码了，所以这里让他渠道的属性变成utf8就不乱了
  %>
  <div align="right"><%=request.getSession().getAttribute("username") %> 您好</div>
  <hr/>
    <h1 align="center" style="color:green">猫驴理财</h1>
    <form action="/Servlet/commit" method="post">
    	<fieldset>
    		<legend>记录一笔</legend>
    	
	    	<label for="username">用户名：</label>
	    	<input type="text" name="username" /> 
	        <label for="pass">密码:</label>  
	        <input type="password" name="pass" /> 
	        <input type="submit" value="提交post"/>
        </fieldset>
    </form>
  </body>
</html>
