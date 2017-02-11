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
  <script type="text/javascript" src="/personal-finance/js/jquery-3.1.1.js"></script>
  <script type="text/javascript">
  	function addRecordType(){
  		$.ajax({
  			url:"/personal-finance/Servlet/GetTypeServlet",
  			dataType:"json",
  			async:true,
  			data:{},
  			type:"get",
  			success:function(req){
  				$('#RecordType option').each(function(){
  					$(this).remove();
  				});
  				
  				var TypeArray=req.type.split(",");
  				for(var i=1;i<TypeArray.length;i++){
  					$("#RecordType").append("<option value='"+i+"'>"+TypeArray[i]+"</option> ");
  				}
  			},
  			error:function(){
  				console.info("诶哟，出错了");
  			}
  		});
  	}
  </script>
  
  <body onload="addRecordType()">
    <h1 align="center" style="color:green">猫驴理财</h1>
    <form action="/personal-finance/Servlet/GetTypeServlet">
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
	        
	    	<select id="RecordType" name="收/支">
	    		<option value="0" > 获取收支类型 </option>
	    	</select>
	        <input type="submit" value="登陆"/>
        </fieldset>
    </form>
  </body>
</html>
