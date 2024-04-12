package ex5_generic;

public class DataListExample {

	public static void main(String[] args) {
		DataList list = new DataList();
		
		list.add(10);
		list.add("ssdas");
		list.add(3.14);
		
		for (int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data );
			}else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			}
		}
		
		
		

	}

}
