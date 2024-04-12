package ex5_generic;

public class People<T, M> {
	private T name;
	private M age;
	
	public People(T name, M age) {
		this.name = name;
		this.age = age;
	}
	
	public T getName() {
		return name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	public M getAge() {
		return age;
	}
	
	public void setAge(M age) {
		this.age = age;
	}
	
}
