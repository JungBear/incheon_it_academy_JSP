package ex_0404;


/*
 * 각각의 메서드를 호출했을때
 * method1번을 호출했을때
 * 빵을만들었습니다
 * ==============
 * method2번을 호출했을때
 * 빵을만들었습니다
 * 빵을만들었습니다
 * 빵을만들었습니다
 * 빵을만들었습니다
 * 요청하신 n개의 빵을 만들었습니다
 * =====================
 * method3번을 호출시
 * XX빵을 만들었습니다
 * XX빵을 만들었습니다
 * XX빵을 만들었습니다
 * XX빵을 만들었습니다
 * 요청하신 XX빵을 N개 만들었습니다
 */
public class BreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bread b = new Bread();
		
		b.makeBread();

		b.makeBread(3);

		b.makeBread("마늘", 3);
		
	}

}
