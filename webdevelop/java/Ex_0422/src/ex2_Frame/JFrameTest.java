package ex2_Frame;

import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	
	public JFrameTest() {
		super("제목");
		//setBounds(x, y, width, height);
		setBounds(300, 300, 500, 600);
		setVisible(true);
	}
	
}
