package action;

import java.io.IOException;

import dao.BoardDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vo.BoardVO;

@WebServlet("/view")
public class BoardViewAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		
		int idx =Integer.parseInt(request.getParameter("idx"));
		
		//조회수를 올린다는 것은 readhit를 1을 더하여 update문을 작성
		BoardDAO dao = BoardDAO.getInstance();
		
		// 게시글 조회
		BoardVO vo = dao.selectOne(idx);
		
		HttpSession session = request.getSession();
		
		String show = (String) session.getAttribute("show");
		
		if(show == null) {
			int res = dao.update_readhit(idx);
			session.setAttribute("show", "1");
		}
		
		// 조회수 증가
		
		
		request.setAttribute("vo", vo);
		
		RequestDispatcher disp = request.getRequestDispatcher("board_view.jsp");
		// board_view.jsp로 포워딩하고 출력
		disp.forward(request, reponse);
	}
}
