package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import lombok.RequiredArgsConstructor;
import vo.BoardVO;

@RequiredArgsConstructor
public class BoardDAO {
	
	final SqlSession sqlSession;
	
	public List<BoardVO> boardList(HashMap<String, Integer> map){
		
		List<BoardVO> list = sqlSession.selectList("board.board_list", map);
 		
		return list;
	}
	
	public int getTotal() {
		int getTotal = sqlSession.selectOne("board.board_total");
		return getTotal;
	}
	
	public BoardVO selectPost(int idx) {
		return sqlSession.selectOne("board.board_select", idx);
	}
	
	public int update_readhit(int idx) {
		return sqlSession.update("board.update_readhit", idx);
	}
	
	public int board_insert(BoardVO vo) {
		return sqlSession.insert("board.board_insert", vo);
	}
	
}
