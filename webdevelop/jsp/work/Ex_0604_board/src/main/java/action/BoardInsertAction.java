package action;

import java.io.IOException;

import dao.BoardDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

@WebServlet("/insert.do")
public class BoardInsertAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String subject = request.getParameter("subject");
        String name = request.getParameter("name");
        String content = request.getParameter("content");
        String pwd = request.getParameter("pwd");
        String ip = request.getRemoteAddr();
        
        BoardVO vo = new BoardVO();
        vo.setSubject(subject);
        vo.setName(name);
        vo.setContent(content);
        vo.setPwd(pwd);
        vo.setIp(ip);
        
        int rs = BoardDAO.getInstance().insert(vo);
//        System.out.println("DAO에서 rs의 결과 : " + rs);
        if(rs > 0) {
        	response.sendRedirect("board_list");
        }
		
	}
}
