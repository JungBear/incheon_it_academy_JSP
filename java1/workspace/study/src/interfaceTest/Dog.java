package interfaceTest;

public class Dog implements Pet {

	@Override
	public void sitDown() {
		System.out.println("앉는다.");
	}

	@Override
	public void turn() {
		System.out.println("돈다.");
	}

	@Override
	public void giveYourHand() {
		System.out.println("준다.");
	}

	@Override
	public void waitNow() {
		System.out.println("기다린다.");
	}

}
