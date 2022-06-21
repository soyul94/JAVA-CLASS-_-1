package chapter11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex11_04 {

	public static void main(String[] args) {
		new Ex11_04();
	}
	
	public Ex11_04() {
		new CheckBoxEx();
	}
	
	class CheckBoxEx extends JFrame{
		
		public CheckBoxEx() {
			super("체크박스 만들기 예제"); //LabelEx가 JFrame을 상속 받았기 때문에 부모 생성자가 setTitle()임
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			ImageIcon cherryIcon= new ImageIcon("images/cherry.jpg"); 
			ImageIcon selectedCherryIcon= new ImageIcon("images/selectedCherry.jpg"); 
			
			JCheckBox apple = new JCheckBox("사과");
			JCheckBox pear = new JCheckBox("배",true);
			JCheckBox cherry = new JCheckBox("체리", cherryIcon);
			cherry.setSelectedIcon(selectedCherryIcon);
			
			//체크박스도 라이도버튼 처럼 그룹화하면 단일 선택만 가능
//			ButtonGroup group = new ButtonGroup(); 
//			group.add(apple);
//			group.add(pear);
//			group.add(cherry);
			
			c.add(apple);
			c.add(pear);
			c.add(cherry);
			
			setSize(400,600);
			setVisible(true);
			
			
		}
		
	}

}
