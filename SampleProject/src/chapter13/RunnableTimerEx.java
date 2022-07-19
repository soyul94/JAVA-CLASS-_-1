package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RunnableTimer implements Runnable {
	
	int n=0;
	JLabel timerLabel;
	
	public RunnableTimer(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {return;}
			
			if(n==16) break;
		}
	}


}

public class RunnableTimerEx extends JFrame{
	
	
	public RunnableTimerEx() {
		setTitle("스레드 timer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
		c.add(timerLabel);
		
		RunnableTimer runnable = new RunnableTimer(timerLabel);
		Thread th = new Thread(runnable);
		th.start();
		
		setSize(300,170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		RunnableTimerEx th = new RunnableTimerEx();
		//th.start();
	}
}