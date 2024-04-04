package ex_0404;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		System.out.println("---고양이---");
		System.out.println("눈 : " + cat.getEye());
		System.out.println("다리 : " + cat.getLeg());
		System.out.println("특징 : " + cat.balance);
		
		Lion lion = new Lion();
		System.out.println("---사자---");
		System.out.println("눈 : " + lion.getEye());
		System.out.println("다리 : " + lion.getLeg());
		System.out.println("특징 : " + lion.galgi);
		
		Snake snake = new Snake();
		System.out.println("---뱀---");
		System.out.println("눈 : " + snake.getEye());
		System.out.println("다리 : " + snake.getLeg());
		System.out.println("특징 : " + snake.sensor);
		
	}

}
