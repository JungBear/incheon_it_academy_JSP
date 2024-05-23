<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	로그인 한 페이지
	
	<% 
		request.setCharacterEncoding("utf-8"); 
	
		String userId = request.getParameter("id");
		String userPwd = request.getParameter("pwd");	
		
		if(userId.equals("관리자") && userPwd.equals("1234")){
			response.sendRedirect("response01_success.jsp");
		}else{
			response.sendRedirect("response01_fail.jsp");
		}
	%>
	
</body>
</html>