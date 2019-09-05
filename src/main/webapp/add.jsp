<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index2.css"/>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.post("findflAll.do",function(data){
			for(var i in data){
				$("#cid").append("<option value='"+data[i].cid+"'>"+data[i].cname+"</option>")
			}
		},"json")
		
		$("#cid").change(function (){
			var id = $(this).val();
			$.post("findppAll.do",{"cid":id},function(data){
				for(var i in data){
					$("#bid").append("<option value='"+data[i].bid+"'>"+data[i].bname+"</option>")
				}
			},"json")
			$("#bid").empty();
		})
	})
</script>
</head>
<body>
商品分类<select id="cid" name="cid">
	   	<option value="0">请选择</option>
	   </select><br>
品&nbsp;牌<select id="bid" name="bid">
	   	<option value="0">请选择</option>
	   </select><br>
商品名称:<input type="text" name=""><br>
描述:<input type="text" name=""><br>
商品价格:<input type="text" name=""><br>
	<input type="button" value="提交" onclick="add()">
	<input type="reset" value="重置">
</body>
</html>