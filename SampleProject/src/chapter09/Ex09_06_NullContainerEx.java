package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex09_06_NullContainerEx {

	public static void main(String[] args) {
		new NullContainerEx();
	}

}

class NullContainerEx extends JFrame{
	
	public NullContainerEx(){
		super("NullContainer Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane= getContentPane();
		contentPane.setLayout(null);	
		
		JLabel label= new JLabel("Hello, Press Buttons !");
		label.setLocation(130,50);
		label.setSize(200,20);
		//label.setBounds(130,50,200,20);
		
		contentPane.add(label);
		
		for(int i=1; i<=9; i++) {
			JButton button= new JButton(Integer.toString(i));
			button.setLocation(i*15,i*15);
			button.setSize(50,20);
			contentPane.add(button);
		}	
		
		setSize(300,200);
		setVisible(true);
	}
}