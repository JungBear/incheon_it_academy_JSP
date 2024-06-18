<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	let b_idCheck = false;
	// member_insert
	function send(f){
		let id = f.id.value.trim();
		let pwd = f.pwd.value.trim();
		let name = f.name.value.trim();
		let email = f.email.value.trim();
		
		if(id == ''){
			alert("아이디를 입력해주세요.");
			return;
		}
		if(pwd == ''){
			alert("비밀번호를 입력해주세요.");
			return;
		}
		if(name == ''){
			alert("이름를 입력해주세요.");
			return;
		}
		if(email == ''){
			alert("이메일을 입력해주세요.");
			return;
		}
		
		if(!b_idCheck){
			alert("아이디 중복검사를 실행해 주세요.");
			return;
		}
		
		let url = "member_insert";
		let bodyform = "id=" + id + "&pwd=" + pwd + "&name=" + name + "&email=" + email;
		
		fetch(url, {
			method : 'post',
			headers : {'Content-Type' : 'application/x-www-form-urlencoded'},
			body : bodyform
		})
		.then(res => res.json())
		.then( data =>{
			if(data.param == 'yes'){
				alert("회원가입이 완료되었습니다.");
				location.href = "board_list";
				return;
			}else if(data.param == 'error'){
				alert("오류가 발생하였습니다.");
				return;
			}
		})
	}
	
	function check_id(){
		let id = document.getElementById("id").value;
		
		if(id==''){
			alert('아이디를 입력하세요');
			return;
		}
		
		let url = "check_id";
		let bodyForm = 'id=' + id;
		
		fetch(url, {
			method : 'post',
			headers : {'Content-Type' : 'application/x-www-form-urlencoded'},
			body : bodyform
		})
		.then(res => res.json())
		.then(data => {
			if(data.param == 'exist'){
				alert("사용 가능한 아이디입니다.");
				b_idCheck = true;
			}else if(data.param == 'noexist'){
				alert("이미 사용중인 아이디입니다");
			}
		})
	}
		

</script>
</head>
<body>
	<form>
		<table border="1" align="center">
			<caption>:::회원가입:::</caption>
			
			<tr>
				<th>아이디</th>
				<td><input name="id" id="id">
					<input type="button" value="중복체크" onclick="check_id()">
				</td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td><input name="name"></td>
			</tr>
			<tr>
			
				<th>이메일</th>
				<td><input name="email"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="가입" onclick="send(this.form)">
					<input type="button" value="취소" onclick="location.href='board_list'">
				</td>
			</tr>					
		</table>
	</form>
</body>
</html>