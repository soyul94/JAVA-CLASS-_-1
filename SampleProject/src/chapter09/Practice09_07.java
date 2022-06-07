package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//2022.06.07 과제 : 키 누르는데로 수식입력 칸에 입력되고, 계산 누르면 결과창에 계산 결과 출력하기
public class Practice09_07 {

	public static void main(String[] args) {
		new Calculator();
	}

}

class Calculator extends JFrame{
	
	public Calculator(){
		super("a Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane= getContentPane();
		
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLocation(0, 0);
		panel_1.setSize(new Dimension(400, 40));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel_1.add(new JLabel("수식 입력"));
		panel_1.add(new JTextField(20));
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLocation(0, 40);
		panel_2.setSize(new Dimension(400,160));
		panel_2.setLayout(new GridLayout(4,4));
		for(int i=0; i<=9; i++) {
			JButton button= new JButton(Integer.toString(i));
			button.setSize(new Dimension(90, 40));
			panel_2.add(button);
		}
		JButton delete_button= new JButton("CE");
		panel_2.add(delete_button);
		
		delete_button.addActionListener(new MyActionListener());
		
		panel_2.add(new JButton("계산"));
		JButton[] buttons= {new JButton("+"),new JButton("-"),new JButton("*"),new JButton("/")};
		for(int i=0;i<buttons.length;i++) {
			buttons[i].setBackground(Color.CYAN);
			panel_2.add(buttons[i]);
		}	
		contentPane.add(panel_2);
				
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setLocation(0, 200);
		panel_3.setSize(new Dimension(400, 40));
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel_3.add(new JLabel("계산 결과"));
		panel_3.add(new JTextField(20));
		contentPane.add(panel_3);
		
		
		setSize(420,280);
		setVisible(true);
	}
}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button= (JButton)e.getSource();
		if(button.getText().equals("CE")) 
			button.setText("취소");
		else
			button.setText("CE");
		
	}
	
}