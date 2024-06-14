package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import lombok.RequiredArgsConstructor;
import vo.SawonVO;

@RequiredArgsConstructor
public class SawonDAO {
	
	
	final SqlSession sqlSession;
	
	// 전체 부서 조회
	public List<SawonVO> selectList(){
		List<SawonVO> list = sqlSession.selectList("sawon.sawon_list");
		return list;
	}
}
