package ex5_generic;

public class Student<T> {
	
	private T studectID;
	
	public Student(T studectID) {
		this.studectID = studectID;
	}

	public T getOneStudent() {
		return studectID;
	}
	
	public <M> M getid(M id) {
		return id;
	}
	
}
