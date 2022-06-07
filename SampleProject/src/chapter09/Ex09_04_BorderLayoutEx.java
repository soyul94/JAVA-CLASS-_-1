package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex09_04_BorderLayoutEx {

	public static void main(String[] args) {
		
		new BorderLayoutEx();
	}

}

class BorderLayoutEx extends JFrame{
	
	public BorderLayoutEx(){
		super("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane= getContentPane();
		contentPane.setBackground(Color.DARK_GRAY);
		
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		contentPane.add(new JButton("calculate"),BorderLayout.CENTER);
		
		setSize(300,150);
		setVisible(true);
	}
}