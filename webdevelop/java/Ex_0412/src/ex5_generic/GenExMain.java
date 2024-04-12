package ex5_generic;

public class GenExMain {

	public static void main(String[] args) {
			GenEx<String> v1 = new GenEx<>();
			GenEx<Integer> v2 = new GenEx<>();
			
			v1.setValue("Hello world");
			v2.setValue(123);
			System.out.println(v1.getValue());
			System.out.println(v2.getValue()+10);
			
			GenEx<Character> v3 = new GenEx<Character>();
			v3.setValue('2');
			System.out.println(v3.getValue());
			
			People<String, Integer> p1 = new People<String, Integer>("Jack", 20);
			People<String, Integer> p2 = new People<String, Integer>("Steve", 30);
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
			System.out.println(p2.getName());
			System.out.println(p2.getAge());
			
			Student<String> s1 = new Student<String>("20240001");
			System.out.println(s1.getOneStudent());
			System.out.println(s1.getid(20200002) + 1);

 			
	}

}
