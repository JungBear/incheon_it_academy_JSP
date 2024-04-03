package ex_0403;

public class Car {

	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;
		}else {
			this.speed = 0;
		}
		
	}
	
	public boolean getStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		speed = 0;
	}
	
	public boolean isStop() {
		return stop;
	}
	
}
