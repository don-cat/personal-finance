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
  	var JsonData=null;
  	function onAccountTypeChange(){
  		//拿accountType下拉框的值
  		var accountTypeNum=$("#accountType").val();
  		var type;
  		if(accountTypeNum==1){//如果是收
  			type=JsonData.data.EnumIncomeType;
  		}else{//如果是支
  			type=JsonData.data.EnumExpenseType;
  		}
  		$('#RecordType option').each(function(){
				$(this).remove();
			});
  		$.each(type, function(key, value){
			$("#RecordType").append("<option value='"+key+"'>"+value+"</option> ");
		});
  	}

  	function addEnumType2(){
  		var item = new Array();
  		item.push('RecordType');
  		item.push('CurrencyType');
  		$.ajax({
  			url:"/personal-finance/gettypeservlet",
  			dataType:"json",
  			async:true,
  			data:{"item[]":item},
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
  
  <body onload="addEnumType2()">
    <h1 align="center" style="color:green">猫驴理财</h1>
    <form action="/personal-finance/setrecordservlet" method="post">
    	<fieldset>
    		<legend>添加一条记录</legend>
    	
	    	<label>收/支：</label>
	    	<select id="accountType" name="accountType" onchange="onAccountTypeChange()">
	    		<option value="1">收</option>
	    		<option value="0">支</option>
	    	</select> 
	        <label>金额:</label>  
	        <input id="amount" type="test" name="amount" />
	        <label>类别：</label>
	    	<select id="RecordType" name="RecordType">
	    		<option value="0" > 获取收支类型 </option>
	    	</select>
	    	<label>币种：</label>
	    	<select id="CurrencyType" name="CurrencyType">
	    		<option value="0" > 所有币种 </option>
	    	</select>
	        <input type="submit" value="完成"/>
        </fieldset>
    </form>
  </body>
</html>
