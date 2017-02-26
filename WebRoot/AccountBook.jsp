<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AccountBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript" src="/personal-finance/js/jquery-3.1.1.js"></script>
  <script type="text/javascript">
  	function getAccountBook(){
  		
  	}
  </script>
  <body>
    <h1 align="center" style="color:green">猫驴理财</h1>. <br>
    <table align="center" border="1">
    	<tr>	<!tr是行，td是列>
    		<th>收/支</th>
    		<th>金额</th>
    		<th>币种</th>
    		<th>日期</th>
    	</tr>
    	<tr>
    		<td>
    			row1,cell
    		</td>
    	</tr>
    </table>
  </body>
</html>
