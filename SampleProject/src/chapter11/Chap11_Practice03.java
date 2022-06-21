package chapter11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Chap11_Practice03 extends JFrame{
	public static void main(String[] args) {
		new Chap11_Practice03();
	}
	
	private JTextField[] money= new JTextField[9];
	private String[] text= {"50000원", "10000원", "5000원", "1000원", "500원", "100원", "50원", "10원", "1원"};
	private int[] money_unit= {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
	private JTextField totalMoney = new JTextField(12);
	//private int sum=0;
	
	
	public Chap11_Practice03() {
		super("Money Changer"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		JLabel label= new JLabel("금액");
		JButton calBtn= new JButton("계산");
		JPanel topPanel = new JPanel(new FlowLayout());
		topPanel.add(label);
		topPanel.add(totalMoney);
		topPanel.add(calBtn);
		c.add(topPanel);
		topPanel.setBackground(Color.PINK);
		
		calBtn.addActionListener(new MyActionListener());
		
		for(int i=0; i<money.length; i++) {
			JPanel temp = new JPanel();
			temp.setLayout(null);
			temp.setSize(300,30);
			temp.setVisible(true);
			temp.setBackground(Color.PINK);
			
			JLabel l = new JLabel(text[i],SwingConstants.RIGHT);
			l.setBounds(0, 0, 100, 30);
			//l.setBackground(Color.PINK);
			temp.add(l);
			
			JPanel p= new JPanel();
			p.setBounds(100, 0, 200, 30);
			money[i]=new JTextField("0",7);
			money[i].setHorizontalAlignment(JTextField.CENTER);
			p.add(money[i]);
			p.setOpaque(true);
			p.setBackground(Color.PINK);
			temp.add(p);
			c.add(temp);
		}
		setSize(300,400);
		setVisible(true);
		setBackground(Color.PINK);
		setResizable(false);
		
	}
	
	
	class  MyActionListener implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int num= Integer.parseInt(totalMoney.getText());
			
			for(int i=0; i<money.length; i++) {
				money[i].setText(Integer.toString(num/money_unit[i]));	
				num %=money_unit[i];
			}
			
//			for(int i=0; i<money.length; i++) {
//				sum += (money_unit[i] * Integer.parseInt(money[i].getText()));	
//			}
//			totalMoney.setText(Integer.toString(sum));
		}
	}
}


/*
new BoxLayout(레이아웃을 적용할 컴포넌트, 정렬 방향)
정렬방향 : BoxLayout.Y_AXIS, BoxLayout.X_AXIS

https://www.habonyphp.com/2021/01/java-41.html  -> 여기 참고
*/