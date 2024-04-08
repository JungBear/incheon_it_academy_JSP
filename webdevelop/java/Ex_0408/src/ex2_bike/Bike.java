package ex2_bike;

public class Bike {

		String rideName;
		int wheel = 2;
		
		public Bike(String rideName) {
			this.rideName = rideName;
		}
		
		public void info() {
			System.out.println(rideName + "의 자전거는 " + wheel + "발 자전거입니다.");
		}
		
		public void ride() {
			System.out.println("씽씽");
		}
		
}
