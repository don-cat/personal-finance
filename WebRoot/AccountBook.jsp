<%@page import="java.io.PrintWriter"%>
<%@page import="com.doncat.pf.service.QueryAccountService"%>
<%@page import="com.doncat.pf.model.Account" %>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  		$.ajax({
  			url:"/personal-finance/accountbook",
  			dataType:"json",
  			async:true,
  			data:{},
  			type:"get",
  			success:function(req){
  				JsonData=req;
  				$('#CurrencyType option').each(function(){
  					$(this).remove();
  				});
  				$('#RecordType option').each(function(){
  					$(this).remove();
  				});
  				
  				var CurrencyTypeMap=JsonData.data.CurrencyType;
  				$.each(CurrencyTypeMap, function(key, value){
  					$("#CurrencyType").append("<option value='"+key+"'>"+value+"</option> ");
  				}); 
  				var RecordTypeMap=JsonData.data.EnumExpenseType;
  				$.each(RecordTypeMap, function(key, value){
  					$("#RecordType").append("<option value='"+key+"'>"+value+"</option> ");
  				}); 
  			},
  			error:function(){
  				console.info("诶哟，出错了");
  			}
  		});
  	}
  </script>
  <body>
  <%
  	QueryAccountService queryAccount = new QueryAccountService();
  	ArrayList<Account> queryAccountList = queryAccount.QueryAccount("1488104129633");
  	int size = queryAccountList.size();
  %>
  
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
    			<h3><%=size%></h3>
    		</td>
    	</tr>
    </table>
  </body>
</html>
