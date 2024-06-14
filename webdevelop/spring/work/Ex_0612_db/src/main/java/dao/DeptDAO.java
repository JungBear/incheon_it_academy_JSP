package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import lombok.RequiredArgsConstructor;
import vo.DeptVO;

@RequiredArgsConstructor
public class DeptDAO {
	
	final SqlSession sqlSession;
	
	// 전체 부서 조회
	public List<DeptVO> selectList(){
		List<DeptVO> list = sqlSession.selectList("dept.dept_list");
		return list;
	}
}
