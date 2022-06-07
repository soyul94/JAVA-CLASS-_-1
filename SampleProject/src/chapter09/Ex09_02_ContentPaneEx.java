package chapter09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex09_02_ContentPaneEx {

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}

class ContentPaneEx extends JFrame{
	
	public ContentPaneEx(){
		super("ContentPane JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane= getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
//		contentPane.add(new JButton("OK"));
//		contentPane.add(new JButton("Cancel"));
//		contentPane.add(new JButton("Ignere"));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculate"));
		
		setSize(300,150);
		setVisible(true);
	}
}