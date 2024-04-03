package ex_0403;
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
public class PrintGraph {
	
	int[] arr = new int[10];

	public void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			switch(ar[i]) {
			case 0:
				arr[0]++;
				break;
			case 1:
				arr[1]++;
				break;
			case 2:
				arr[2]++;
				break;
			case 3:
				arr[3]++;
				break;
			case 4:
				arr[4]++;
				break;
			case 5:
				arr[5]++;
				break;
			case 6:
				arr[6]++;
				break;
			case 7:
				arr[7]++;
				break;
			case 8:
				arr[8]++;
				break;
			case 9:
				arr[9]++;
				break;
			}
		}
		// 0의 갯수
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(i + "의 갯수 : ");
			for(int j = 0 ; j < arr[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" " + arr[i]);
			
		}

	}
	
}
