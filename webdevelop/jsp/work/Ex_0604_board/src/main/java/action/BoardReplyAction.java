package action;

import java.io.IOException;

import dao.BoardDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

@WebServlet("/reply")
public class BoardReplyAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		String subject = request.getParameter("subject");
        String name = request.getParameter("name");
        String content = request.getParameter("content");
        String pwd = request.getParameter("pwd");
        String ip = request.getRemoteAddr();

        BoardDAO dao = BoardDAO.getInstance();
        // 기준글의 idx를 이용해서 기준글의 정보를 먼저 가져온다.
        BoardVO boardVO = dao.selectOne(idx);
        
        // 같은 ref를 갖고 있는 게시글 중 내가 추가하려고 하는 step보다 큰 게시글의 step을 +1을 한다
        int rs = dao.update_step(boardVO);
                
        BoardVO replyVO = new BoardVO();
        replyVO.setSubject(subject);
        replyVO.setName(name);
        replyVO.setContent(content);
        replyVO.setPwd(pwd);
        replyVO.setIp(ip);
        
        // ref, step, depth를 결정
        replyVO.setRef(boardVO.getRef());
        replyVO.setStep(boardVO.getStep() + 1);
        replyVO.setDepth(boardVO.getDepth() + 1);
        
        // 답글등록	
        rs = dao.insert_reply(replyVO);
        if (rs > 0) response.sendRedirect("board_list");

	}
}
