package chapter10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import chapter10.FlyingTextEx.MyKeyMove;

public class MouseListenerAllEx extends JFrame {

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

	private JLabel label ;
	private JLabel pointer;
	private Container contentPane;
	private final int FLYING_UNIT= 10;
	
	public MouseListenerAllEx() {
		setTitle("마우스 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseMotionListener(new MyMouseListener());
		contentPane.setLayout(null);
		
		label=new JLabel("No Mouse Event");
		label.setSize(200,15);
		label.setLocation(50,10);
		contentPane.add(label);
		
		pointer= new JLabel("★");
		pointer.setSize(100,10);
		pointer.setLocation(100, 100);
		contentPane.add(pointer);
		
		setSize(500,500);
		setVisible(true);
		setResizable(false);
	}
	
	class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			label.setText("mouseDragged ("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			label.setText("mouseMoved ("+e.getX()+", "+e.getY()+")");
			
			//pointer.setText("★ ("+e.getX()+", "+e.getY()+")");
			pointer.setText(pointer.getText());
			pointer.setLocation(e.getX(),e.getY()-FLYING_UNIT);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			Component c= (Component)e.getSource();
			
			System.out.println(pointer.getText());
			
			int r =(int)(Math.random()*256);
			int g =(int)(Math.random()*256);
			int b =(int)(Math.random()*256);
			c.setBackground(new Color(r,g,b));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			label.setText("mousePressed ("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			label.setText("mouseReleased ("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c= (Component)e.getSource();
			
			int r =(int)(Math.random()*256);
			int g =(int)(Math.random()*256);
			int b =(int)(Math.random()*256);
			c.setBackground(new Color(r,g,b));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c= (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
	}
	
	
}
