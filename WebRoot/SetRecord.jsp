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
  	/**function addEnumType(){
  		$.ajax({
  			url:"/personal-finance/Servlet/GetTypeServlet",
  			dataType:"json",
  			async:true,
  			data:{"item":"RecordType"},
  			type:"get",
  			success:function(req){
  				$('#RecordType option').each(function(){
  					$(this).remove();
  				});
  				
  				var TypeArray=req.type.split(",");
  				for(var i=0;i<TypeArray.length;i++){
  					$("#RecordType").append("<option value='"+i+"'>"+TypeArray[i]+"</option> ");
  				}
  			},
  			error:function(){
  				console.info("诶哟，出错了");
  			}
  		});
  	}**/
  	function addEnumType2(){
  		var item = new Array();
  		item.push('RecordType');
  		item.push('CurrencyType');
  		$.ajax({
  			url:"/personal-finance/Servlet/GetTypeServlet",
  			dataType:"json",
  			async:true,
  			data:{"item[]":item},
  			type:"get",
  			success:function(req){
  				console.info("成功")
  				$('#CurrencyType option').each(function(){
  					$(this).remove();
  				});
  				
  				var TypeArray=req.RecordType.split(",");
  				for(var i=0;i<TypeArray.length;i++){
  					$("#RecordType").append("<option value='"+i+"'>"+TypeArray[i]+"</option> ");
  				}
  				var TypeArray=req.CurrencyType.split(",");
  				for(var i=0;i<TypeArray.length;i++){
  					$("#CurrencyType").append("<option value='"+i+"'>"+TypeArray[i]+"</option> ");
  				}
  			},
  			error:function(){
  				console.info("诶哟，出错了");
  			}
  		});
  	}
  </script>
  
  <body onload="addEnumType2()">
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
	    	<label>币种：</label>
	    	<select id="CurrencyType" name="收/支">
	    		<option value="0" > 所有币种 </option>
	    	</select>
	        <input type="submit" value="完成"/>
        </fieldset>
    </form>
  </body>
</html>
