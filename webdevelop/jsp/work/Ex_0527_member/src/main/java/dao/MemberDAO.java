package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import service.DBService;
import vo.MemberVO;

/**
 * 
 */
public class MemberDAO {
	
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static MemberDAO single = null;

	public static MemberDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new MemberDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	public List<MemberVO> selectList(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 쿼리문
		String sql = "select * from member order by idx desc";
		
		try {
			// 1. connect객체 얻어오기
			conn = DBService.getInstance().getConnection();
			// 2. 명령처리객체정보를 얻어오기
			pstmt = conn.prepareStatement(sql);
			// 3. 결과행 처리객체 얻어오기
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				
				// 하나의 행을 vo에 저장
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setEmail(rs.getString("email"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
	
			}
			
		}
		
		return list;
	}
	
	public int insert(MemberVO vo) {
		int res = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql="insert into member values(seq_member_idx.nextVal, ?,?,?,?)";
		
		try {
			// 1. connect객체 얻어오기
			conn = DBService.getInstance().getConnection();
			// 2. 명령처리객체정보를 얻어오기
			pstmt = conn.prepareStatement(sql);
			// 3. 결과행 처리객체 얻어오기
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getEmail());
			// 4.DB로 전송
			res = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
	
			}
			
		}
		return res;
	}
}
