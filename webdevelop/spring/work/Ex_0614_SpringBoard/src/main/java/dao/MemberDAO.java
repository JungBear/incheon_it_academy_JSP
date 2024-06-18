package dao;

import org.apache.ibatis.session.SqlSession;

import lombok.RequiredArgsConstructor;
import vo.MemberVO;

@RequiredArgsConstructor
public class MemberDAO {
	
	final SqlSession sqlSession;
	
	public MemberVO loginCheck(String id) {
		return sqlSession.selectOne("member.login_check",id);
	}
	
	public int memberInsert(MemberVO vo) {
		return sqlSession.insert("member.member_insert",vo);
	}
	
	public int checkId(String id) {
		return sqlSession.selectOne("member.check_id",id);
	}
}
