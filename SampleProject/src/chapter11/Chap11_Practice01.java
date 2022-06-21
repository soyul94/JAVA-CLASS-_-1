package chapter11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Chap11_Practice01 {

	public static void main(String[] args) {
		new Chap11_Practice01();
	}
	
	public Chap11_Practice01() {
		new CheckBoxPracticeFrame();
		new backChange();
	}
	
	class CheckBoxPracticeFrame extends JFrame{
		private HashMap<String, Integer> componentIndex;
		
		public CheckBoxPracticeFrame() {
			super("이벤트 동작하는 체크박스 만들기"); //LabelEx가 JFrame을 상속 받았기 때문에 부모 생성자가 setTitle()임
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());

			componentIndex= new HashMap<String, Integer>();
			
			JButton test = new JButton("test button");
			JCheckBox check_1 = new JCheckBox("버튼 비활성화");
			JCheckBox check_2 = new JCheckBox("버튼 감추기");
			
			c.add(check_1); componentIndex.put(check_1.getName(), 0);
			c.add(check_2); componentIndex.put(check_2.getName(), 1);
			c.add(test);	componentIndex.put(test.getName(), 2);
			
			
			
			check_1.addItemListener(new ItemListener() {		
				@Override
				public void itemStateChanged(ItemEvent e) {
					JCheckBox box= (JCheckBox)e.getSource();
					Container con= box.getParent();
					JButton b= (JButton)con.getComponent(2);
					
					if(e.getStateChange()==ItemEvent.SELECTED) {
//						test.setEnabled(false);
						b.setEnabled(false);
					}
					else {
//						test.setEnabled(true);
						b.setEnabled(true);
					}
				}
			});
			
			check_2.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					JCheckBox box= (JCheckBox)e.getSource();
					Container con= box.getParent();
					JButton b= (JButton)con.getComponent(2);
					if(e.getStateChange()==ItemEvent.SELECTED) {
//						test.setVisible(false);
						b.setVisible(false);
						}
					else {
//						test.setVisible(true);
						b.setVisible(true);
						}
				}
			});
						
			setSize(300,200);
			setVisible(true);
			setResizable(false);
			
		}
		
	}
	
	class backChange extends JFrame{
		
		public backChange() {
			super("배경색을 바꾸는 버튼 만들기"); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JButton b1 = new JButton("Yellow");
			JButton b2 = new JButton(" Pink ");
			
			c.add(b1);
			c.add(b2);
			
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b=(JButton)e.getSource();
					Container con= b.getParent();
					con.setBackground(Color.YELLOW);
					
				}
			});
			b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b=(JButton)e.getSource();
					Container con= b.getParent();
					con.setBackground(Color.PINK);
					
				}
			});
			
			setSize(300,200);
			setVisible(true);
			setResizable(false);
			
		}
	}

	
	
}
