<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String uiName = request.getParameter("uiName");
String uiId = request.getParameter("uiId");
String uiPwd = request.getParameter("uiPwd");
String uiAgestr = request.getParameter("uiAge");
int uiAge = 0;
try {
	uiAge = Integer.parseInt(uiAgestr);
} catch (NumberFormatException nfe) {
	out.println("나이를 잘못 입력하셨습니다. 확인해주세요");
	out.println("<button onclick='history.back()'>돌아가기</button>");
	return;
}

String uiPhone = request.getParameter("uiPhone");
String uiAddress = request.getParameter("uiAddress");
String uiTrans = request.getParameter("uiTrans");

String driverName = "com.mysql.cj.jdbc.Driver";
Class.forName(driverName);
String url = "jdbc:mysql://localhost:3306/ezen";
String password = "r1r2r3";
String username = "root";
Connection con = DriverManager.getConnection(url, username, password);
String sql = "insert into USER_INFO(UI_NAME, UI_AGE, UI_ID, UI_PWD, \r\n"
		+ "UI_PHONE, UI_ADDRESS,UI_TRANS)\r\n"
		+ "VALUES(?,?,?,?,?,?,?)";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, uiName);
ps.setInt(2, uiAge);
ps.setString(3, uiId);
ps.setString(4, uiPwd);
ps.setString(5, uiPhone);
ps.setString(6, uiAddress);
ps.setString(7, uiTrans);
int result = ps.executeUpdate();
if(result==1){
%>
<%=uiName%>님 회원가입에 성공하였습니다.
<%
}else{
%>	
회원가입에 실패하였습니다 다시 시도해주시길 바랍니다.
<%
}
%>
니가 입력한 이름
<%=uiName%><br>
니가 입력한 아이디
<%=uiId%><br>
니가 입력한 비밀번호
<%=uiPwd%><br>
니가 입력한 나이
<%=uiAge%><br>
니가 입력한 전화번호
<%=uiPhone%><br>
니가 입력한 주소<%=uiAddress%><br>
너의 성별<%=uiTrans%><br>