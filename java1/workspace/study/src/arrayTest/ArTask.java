package arrayTest;

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
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 10 - i;
		}
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
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
			if(arrData[i]%2 == 1) {
				oddData[j] = arrData[i];
				j++;
			}
		}
		for (int i = 0; i < oddData.length; i++) {
			System.out.println(oddData[i]);
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
		
	}

}
