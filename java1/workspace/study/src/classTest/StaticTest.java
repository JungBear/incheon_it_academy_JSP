package classTest;

class Data{
	
	int data = 10;
	static int datas = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	void increases() {
		System.out.println(++datas);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data1 = new Data();
		
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();

		data1 = new Data();
		data1.increase();
		data1.increase();
		data1.increase();
		System.out.println("==============");		
		data1.increases();
		data1.increases();
		data1.increases();
		data1.increases();
		data1.increases();
		data1.increases();
		
		data1 = new Data();
		data1.increases();
		data1.increases();
		data1.increases();
		data1.increases();
		data1.increases();
		data1.increases();
		
		
	}

}
