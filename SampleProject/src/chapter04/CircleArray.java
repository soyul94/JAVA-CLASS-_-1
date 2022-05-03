package chapter04;

public class CircleArray {
	public static void main(String[] args) {
		Circle0[] c;
		c = new Circle0[5];
		for(int i=0; i<c.length; i++)
			c[i] = new Circle0(i);
		for(Circle0 cc : c)
			System.out.println(cc.getArea());	
	}
}

class Circle0{
	//필드
	double radius;
	//생성자메소드
	Circle0(double radius){
		this.radius = radius;
	}
	//일반메소드
	double getArea() {
		return 3.14 * radius * radius;
	}
}

