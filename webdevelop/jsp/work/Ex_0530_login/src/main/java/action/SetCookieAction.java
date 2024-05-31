package action;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class SetCookieAction extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 쿠키 생성
		Cookie cookie = new Cookie("param1", "asdf");

		// 쿠키의 기한 정하기
		// 만료날짜를 생략하면 브라우저 종료시 까지만 유지(세션 쿠키)
		// 만료 날짜를 입력하면 해당 날짜까지 유지(영속 쿠키)
		cookie.setMaxAge(60*60*24*7); // 일주일
		
		// 쿠키의 삭제
		// Cookie클래스는 쿠키를 삭제하는 기능을 별도로 제공하지 않는다.
		// 쿠키를 더 유지할 필요가 없으면 쿠키의 유효기간을 만료하면 된다.
		// setmaxAge()메서드의 유효기간을 0으로 설정하여 쿠키를 삭제할 수 있다.
		cookie.setMaxAge(0);
		
		// 쿠키 추가하기
		response.addCookie(cookie);
		response.sendRedirect("ex01_Cookie.jsp");
		
	}
	
}
