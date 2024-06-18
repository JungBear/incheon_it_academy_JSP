<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send(f){
		let id = f.id.value.trim();
		let pwd = f.pwd.value.trim();
		
		if(id == '' || id == null){
			alert("아이디를 입력하세요");
			return;
		}
		
		if(pwd == '' || pwd == null){
			alert("비밀번호를 입력하세요");
			return;
		}
		
		let url = "login";
		let bodyform = "id=" + id + "&pwd=" + pwd;
		
		fetch(url, {
			method : 'post',
			headers : {'Content-Type' : 'application/x-www-form-urlencoded'},
			body : bodyform
		})
		.then(res => res.json())
		.then(data => {
			/* console.log(data.param) */
			if(data.param === "yes"){
				location.href = "board_list";
				return;
			}else if(data.param === 'no'){
				alert("아이디 또는 비밀번호가 잘못되었습니다.");
				return;
			}else{
				alert("오류가 발생했습니다.");
				return;
			}
		})
		
	}
</script>
</head>
<body>
	<form>
		<table border = "1" align ="center">
			<caption>:::로그인:::</caption>
			
			<tr>
				<th>아이디</th>
				<td><input name = "id"></td>
			</tr>
				
			<tr>
				<th>비밀번호</th>
				<td><input name = "pwd" type="password"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="로그인" onclick="send(this.form)">
					<input type="button" value="회원가입" onclick="location.href='register_form'">
					<input type="button" value="취소" onclick="location.href='board_list'">
				</td>
			</tr>				
			
		</table>
	
	</form>

</body>
</html>