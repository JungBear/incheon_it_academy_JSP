package action;

import java.io.IOException;

import dao.BoardDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

@WebServlet("/del")
public class BoardDeleteAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
//		System.out.println(idx);
		
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardVO vo = dao.selectOne(idx);
		
		vo.setSubject("삭제된 글입니다.");
		vo.setName("unknown");
		
		int rs = dao.del_update(vo);
		
		if(rs > 0) {
		    response.getWriter().print("{\"param\":\"yes\"}");
		} else {
		    response.getWriter().print("{\"param\":\"no\"}");
		}
		
		
	}
}
