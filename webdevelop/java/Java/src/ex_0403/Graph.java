package ex_0403;

import java.util.Random;

/*
 * Graph라는 이름의 메인클래스를 만들어 0~9사이의 난수를 100개 저장하는 배열을 만들고
 * 해당 배열이 가지고 있는 강 방의 난수를 판별하여 그래프화 해보자.
 * 
 * 단 발생한 난수의 그래프화 작업은 PringGraph클래스가 하도록 한다.
 * 
 * 결과 : 
 * 0507...//난수 100개
 * 0의 갯수 : ######### 12
 * 1의 갯수 : ###### 9 
 * 3의
 */
public class Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		PrintGraph pg = new PrintGraph();
		
		int[] ar = new int[100];
		int[] count = new int[10];
		
		for (int i = 0; i < ar.length; i++) {
			int rn = rnd.nextInt(10);
			ar[i] = rn;
		}
		
		for (int i = 0; i < ar.length; i++) {
			count[ar[i]]++;
		}
		pg.print('#', count);
		
	}

}
