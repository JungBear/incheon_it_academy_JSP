package ex_0405;

/*
 * gasGauge를 멤버
 * 위 멤버는 생성자를 통해 초기화
 * 
 * gasGauge를 출력하는 showCurrentGauge()
 * 
 * HybridCar 클래스
 * Car클래스를 상속
 * electricGauge를 멤버
 * 멤버는 생성자를 통해 초기화
 * 메서드 오버라이딩을 통해 가스와 전기량을 출력
 * 
 * HybridWaterCar
 * Car클래스를 상속
 * waterGauge를 멤버
 * 멤버는 생성자를 통해 초기화
 * 메서드 오버라이딩을 통해 가스와 전기,물량을 출력
 * 
 * CarMain에서 HybridWaterCar의 객체를 생성
 */

public class Car {

	int gasGauge;
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("gasGauge : " + gasGauge);
	}
	
}
