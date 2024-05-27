<%@page import="java.util.List"%>
<%@page import="dao.MemberDAO"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    	<% 
    		MemberDAO dao = MemberDAO.getInstance();
    		List<MemberVO> list = dao.selectList();
    	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type ="text/javascript">

	function del(idx){
		if(!confirm("삭제하시겠습니까?")){
			return;
		}
		loaction.href="member_del.jsp?idx="+idx;
	}
</script>
</head>
<body>
	<table border = "1">
		<caption>:::회원목록:::</caption>
		<tr>
			<th>회원번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>SP
			<th>이메일</th>
			<th>비고</th>
		</tr>
		
		<%for(int i = 0; i<list.size(); i++){ 
			MemberVO mv = list.get(i);
		%>
		
			<tr>
				<td><%=mv.getIdx() %></td>
				<td><%=mv.getName() %></td>
				<td><%=mv.getId() %></td>
				<td><%=mv.getPwd() %></td>
				<td><%=mv.getEmail() %></td>
				<td>
			<%-- 		<input type="button" value="삭제" onclick="del('<%= mv.getIdx() >%')"> --%>
				</td>
			</tr>
			
		<%} %>
		
			
	</table>
	
	<input type= "button" value="추가"  onclick="location.href='member_register_form.jsp'">
</body>
</html>