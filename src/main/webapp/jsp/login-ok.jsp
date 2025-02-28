<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String uiId = request.getParameter("uiId");
String uiPwd = request.getParameter("uiPwd");
String sql = "SELECT UI_NAME, UI_NUM, UI_ID, UI_PWD, UI_AGE, UI_PHONE, UI_ADDRESS,UI_TRANS FROM USER_INFO";
sql += " WHERE UI_ID=? AND UI_PWD=?";

Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/ezen";
String userName = "root";
String pwd = "r1r2r3";

Connection con = DriverManager.getConnection(url,userName,pwd);
PreparedStatement ps =con.prepareStatement(sql);
ps.setString(1, uiId);
ps.setString(2, uiPwd);
ResultSet rs = ps.executeQuery();
if(rs.next()){
	session.setAttribute("uiName",rs.getString("UI_NAME"));
	out.println(rs.getString("UI_NAME")+"님 반갑습니다.");
}else{
%>
로그인에 실패아였습니다.
<%	
}
%>