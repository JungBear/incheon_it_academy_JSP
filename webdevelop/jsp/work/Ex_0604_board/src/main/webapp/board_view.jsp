<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function reply(){
		location.href = "reply_form.jsp?idx=${vo.idx}";
	}
	
	// 목적지 : del
	// 파라미터 : idx
	function del(){
		if(!confirm("삭제하시겠습니까?")){
			return;
		}
		let pwd = "${vo.pwd}";
		let c_pwd = document.getElementById("c_pwd").value;
		
		if(pwd != c_pwd){
			alert("비밀번호 불일치");
			return;
		}
		
		let url = "del?idx=${vo.idx}";
		
		fetch(url)
		.then(res => res.json())
		.then(data =>{
			if(data.param === 'yes'){
				alert('삭제성공');
				location.href="board_list";
			}else{
				alert("삭제 실패");
			}
		})
		
	}
	
</script>
</head>
<body>
	<table border="1" align="center">
		<caption>:::게시글 상세보기:::</caption>
		<tr>
			<th>제목</th>
			<td>${vo.subject}</td>
		</tr>
		
		<tr>
			<th>작성자</th>
			<td>${vo.name}</td>
		</tr>
		
		<tr>
			<th>작성일</th>
			<td>${fn:split(vo.regdate,' ')[0]}</td>
		</tr>
		
		<tr>
			<th>ip</th>
			<td>${vo.ip}</td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td width="500px" height="200px"><pre>${vo.content}</pre></td>
		</tr>
		
		<tr>
			<th>비밀번호</th>
			<td>
				<input type="password" id="c_pwd">
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<img src="img/btn_list.gif" onclick="location.href='board_list'" style="cursor: pointer">
				<img src="img/btn_reply.gif" onclick="reply()" style="cursor:pointer">
				<img src="img/btn_delete.gif" onclick="del()" style="cursor: pointer">
			</td>
		</tr>
		
	</table>
</body>
</html>