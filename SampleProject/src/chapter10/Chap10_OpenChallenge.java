package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Chap10_OpenChallenge extends JFrame {

	public static void main(String[] args) {
		new Chap10_OpenChallenge();
	}
	
	public Chap10_OpenChallenge() {
		setTitle("갬블링 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		
		c.add(new GamePanel());	
	
		
		setSize(520,500);
		setVisible(true);
		setResizable(false);
	}

	class GamePanel extends JPanel{
		
		private JLabel[] number=new JLabel[3];
		private JLabel say;
		
		public GamePanel() {
			this.setLayout(null);
			
			for(int i=0; i<number.length; i++) {
				number[i]= new JLabel("0",SwingConstants.CENTER);
				number[i].setFont(new Font("Serif",Font.BOLD,100));
				number[i].setSize(100,120);
				number[i].setBackground(Color.MAGENTA);
				number[i].setForeground(Color.YELLOW);
				number[i].setVisible(true);
				number[i].setOpaque(true);
				this.add(number[i]);
			}
			
			number[0].setLocation(50,120);
			number[1].setLocation(200,120);
			number[2].setLocation(350,120);
			
			say= new JLabel("시작합니다",SwingConstants.CENTER);
			say.setFont(new Font("Serif",Font.BOLD,30));
			say.setSize(200,50);
			say.setLocation(150,300);
			this.add(say);
			
			this.setFocusable(true);
			this.requestFocus();
			
			this.addKeyListener(new startGame());
				
		}
		
		class startGame extends KeyAdapter{
			public void  keyPressed(KeyEvent e) {
				
				int keyCode= e.getKeyCode();
				String keyText= e.getKeyText(keyCode);
				
				int[] random =new int[3];
				
				if(keyText.equals("Enter")) {
					
					for(int i=0; i<number.length; i++) {
						number[i].setText("+");
					}
					
					try {
						//Thread.sleep(1000);
						
						for(int i=0; i<number.length; i++) {
							random[i] = (int)(Math.random()*5);
							number[i].setText(Integer.toString(random[i]));
							Thread.sleep(500);
						}
						if((random[0]==random[1]) && (random[1]==random[2])) {
							say.setText("축하합니다 !!");
						}
						else {
							say.setText("아쉽군요");
						}	
						
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					
					
				}				
			}
		}
		
	}

	
}

