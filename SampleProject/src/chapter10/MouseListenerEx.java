package chapter10;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {

	public static void main(String[] args) {
		new MouseListenerEx();
	}
	
	private JLabel label= new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		//c.addMouseListener(new MyMouseListener());
		c.addMouseListener(new MyMouseAdapter());
		
		
		//1.레이아웃세팅
		c.setLayout(null);
		label.setSize(50,20);
		label.setLocation(30,30);
		c.add(label);
		
		//2.화면에 프레임이 보이도록 세팅
		setSize(250,250);
		setVisible(true);
		setResizable(false);//창크기 고정
				
	}
	
	//MouseAdapter 마우스어뎁터 사용
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);
		}
	}
	
	
	//MouseListener 마우스리스너 사용
//	class MyMouseListener implements MouseListener{
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
//			label.setLocation(x,y);
//		}
//
//		@Override
//		public void mouseClicked(MouseEvent e) {}
//		@Override
//		public void mouseReleased(MouseEvent e) {}
//		@Override
//		public void mouseEntered(MouseEvent e) {}
//		@Override
//		public void mouseExited(MouseEvent e) {}	
//		//이렇게 빈 메소드들은 더미코드라고 한다. 기능은 없지만 컴파일에 돌아가긴함
//	}
	

}
