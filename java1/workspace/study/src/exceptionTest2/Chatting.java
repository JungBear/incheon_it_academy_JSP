package exceptionTest2;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) throws BadWordException{
		Scanner sc = new Scanner(System.in);
		String msg = null;
		
		System.out.print("상대방에게 보내는 메세지 : ");
		msg = sc.nextLine();
		if(msg.contains("바보")) {
			
			try {
				throw new BadWordException("비속어 사용");
			} catch (BadWordException e) {
				System.out.println("비속어 사용");
			}
		}else {
			System.out.println(msg);
		}
		
		
		
	}
}
