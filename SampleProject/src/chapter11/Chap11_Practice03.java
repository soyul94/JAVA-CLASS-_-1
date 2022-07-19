package chapter11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	private JCheckBox[] check_unit = new JCheckBox[8];
	private boolean[] check_bool = {false,false,false,false,false,false,false,false,true};
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
			l.setBounds(0, 0, 80, 30);
			//l.setBackground(Color.PINK);
			temp.add(l);
			
			JPanel text= new JPanel();
			text.setBounds(100, 0, 100, 30);
			money[i]=new JTextField("0",7);
			money[i].setHorizontalAlignment(JTextField.CENTER);
			text.add(money[i]);
			text.setOpaque(true);
			text.setBackground(Color.PINK);
			temp.add(text);
			
			JPanel check = new JPanel();
			check.setBounds(180, 0, 100, 30);
			if(i!=(money.length-1)) {
				check_unit[i] = new JCheckBox();
				check_unit[i].setBackground(Color.PINK);
				check_unit[i].addItemListener(new MyItemListener());
				check.add(check_unit[i]);
			}
			check.setOpaque(true);
			check.setBackground(Color.PINK);
			temp.add(check);
			
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
				money[i].setText("0");	
				if(check_bool[i]) {
					money[i].setText(Integer.toString(num/money_unit[i]));	
					num %=money_unit[i];	
				}
			}
			
//			for(int i=0; i<money.length; i++) {
//				sum += (money_unit[i] * Integer.parseInt(money[i].getText()));	
//			}
//			totalMoney.setText(Integer.toString(sum));
		}
	}
	
	
	class MyItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox check = (JCheckBox)e.getSource();
			
			for(int i=0; i<check_unit.length; i++) {
				if(check_unit[i]==check) { //객체의 레퍼런스를 비교하는 것이기 때문에 단순 ==로 비교함.
					if(e.getStateChange()==ItemEvent.SELECTED) {
						check_bool[i]=true;	
					}
					else {
						check_bool[i]=false;
					}
				}	
			}
			
		}
	}
	
}


/*
new BoxLayout(레이아웃을 적용할 컴포넌트, 정렬 방향)
정렬방향 : BoxLayout.Y_AXIS, BoxLayout.X_AXIS

https://www.habonyphp.com/2021/01/java-41.html  -> 여기 참고
*/