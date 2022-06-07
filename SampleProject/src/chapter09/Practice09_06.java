package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Practice09_06 {

	public static void main(String[] args) {
		new RandomLabel();
	}

}

class RandomLabel extends JFrame{
	
	public RandomLabel(){
		super("RandomLabels Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane= getContentPane();
		
		contentPane.setLayout(null);	
		
//		JLabel label= new JLabel("Hello, Press Buttons !");
//		label.setLocation(130,50);
//		label.setSize(200,20);
//		label.setBounds(130,50,200,20);
		
//		contentPane.add(label);
		
		for(int i=1; i<=20; i++) {
			//Random random= new Random();
			JLabel label= new JLabel(Integer.toString(i));
			label.setBackground(Color.BLUE);
			label.setSize(20,20);
			label.setOpaque(true);
			//int x= random.nextInt(200)+50;
			//int y= random.nextInt(200)+50;
			int x= (int)(Math.random()*200)+50;
			int y= (int)(Math.random()*200)+50;
			label.setLocation(x,y);
			System.out.println(x+", "+y);
			contentPane.add(label);
		}	
		
		setSize(300,300);
		setVisible(true);
	}
}