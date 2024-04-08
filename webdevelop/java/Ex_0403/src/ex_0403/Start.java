package ex_0403;

import java.util.Random;

public class Start {

	Random rnd = new Random();
	int count = 0;
	
	int randomNum = rnd.nextInt(50)+1;
	
	
	public int getRandomNum() {
		return randomNum;
	}
	
	public void upDown(int num) {
		count++;
//		System.out.println("랜덤수 : " + randomNum);
		if(randomNum > num) {
			System.out.println("Down!");
		}else if(randomNum < num) {
			System.out.println("Up!");
		}else {
			System.out.println("정답!");
			System.out.println(count + "회만에 맞추셨습니다!");
		}
//		System.out.println("count : " + count);
		
	}

}
