package chapter11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex11_08 {

	public static void main(String[] args) {
		new Ex11_08();
	}
	
	public Ex11_08() {
		new TextFieldEx();
	}
	
	class TextFieldEx extends JFrame{
		public TextFieldEx() {
			super("텍스트필드 만들기 예제"); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel label_1 = new JLabel("이름");
			JLabel label_2 = new JLabel("학과");
			JLabel label_3 = new JLabel("주소");
			JTextField text_1 = new JTextField("나자바", 20);
			JTextField text_2 = new JTextField("컴퓨터공학과", 20);
			JTextField text_3 = new JTextField("자바시", 20);
			
			c.add(label_1); c.add(text_1);
			c.add(label_2); c.add(text_2);
			c.add(label_3); c.add(text_3);
			
			JLabel totalLabel = new JLabel();
			totalLabel.setText(text_1.getText() +", "+ text_2.getText() +", "+ text_3.getText());
			c.add(totalLabel);
			
			setSize(300,200);
			setVisible(true);
			setResizable(false);
			
		}
	}

}
