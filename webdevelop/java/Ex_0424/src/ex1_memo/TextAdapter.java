package ex1_memo;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextAdapter implements DocumentListener{

	JTextField tf;
	JButton btn_input;
	
	public TextAdapter(JTextField tf, JButton btn_input) {
		this.tf = tf;
		this.btn_input = btn_input;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		change();
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		change();
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		change();
		
	}
	
	public void change() {
		if(tf.getText().length() == 0) {
			btn_input.setEnabled(false);
		}else {
			btn_input.setEnabled(true);
		}
	}

}
