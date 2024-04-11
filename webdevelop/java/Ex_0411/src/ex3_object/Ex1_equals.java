package ex3_object;

public class Ex1_equals {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		System.out.println("str1 vs Str2 : " + (str1 == str2));
		System.out.println(str1.equals(str2));
		
		String str3 = new String("hello");
		System.out.println("str1 vs str3 : " + (str1 == str3));
		System.out.println("str1 vs str3 : " + str1.equals(str3));
		System.out.println(str2.equals(str3));	
		
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str1 hashCode : " + System.identityHashCode(str2));
		

	}

}
