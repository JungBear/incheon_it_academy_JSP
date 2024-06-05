package action;

import java.io.IOException;

import dao.BoardDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

@WebServlet("/view")
public class BoardViewAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		
		int idx =Integer.parseInt(request.getParameter("idx"));
		
		BoardVO vo = BoardDAO.getInstance().selectOne(idx);
		
		request.setAttribute("vo", vo);
		
		RequestDispatcher disp = request.getRequestDispatcher("board_view.jsp");
		// board_view.jsp로 포워딩하고 출력
		disp.forward(request, reponse);
	}
}
