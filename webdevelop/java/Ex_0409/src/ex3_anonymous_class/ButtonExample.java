package ex3_anonymous_class;

interface buttonClickListener{
	public void click();
}

public class ButtonExample {
	public class Button{
		
		private buttonClickListener listener;
		
		public void setListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		ButtonExample exam = new ButtonExample();
		
		//버튼
		ButtonExample.Button btn = exam.new Button();
		
		btn.setListener(new buttonClickListener() {
			
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});
		
		btn.click();
	}
	
}
