package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer1 {
	
	int n=0;
	JLabel timerLabel;
	
	public Timer1(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void init() {
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {Thread.sleep(1000);} //sleep은 스레드의 메소드기 때문에 바로 사용가능
			catch(InterruptedException e) {return;}
			
			if(n==16) break;
		}
	}


}

public class Ex13 extends JFrame{
	
	
	public Ex13() {
		setTitle("스레드 timer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
		c.add(timerLabel);
		
		Timer1 th = new Timer1(timerLabel);
		th.init();
		
		setSize(300,170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex13 th = new Ex13();
		//th.start();
	}
}