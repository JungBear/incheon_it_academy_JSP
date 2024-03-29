package arrayTest;

import java.util.Scanner;

public class ArTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1~10까지 배열에 담고 출력
		int[] arData = new int[10];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
		}
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		System.out.println("--------------");
		
//		10~1까지중 짝수만 담고 출력
		int[] arData2 = new int[5];
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = (5-i) * 2;
		}
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		System.out.println("--------------");
		
//		1~100까지 배열에 담은 후 홀수만 출력
		int[] arrData = new int[100];
		int[] oddData = new int[50];
		int j = 0;
		
		for (int i = 0; i < arrData.length; i++) {
			arrData[i] = i+1;
		}
		for (int i = 0; i < arrData.length; i++) {
			if(arrData[i] % 2 == 1) {
				System.out.println(arrData[i]);
			}
		}
		
		System.out.println("--------------");
		
//		1~100까지 배열에 담은 후 짝수의 합 출력
		int sum = 0;
		for (int i = 0; i < arrData.length; i++) {
			if(arrData[i] % 2 == 0) {
				sum += arrData[i];
			}
		}
		System.out.println(sum);
		System.out.println("--------------");
		
//		A~F까지 배열에 담고 출력
		
		char[] chArr = new char[6];
		char ch = 'A';
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = ch++;
		}
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		System.out.println("--------------");
		
//		A~F까지 C만 제외하고 배열에 담은 후 출력
		char[] chArr2 = new char[5];
		ch = 'A';
//		for (int i = 0; i < chArr2.length; i++) {
//			chArr2[i] = ch++;
//			if(chArr2[i] == 'C') {
//				chArr2[i] = ch++;
//			}
//		}
		for (int i = 0; i < chArr2.length; i++) {
			chArr2[i] = (i > 1 ? ++ch : ch++);
			System.out.println(ch);
		}
		for (int i = 0; i < chArr2.length; i++) {
			System.out.print(chArr2[i]);
		}
		System.out.println("--------------");
		
//		5개의 정수를 입력받고
//		배열에 담은 후 최댓값과 최솟값 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		System.out.println("ex) 1 2 3 4 5");
		int[] numArr = new int[5];
		
//		입력받은 수를 배열에 넣기
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
//		최댓값 최솟값을 비교하기위해 숫자들을 비교해서 정렬
//		int temp = 0;
//		for (int i = 0; i < numArr.length; i++) {
//			for(int k = 0; k < numArr.length; k++) {
//				if(numArr[i] < numArr[k]) {
//					temp = numArr[i];
//					numArr[i] = numArr[k];
//					numArr[k] = temp;
//				}
//			}
//		}
//		System.out.println("최솟값 : " + numArr[0]);
//		System.out.println("최댓값 : " + numArr[numArr.length-1]);
		
//		값을 비교하기 위해 0번째 숫자를 넣는다
		int minNum = numArr[0];
		int maxNum = numArr[0];
		
		for (int i = 1; i < numArr.length; i++) {
			if(minNum > numArr[i]) minNum = numArr[i];
			if(maxNum < numArr[i]) maxNum = numArr[i];
		}
		
		System.out.println("최솟값 : " + minNum);
		System.out.println("최댓값 : " + maxNum);

		
	}

}
