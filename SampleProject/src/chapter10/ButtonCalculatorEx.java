package chapter10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ButtonCalculatorEx {

	public static void main(String[] args) {
		new ButtonCalculator();
	}

}

class ButtonCalculator extends JFrame {
	
	private Container contentPane;
	private JTextField input= new JTextField(20);
	private JTextField result= new JTextField(20);
	private String total_string="";
	private MyActionListener myActionListener = new MyActionListener();
	
	public ButtonCalculator(){
		super("a Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.contentPane= getContentPane();
		
		this.contentPane.setLayout(new BorderLayout(0,0));
		
		this.contentPane.add(inputPanel(),BorderLayout.NORTH);
		
		this.contentPane.add(buttonPanel(),BorderLayout.CENTER);		
		
		this.contentPane.add(resultPanel(),BorderLayout.SOUTH);
		
		
		setSize(400,300);
		setVisible(true);
		setResizable(false); //창 크기 고정
	}
	
	private JPanel inputPanel() {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel_1.add(new JLabel("수식 입력"));
		panel_1.add(input);
		
		return panel_1;
	}
	
	private JPanel buttonPanel() {
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(4,4));
		for(int i=0; i<=9; i++) {
			JButton button= new JButton(Integer.toString(i));
			button.addActionListener(myActionListener);
			panel_2.add(button);
		}
		JButton delete_button= new JButton("CE");
		delete_button.addActionListener(myActionListener);
		panel_2.add(delete_button);
				
		JButton result_button= new JButton("계산");
		result_button.addActionListener(myActionListener);
		panel_2.add(result_button);
		
		JButton[] buttons= {new JButton("+"),new JButton("-"),new JButton("*"),new JButton("/")};
		for(int i=0;i<buttons.length;i++) {
			buttons[i].setBackground(Color.CYAN);
			buttons[i].addActionListener(myActionListener);
			panel_2.add(buttons[i]);
		}	
		
		return panel_2;
	}
	
	private JPanel resultPanel() {
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel_3.add(new JLabel("계산 결과"));
		panel_3.add(result);
		
		return panel_3;
	}

	//내부 클래스
	private class MyActionListener implements ActionListener{	
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button= (JButton)e.getSource();
			if(button.getText().equals("CE")) {
				total_string="";
				input.setText(total_string);
			}
			else if(button.getText().equals("계산")) {
				Double end= calc(total_string);
				if(end!=null)
					result.setText(String.valueOf(end));
				else
					result.setText("실패");
			}
			else {
				total_string+=button.getText();
				input.setText(total_string);			
			}
		}	
	}
	
	private Double calc(String in) {
		double result = 0;
		int index= -1;
		try {
			index= in.indexOf("+");
			System.out.println(in);
			if(index>0) {
			System.out.println(in.substring(0,index));
			System.out.println(in.substring(index+1));
				return calc(in.substring(0,index))+calc(in.substring(index+1));
			}
			else {
				index=in.indexOf("-");
				if(index>0) {
				System.out.println(in.substring(0,index));
				System.out.println(in.substring(index+1));
					return calc(in.substring(0,index))-calc(in.substring(index+1));
				}
				else {
					index=in.indexOf("*");
					if(index>0) {
					System.out.println(in.substring(0,index));
					System.out.println(in.substring(index+1));
						return calc(in.substring(0,index))*calc(in.substring(index+1));
					}
					else {
						index=in.indexOf("/");
						if(index>0) {
						System.out.println(in.substring(0,index));
						System.out.println(in.substring(index+1));
							if(calc(in.substring(index+1))!=0.0)
								return calc(in.substring(0,index))/calc(in.substring(index+1));
							else
								return null;
						}
					}
				}
			}
		} catch (NullPointerException e) {
//			e.printStackTrace();
			return null;
		}
		
		String data= in.trim();
		if(data==null||data.isEmpty()) {
			return 0.0;
		}
		
		return Double.parseDouble(data);
	}
	
	
}
