package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadTimer extends Thread {
	
	int n=0;
	JLabel timerLabel;
	
	public ThreadTimer(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {sleep(1000);} //sleep은 스레드의 메소드기 때문에 바로 사용가능
			catch(InterruptedException e) {return;}
			
			if(n==16) break;
		}
	}


}

public class ThreadTimerEx extends JFrame{
	
	
	public ThreadTimerEx() {
		setTitle("스레드 timer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
		c.add(timerLabel);
		
		ThreadTimer th = new ThreadTimer(timerLabel);
		th.start();
		
		setSize(300,170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ThreadTimerEx th = new ThreadTimerEx();
		//th.start();
	}
}