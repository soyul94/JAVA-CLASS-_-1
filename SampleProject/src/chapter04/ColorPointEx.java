package chapter04;

//1. Point 클래스 작성 : 좌표 표현
class Point {
	int x, y;
	void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	void showPoint(){
		System.out.println("(" + x + ", " + y + ")");
	}
}
//2. Point를 상속받아서 ColorPoint 클래스 작성
class ColorPoint extends Point{
	String color;	
	void setColor(String color){this.color = color;}
	void showColorPoint(){
		System.out.print(this.color);
		showPoint();
	}	
}
//3. 프로그램에 대한 시나리오를 작성한다. 
public class ColorPointEx {
	public static void main(String[] args) {
		//3.1 Point 객체를 생성한다. 
		Point p = new Point();
		//3.2 Point 객체에 좌표를 세팅한다.
		p.set(1, 2);
		//3.3 Point 객체에 좌표를 출력한다.
		p.showPoint();
		//3.4 ColorPoint 객체를 생성한다. 
		ColorPoint cp = new ColorPoint();
		//3.5 ColorPoint 객체에 좌표를 세팅하고 색깔을 세팅한다.
		cp.set(3, 4);
		cp.setColor("red");
		//3.3 ColorPoint 객체에 색깔과 좌표를 출력한다.
		cp.showColorPoint();
	}
}