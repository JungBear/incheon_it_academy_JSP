<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send_check(){
		let f = document.f;
		
		let subject = f.querySelector('input[name="subject"]').value;
		let name = f.querySelector('input[name="name"]').value;
		let content = f.querySelector('textarea[name="content"]').value;
		let pwd = f.querySelector('input[name="pwd"]').value;
		
		if(subject.trim() == '' || subject == null){
			alert("제목을 입력하세요.");
			return;
		}
		
		if(name.trim() == '' || name == null){
			alert("작성자를 입력하세요.");
			return;
		}
		
		if(content.trim() == '' || content == null){
			alert("내용을 입력하세요.");
			return;
		}
		
		if(pwd.trim() == '' || pwd == null){
			alert("비밀번호를 입력하세요.");
			return;
		}
		
		f.submit();
	}
	
</script>
</head>
<body>
	<form name="f" method="post" action="reply">
		<input type="hidden" name="idx" value="${param.idx }">
		<table border="1" align="center">
			<caption>:::답글쓰기:::</caption>
			<tr>
				<th>제목</th>
				<td><input name="subject"></td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td><input name="name"></td>
			</tr>	
			
			<tr>
				<th>내용</th>
				<td><textarea name="content" rows="10" cols="50" style="resize:none;"></textarea></td>
			</tr>
			
			<tr>	
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			
			<tr>
				<td align="center" colspan="2">
					<img src="img/btn_reg.gif" onclick="send_check()">
					<img src="img/btn_back.gif" onclick="location.href='board_list'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>