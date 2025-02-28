<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%



%> 
page 이름: <%=pageContext.getAttribute("이름")%><br>
request 이름: <%=request.getAttribute("이름")%><br>
session 이름: <%=session.getAttribute("이름")%><br>
application이름: <%=application.getAttribute("이름")%><br>