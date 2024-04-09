package ex3_anonymous_class;

public class PersonMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		Person p1 = new Person() {
			@Override
			public void mySelf() {
				// TODO Auto-generated method stub
				System.out.println("저는 직장인입니다");
			}
		};
		p1.mySelf();
	}

}
