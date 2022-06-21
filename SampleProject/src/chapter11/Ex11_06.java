package chapter11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ex11_06 {

	public static void main(String[] args) {
		new Ex11_06();
	}
	
	public Ex11_06() {
		new RadioButtonEx();
	}
	
	class RadioButtonEx extends JFrame{
		
		public RadioButtonEx() {
			super("라이오버튼 만들기 예제"); //LabelEx가 JFrame을 상속 받았기 때문에 부모 생성자가 setTitle()임
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			ImageIcon cherryIcon= new ImageIcon("images/cherry.jpg"); 
			ImageIcon selectedCherryIcon= new ImageIcon("images/selectedCherry.jpg"); 
			
			JRadioButton apple = new JRadioButton("사과");
			JRadioButton pear = new JRadioButton("배",true);
			JRadioButton cherry = new JRadioButton("체리", cherryIcon);
			cherry.setSelectedIcon(selectedCherryIcon);
			
			//체크박스와의 차이 라디오버튼은 그룹화 해줘야한다. 그래야 다중선택 발생하지 않는다.
			ButtonGroup group = new ButtonGroup(); 
			group.add(apple);
			group.add(pear);
			group.add(cherry);
			
			c.add(apple);
			c.add(pear);
			c.add(cherry);
			
			setSize(400,600);
			setVisible(true);
			setResizable(false);
			
		}
		
	}

}
