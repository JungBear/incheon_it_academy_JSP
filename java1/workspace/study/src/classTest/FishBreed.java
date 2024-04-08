package classTest;

class FishBreed {
	
	// 붕어빵을 만드는 메소드 println
	public void makeFishBread() {
		System.out.println("붕어빵을 만든다.");
	}
	
	// 붕어빵을 먹는 메소드 println
	public void eatFishBread() {
		System.out.println("붕어빵을 먹는다.");
	}
	
	// 뜨거운 붕어빵을 먹었을때 나타나는 현상 메소드 println
	public void eatHotFishBread() {
		System.out.println("붕어빵이 뜨겁다.");
		System.out.println("혓바닥이 데였다.");
	}

	public static void main(String[] args) {
		
		FishBreed fb = new FishBreed();
		
		fb.makeFishBread();
		System.out.println("========");
		
		fb.eatFishBread();
		System.out.println("========");
		
		fb.eatHotFishBread();
		System.out.println("========");
	}

}
