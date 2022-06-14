package chapter10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyCodeEx extends JFrame {
	
	private JLabel[] label = new JLabel[3];
	private JLabel say = new JLabel("");
	private Container contentPane;
	private JPanel panel_2;

	public KeyCodeEx(){
		setTitle("KeyLisefbe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(0,0));
		
		contentPane.addKeyListener(new MyKeyListener());
		
		JPanel panel_1= new JPanel();
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		label[0]= new JLabel("getKeyCode()"); 
		label[1]= new JLabel("getKeyChar()"); 
		label[2]= new JLabel("getKeyText()"); 
		
		for(int i=0; i< label.length; i++) {
			label[i].setOpaque(true);//라벨의 백그라운드 컬러 보이도록
			label[i].setBackground(Color.LIGHT_GRAY);
			panel_1.add(label[i]);
		}
		contentPane.add(panel_1,BorderLayout.NORTH);
		
		panel_2= new JPanel();
		//panel_2.setLayout(null);
		panel_2.add(say);
		say.setLocation(50,50);
		contentPane.add(panel_2,BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
		//
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		setResizable(false);
	}
	
	class MyKeyListener extends KeyAdapter{
		public void  keyPressed(KeyEvent e) {
			int keyCode= e.getKeyCode();
			char keyChar= e.getKeyChar();
			String keyText= e.getKeyText(keyCode);
			Container ContentPane=(Container)e.getSource();
			
			label[0].setText(Integer.toString(keyCode));
			label[1].setText(Character.toString(keyChar));
			label[2].setText(keyText);
			
			if(keyText.equals("F1")) {
				panel_2.setBackground(Color.GREEN);
				say.setText("F1키가 입력되었음");
				
			}
			else if(Character.toString(keyChar).equals("%")) {
				panel_2.setBackground(Color.YELLOW);
				say.setText("%키가 입력되었음");
			}
			else {
				panel_2.setBackground(Color.gray);
				say.setText("");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
