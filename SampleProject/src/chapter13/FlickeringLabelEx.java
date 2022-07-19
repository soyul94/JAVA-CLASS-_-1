package chapter13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	
	String text;
	int delay;
	
	
	public FlickeringLabel(String text, int delay) {
		super(text);	//상속받은 jlabel 호출
		this.text=text;
		this.delay=delay;
		//라벨별로 따로 동작해야하는 기능을 추가
		setOpaque(true);
		
		//각각의 생성자 호출 시 스레드를 함께 호출
		Thread th = new Thread(this);	//<- Thread th = new Thread(new FlickeringLabel(text, delay));
		th.start();
		System.out.println("우선순위 : " + th.getPriority()); //해당 스레드의 디폴트 우선순위는 5
		th.setPriority(6);
		System.out.println("우선순위 : " + th.getPriority());
	}
	
	@Override
	public void run() {
		boolean state = false;
		while(true) {

//			if(state){
//				setBackground(Color.YELLOW);
//				state= false;
//			}
//			else{
//				setBackground(Color.GREEN);
//				state= true;
//			}
			
			if(state) 	setBackground(Color.YELLOW);
			else		setBackground(Color.GREEN);
			if(state)	state= false;
			else		state= true;
			
				
			try {Thread.sleep(delay);}
			catch(InterruptedException e) {return;}
		}
		
	}
	
}



public class FlickeringLabelEx extends JFrame{
	
	FlickeringLabelEx(){
		setTitle("깜빡이 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel label_1 = new FlickeringLabel("0.5초씩 깜빡", 500);
		JLabel label_2 = new JLabel("안깜빡");
		FlickeringLabel label_3 = new FlickeringLabel("1초씩 깜빡", 1000);
		
		c.add(label_1);
		c.add(label_2);
		c.add(label_3);
		
		setSize(300,200);
		setVisible(true);
	}

	
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
