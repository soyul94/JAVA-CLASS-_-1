package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import chapter10.MouseListenerAllEx.MyMouseListener;

public class Chap10_Practice07 extends JFrame{

	public static void main(String[] args) {
		new Chap10_Practice07();
	}
	
	private JLabel label ;
	private Container contentPane;
	private final int UNIT= 5;
	private Font font = new Font("Serif",Font.BOLD,20);
	
	public Chap10_Practice07() {
		setTitle("마우스 휠로 글자 키우기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.addMouseWheelListener(null);
		//contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		label=new JLabel("Love Java", SwingConstants.CENTER);
		label.setFont(font);
		contentPane.add(label);
		
		
		contentPane.addMouseWheelListener(new changeFontSize());
		
		
		setSize(500,500);
		setVisible(true);
		setResizable(false);
	}
	
	class changeFontSize implements MouseWheelListener {

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n=e.getWheelRotation();
			int size = font.getSize();
			System.out.println(size);
			if(n<0) {
				if(size>5)
					font=new Font("Serif",Font.BOLD,size-UNIT);
			}
			else {
				font=new Font("Serif",Font.BOLD,font.getSize()+UNIT);
			}
			label.setFont(font);
		}
		
	}

}
