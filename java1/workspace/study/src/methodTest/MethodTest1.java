package methodTest;

public class MethodTest1 {

	public int add(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
	
	public void printName(String name) {
		for(int i = 0; i<10; i++) {
			System.out.println(name);
		}
	}
	
	public void printNameNTime(String name, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
	public int getTotal() {
		int total = 0;
		for(int i = 0; i < 10; i++) {
			total += i + 1;
		}
		return total;
	}
	
	public boolean login(String id, String pwd) {
		return true;
	}
	
	public String[] getliked (int postId) {
		String[] names = null;
		return names;
	}
	

}
