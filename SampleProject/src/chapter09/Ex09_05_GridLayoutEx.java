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

public class Ex09_05_GridLayoutEx {

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}

class GridLayoutEx extends JFrame{
	
	public GridLayoutEx(){
		super("GridLayout Sample");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane= getContentPane();
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		contentPane.setLayout(grid);			
		
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		
		
		setSize(300,150);
		setVisible(true);
	}
}