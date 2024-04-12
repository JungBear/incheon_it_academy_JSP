package ex5_generic;

/*
 * 타입변수 T를 갖는 prinArr
 * printArr은 배열의 요소를 순차적으로 출력하는 코드
 * GenMain에서 Integer[], Double[], Character[]배열을 만든뒤
 * 배열의 내용 출력
 * 1 2 3 4 5
 * 1.1 2.2 3.3 4.4 5.5
 * A B C D E
 */

public class Gen {
	
	public <T> void printArr(T[] arr) {
		for(T ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	
}
