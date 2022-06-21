package chapter11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ex11_02 {

	public static void main(String[] args) {
		new Ex11_02();	
	}
	
	public Ex11_02() {
		new LabelEx();
	}
	
	class LabelEx extends JFrame{
		public LabelEx() {
			super("레이블 예제"); //LabelEx가 JFrame을 상속 받았기 때문에 부모 생성자가 setTitle()임
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel textLabel= new JLabel("사랑합니다");
			
			ImageIcon beauty= new ImageIcon("images/beauty.jpg");
			JLabel imageLabel= new JLabel(beauty);
	
			JLabel normalLabel= new JLabel("보고싶으면 전화하세요", new ImageIcon("images/normalIcon.gif"), SwingConstants.CENTER);
			
			c.add(textLabel);
			c.add(imageLabel);
			c.add(normalLabel);
			
			setSize(400,600);
			setVisible(true);
			
		}
	}
}

