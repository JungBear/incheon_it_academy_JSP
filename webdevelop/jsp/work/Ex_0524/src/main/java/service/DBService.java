package service;

public class DBService {

	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static DBService single = null;

	public static DBService getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new DBService();
		//생성된 객체정보를 반환
		return single;
	}
}
