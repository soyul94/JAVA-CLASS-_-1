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

import chapter10.KeyCodeEx.MyKeyListener;

public class FlyingTextEx extends JFrame{
	public static void main(String[] args) {
		new FlyingTextEx();
	}
	
	private JLabel label = new JLabel("Hello");
	private Container contentPane;
	private final int FLYING_UNIT= 5;
	
	public FlyingTextEx() {
		
		setTitle("상하좌우 키를 활용한 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.addKeyListener(new MyKeyMove());
		contentPane.setLayout(null);
		
		label.setSize(100,100);
		label.setLocation(50,50);
		contentPane.add(label);
		
		setSize(500,500);
		setVisible(true);
		
		//
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		setResizable(false);
	}
	
	class MyKeyMove extends KeyAdapter{
		public void  keyPressed(KeyEvent e) {
			int keyCode= e.getKeyCode();
			
			int x = label.getX();
			int y = label.getY();
			
			switch(keyCode) {
			case KeyEvent.VK_UP : 
				if(y>0)
					label.setLocation(label.getX(), label.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN : 
				label.setLocation(label.getX(), label.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT : 
				label.setLocation(label.getX()-FLYING_UNIT, label.getY());
				break;			
			case KeyEvent.VK_RIGHT : 
				label.setLocation(label.getX()+FLYING_UNIT, label.getY());
				break;
			}
			
		}
	}
}
