package ex_0404;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student("제음시", 20, 20220133);
		
		System.out.println("이름 : " + s.name);
		System.out.println("나이 : " + s.age);
		System.out.println("학번 : " + s.studentID);
		
	}

}
