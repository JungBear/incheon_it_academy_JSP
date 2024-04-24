package ex1_memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{
	
	JTextField tf;
	JTextArea ta;
	
	public InputButtonAdapter(JTextField tf, JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String tfStr = tf.getText();
		ta.append(tfStr + "\n");
		tf.setText(null);
		
	}

}
