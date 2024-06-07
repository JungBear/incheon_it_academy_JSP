package action;

import java.io.IOException;
import java.util.List;

import dao.BoardDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vo.BoardVO;

@WebServlet("/board_list")
public class BoardListAction extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전체 목록 가져오기
		List<BoardVO> list = BoardDAO.getInstance().selectList();

		// 게시글을 나왔다가 들어갈 때 조회수를 올려주기 위해 세션을 초기화
		request.getSession().removeAttribute("show");
		
		request.setAttribute("list", list);
		
		
		RequestDispatcher disp = request.getRequestDispatcher("board_list.jsp");
		disp.forward(request, response);
	}
}
