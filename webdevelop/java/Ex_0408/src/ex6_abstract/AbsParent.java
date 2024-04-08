package ex6_abstract;

abstract public class AbsParent {
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	abstract public void setValue(int value);
}
