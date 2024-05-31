package action;

import java.io.IOException;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vo.MemberVO;

@WebServlet("/login.do")
public class LoginAction extends HttpServlet{
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberVO vo = MemberDAO.getInstance().selectOne(id);
		
		System.out.println("서비스에서 디비 이후");
		String param = "";
		String resultStr = "";
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		if(vo == null) {
			param = "no_id";
			resultStr = String.format("[{'param':'%s'}]", param);
			response.getWriter().print(resultStr);
			return;
		}
		
		if(!vo.getPwd().equals(pwd)) {
			param = "no_pwd";
			resultStr = String.format("[{'param':'%s'}]", param);
			response.getWriter().print(resultStr);
			return;
		}
		System.out.println("아이디 비번 검사 후");
		
		
		
		// 아이디와 비밀번호 체크가 문제가 없다면 세션에 바인딩
		// 세션은 서버의 메모리를 사용하기 때문에 많이 사용할수록 브라우저가 느려지기 때문에
		// 필요한 곳에서만 사용하도록 한다
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(3600);
		session.setAttribute("vo", vo);
		
		param = "clear";
		resultStr = String.format("[{'param':'%s'}]", param);
		response.getWriter().print(resultStr);
		System.out.println("서비스 끝");
		System.out.println("param : " + param);
		
	}
}
