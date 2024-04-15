package interfaceTest;

public class Cat implements Pet {

	@Override
	public void sitDown() {
		System.out.println("무시한다.");
	}

	@Override
	public void turn() {
		System.out.println("나를 흘겨본다.");
	}

	@Override
	public void giveYourHand() {
		System.out.println("깨문다.");
	}

	@Override
	public void waitNow() {
		System.out.println("안 기다린다.");
	}

}
