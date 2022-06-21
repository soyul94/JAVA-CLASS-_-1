package chapter11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Ex11_03 {

	public static void main(String[] args) {
		new Ex11_03();
	}
	
	public Ex11_03() {
		new ButtonEx();
	}
	
	class ButtonEx extends JFrame{
		
		ButtonEx(){
			super("레이블 예제"); //LabelEx가 JFrame을 상속 받았기 때문에 부모 생성자가 setTitle()임
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new BorderLayout());
			
			ImageIcon normalIcon= new ImageIcon("images/normalIcon.gif");
			ImageIcon rolloverIcon= new ImageIcon("images/rolloverIcon.gif");
			ImageIcon pressedIcon= new ImageIcon("images/pressedIcon.gif");
			
			JButton btn = new JButton("call~", normalIcon);
			btn.setPressedIcon(pressedIcon);
			btn.setRolloverIcon(rolloverIcon);
			btn.setHorizontalAlignment(SwingConstants.RIGHT);
			btn.setVerticalAlignment(SwingConstants.BOTTOM);
			
			c.add(btn);
			
			setSize(400,400);
			setVisible(true);
			
		}
		
	}

}
