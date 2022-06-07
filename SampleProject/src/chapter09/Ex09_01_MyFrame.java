package chapter09;

import javax.swing.JFrame;

public class Ex09_01_MyFrame extends JFrame{
	
//	public Ex09_01_MyFrame() {
//		setTitle("300x300 스윙 프레임 만들기");
//		setSize(300,300);
//		setVisible(true);
//	}

	public static void main(String[] args) {
		MyFrame myframe= new MyFrame();
	}

}

class MyFrame extends JFrame{
	MyFrame(){
		setTitle("첫번째 프레임");
		setSize(400,300);
		setVisible(true);
	}
}
