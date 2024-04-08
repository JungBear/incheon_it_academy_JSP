package ex6_abstract;

public class AbsChild extends AbsParent{
	
	@Override
	public void setValue(int value) {
		this.value = value;
		System.out.println("추상메서드 재정의함");
		System.out.println(this.value);
	}

}
