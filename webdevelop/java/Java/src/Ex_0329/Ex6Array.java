package Ex_0329;

import java.util.Scanner;

public class Ex6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열에 있는 모든 값의 합
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("---------------------");
		
//		키보드에서 입력받은 배열의 크기만큼
//		알파벳 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		char[] iArr = new char[num];
		char ch = 'A';
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = ch++;
			System.out.print(iArr[i]);
			
		}
		System.out.println();
		System.out.println("---------------------");
		
//		배열에서 글자만 골라서 모두 연결하여 출력
		char[] cards = {'1', 'L', '2', 'O', 'V', '3', '4', 'E'};
		
		for (int i = 0; i < cards.length; i++) {
			if(cards[i] >= 'A') {
				System.out.print(cards[i]);
			}
		}
		
	}
	
}
