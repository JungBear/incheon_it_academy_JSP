package ex_0402;

public class MethodTest {

	// 두 수를 더하여 반환하는 add함수 만들고 
	// 메인에서 값을 두 개 받아 출력
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 1~n까지의 총합을 출력하는 oneToN
	public void oneToN(int n) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += i + 1;
		}
		System.out.println("1~" + n + "까지의 총합은 " + total + "입니다");
	}
	
	
	// dan을 받아와서 구구단을 출력하는 multi
	public void multi(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	// 배열에 최댓값을 찾아 출력 maxFinder
	public void maxFinder(int[] arr) {
		int maxNum = arr[0];
		for (int ele : arr) {
			if(maxNum < ele) maxNum = ele;
		}
		System.out.println("최댓값 : " + maxNum);
	}
	
	// 원의 넓이를 구하는 circleArea
	// 원의 둘레를 구하는 circleRound
	// main으로 부터 반지름을 넘겨받고
	// 원의 넓이는 반환, 둘레는 출력
	// 원의 넓이 : 3.14 * 반지름 * 반지름
	// 원의 둘레 : 2 * 3.14 * 반지름
	
	public double circleArea(double half) {
		return 3.14 * half * half;
	}
	
	public void circleRound(double half) {
		System.out.println("원의 둘레 : " + (2* 3.14 * half));
	}
	
	
}
