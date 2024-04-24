package ex1_memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoMain {

	public static void main(String[] args) {
		
		// 컴포넌트를 붙힐 패널
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		Font font = new Font("",Font.PLAIN,20);
		
		// 한줄을 입력할 수 있는 텍스트 필드
		JTextField tf = new JTextField();
		tf.setBounds(10, 15, 180, 30);
		tf.setFont(font);
		
		// TextField에 적힌 내용을 TextArea로 보내주는 버튼
		JButton btn_input = new JButton("확인");
		btn_input.setBounds(190, 15, 60, 30);
		
		// TextField에 아무것도 안적혀있으면 비활성화
		btn_input.setEnabled(false);
		
		// 텍스트 파일 형식으로 저장할 내용이 있는 TextArea
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 70, 230, 280);
		// TextArea에 있는 글 수정 불가능
		ta.setEditable(false);
		
		// 텍스트파일로 저장하기 위한 버튼
		JButton btnSave = new JButton("저장");
		btnSave.setBounds(10, 356, 110, 30);
		
		// 프로그램 종료버튼
		JButton btnClose = new JButton("종료");
		btnClose.setBounds(103, 356, 110, 30);
		
		// 패널에 컴포넌트 부착
		jp.add(tf);
		jp.add(btn_input);
		jp.add(ta);
		jp.add(btnSave);
		jp.add(btnClose);
		
		JFrame f = new JFrame();
		
		// 기능
		// 	1. TextField에 값이 들어가있으면 버튼 활성화, 없으면 비활성화
		tf.getDocument().addDocumentListener(new TextAdapter(tf, btn_input));
		
		//  2. 확인버튼(btn_input)을 누르면 TextField의 값을 TextArea로 넘기기
		btn_input.addActionListener(new InputButtonAdapter(tf, ta));
		
		//  3. 저장버튼(btnSave)을 누르면 TextArea의 내용을 .txt파일로 저장
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 경로를 설정하는 FileDialog
				FileDialog fd = new FileDialog(f, "버튼1", FileDialog.SAVE);
				fd.setVisible(true);
				
				// TextArea에 쓰여진 내용을 읽어오고 
				String message = ta.getText();
				
				String path = fd.getDirectory() + fd.getFile();
				// System.out.println(path);
				
				// FileWriter로 저장하기
				FileWriter fw = null;

				try {
					fw = new FileWriter(path);
				
					fw.write(message);	
					fw.close();
				} catch (Exception e1) {
					
				} finally {
					try {
						if (fw != null) {
							fw.close();
						}
					} catch (Exception e2) {
					}
				}
				
			}
		});
		
		//	4. 종료버튼 눌렀을 때 프로그램 종료
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();  // 현재 프레임 종료
				
			}
		});
		
		
		// 프래임에 패널 부착
		f.add(jp);
		
		f.setBounds(700, 200, 270, 440);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
