
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Map<String,String> map = new HashMap<>();
int i = 1;
out.println(i); 
%> //스크립틀릿이라고 불린다
<%
out.println(i);
%>
<%=i//out.println(i); 생략됨, 표현식
%>
</body>
</html>