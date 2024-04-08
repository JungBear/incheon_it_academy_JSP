package ex7_interface;

public class PhoneMain {

	public static void main(String[] args) {
		Person jimin = new Person(new ApplePhone());
		
		
		
		jimin.turnOnPhone();
		for(int i =0; i<5; i++) {
			jimin.watchUtube();
			for(int j = 0; j<5; j++) {
				jimin.chargePhone();
			}
		}
		
		jimin.buyNewPhone(new SamungPhone());

	}

}
