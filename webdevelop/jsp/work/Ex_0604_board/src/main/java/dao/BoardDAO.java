package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.BoardVO;

public class BoardDAO {

	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static BoardDAO single = null;

	public static BoardDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new BoardDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	SqlSessionFactory factory;
	
	public BoardDAO() {
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}
	// 전체 게시물 조회
	public List<BoardVO> selectList(){
		SqlSession sqlSession = factory.openSession();
		
		List<BoardVO> list = sqlSession.selectList("board.board_list");
		
		sqlSession.close();
		
		return list;
	}
	
	public int insert(BoardVO vo) {
		// openSession(true)로 해야 commit을 해준다
		SqlSession sqlSession = factory.openSession(true);
//		System.out.println("이름 : " + vo.getName());
		int rs = sqlSession.insert("board.insert_board", vo);
//		System.out.println("xml 결과 : " + rs);
		sqlSession.close();
		
		return rs;
	}
	
	public BoardVO selectOne(int idx) {
		SqlSession sqlSession = factory.openSession();
		BoardVO vo = sqlSession.selectOne("board.select_board_id",idx);
		sqlSession.close();
		
		return vo;
	}
	
	
}
