<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function reply(){
		location.href="reply_form?idx=${vo.idx}&page=${param.page}";
	}
	
	//목적지 : del
	//파라미터 : idx
	function del(){
		if(!confirm("삭제하시겠습니까?")){
			return
		}
		
		let pwd = "${vo.pwd}" //원본 비밀번호
		let c_pwd = document.getElementById("c_pwd").value; //입력한 비밀번호
		
		if(pwd != c_pwd){
			alert("비밀번호 불일치")
			return
		}
		
		let url = "del?idx=${vo.idx}"
				
		fetch(url)
		.then(response => response.json())
		//data = {"param":"yes"}
		.then(data =>{
			if(data.param === 'yes'){
				alert('삭제 성공')
				location.href="board_list?page=${param.page}"
			} else{
				alert("삭제 실패")
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
			<td>${vo.regdate}</td>
		</tr>
		<tr>
			<th>ip</th>
			<td>${vo.ip}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td width="500px" height="200px">${vo.content}</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" id="c_pwd"></td>
		</tr>
		<tr>
			<td colspan="2">
				<img src="resources/img/btn_list.gif" onclick="location.href='board_list?page=${param.page}'">
				<img src="resources/img/btn_reply.gif" onclick="reply()">
				<img src="resources/img/btn_delete.gif" onclick="del()">
			</td>
		</tr>
	</table>
	<!-- 테이블, ${vo.name},${vo.subject},${vo.content} -->
</body>
</html>






