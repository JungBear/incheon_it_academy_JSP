package action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import dao.BoardDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.Common.Board;
import util.Page;
import vo.BoardVO;

@WebServlet("/board_list")
public class BoardListAction extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int nowPage = 1;
		
		// start등부터 end등까지만 조회
		String page = request.getParameter("page");
		if(page == null) {
			nowPage = 1;
		}else {
			nowPage = Integer.parseInt(page);
		}

		// 페이지가 1이면 1~10까지
		// 페이자가 2이면 11~20 까지
		int start = (nowPage - 1) * Board.BLOCKLIST + 1; 
		int end = nowPage * Board.BLOCKLIST; 
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		
		// 전체 목록 가져오기
		List<BoardVO> list = BoardDAO.getInstance().selectList(map);
		
		// 전체 게시물 수 조회
		int rowTotal = BoardDAO.getInstance().getRowTotal();
		
		// 페이지메뉴 생성하기
		String pageMenu = Page.getPage("board_list", nowPage, rowTotal, Board.BLOCKLIST, Board.BLOCKPAGE);

		// 게시글을 나왔다가 들어갈 때 조회수를 올려주기 위해 세션을 초기화
		request.getSession().removeAttribute("show");
		
		request.setAttribute("list", list);
		request.setAttribute("pageMenu", pageMenu);
		
		
		RequestDispatcher disp = request.getRequestDispatcher("board_list.jsp");
		disp.forward(request, response);
	}
}
