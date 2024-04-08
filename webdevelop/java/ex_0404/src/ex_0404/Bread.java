package ex_0404;

public class Bread {

	
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
		System.out.println("==============");
	}
	
	/**
	 * 
	 * @param count 문장을 반복할 횟수와 빵의 갯수
	 */
	public void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println("요청하신 " + count + "개의 빵을 만들었습니다.");
		System.out.println("==============");
	}
	
	public void makeBread(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name+"빵을 만들었습니다");
		}
		System.out.printf("요청하신 %s빵을 %d개 만들었습니다.\n", name, count);
		System.out.println("==============");
	}
	
	
	
	
}
