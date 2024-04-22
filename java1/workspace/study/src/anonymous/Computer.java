package anonymous;

public class Computer {
//	인터페이스에 구현되지 않은 필드가 존재하기 때문에,
//  익명 클래스가 열린 뒤 인터페이스를 지정 받아서 구현시킨다.
//  구현된 익명 클래스의 필드가 메모리에 할당된 뒤 인터페이스 타입의
//  객체로 up casting된다.
	
	public static void main(String[] args) {
		Game game = new Game() {
			
			@Override
			public void play() {
				
				
			}
			
			@Override
			public void exit() {
				
				
			}
		};
	}
}
