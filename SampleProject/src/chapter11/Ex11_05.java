package chapter11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex11_05 {

	public static void main(String[] args) {
		new Ex11_05();
	}
	
	public Ex11_05() {
		new CheckBoxItemEventEx();
	}

	class CheckBoxItemEventEx extends JFrame{
		private JLabel sumLabel;
		private int sum=0;
		private JCheckBox[] fruits = new JCheckBox[3];
		private String[] fruitNames = {"사과","배","체리"};
		
		public CheckBoxItemEventEx() {
			super("체크박스와 ItemEvent 예제"); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());	
			
			JLabel topLabel = new JLabel("사과 100원, 배 500원, 체리 20000원");
			sumLabel = new JLabel("현재 "+sum+"원 입니다");
			
			MyItemListener listner = new MyItemListener();
			
			c.add(topLabel);
			for(int i=0; i<fruits.length; i++) {
				fruits[i]= new JCheckBox(fruitNames[i]);
				fruits[i].addItemListener(listner);
				c.add(fruits[i]);
			}
			c.add(sumLabel);
			
			setSize(250,200);
			setVisible(true);
			setResizable(false);			
		}
		
		
		class MyItemListener implements ItemListener{
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange()==ItemEvent.SELECTED) {
					if(e.getItem()==fruits[0]) sum+=100;
					else if(e.getItem()==fruits[1]) sum+=500;
					else if(e.getItem()==fruits[2]) sum+=20000;					
				}
				else {
					if(e.getItem()==fruits[0]) sum-=100;
					else if(e.getItem()==fruits[1]) sum-=500;
					else if(e.getItem()==fruits[2]) sum-=20000;					
				}
				
				sumLabel.setText("현재 "+sum+"원 입니다");
			}
		}
		
	}
	
}
