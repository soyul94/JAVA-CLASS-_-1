package chapter07;

import java.util.Iterator;
import java.util.Vector;

class Point{
	int x,y;
	public Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() { // toString 메소드는 정의가 되면 클래스 이름으로 호출이 된다.
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}


public class PointVectorEs {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(1,2));
		v.add(new Point(2,3));
		v.add(new Point(30,-8));
		
		Iterator<Point> it = v.iterator(); //iterator는 이미 완료된 컬렉션에 쓰는 것이 좋다. 
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		v.add(new Point(40,-8));
		
		it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
//		for(int i=0; i<v.size(); i++) {
//			System.out.println(v.get(i));
//			System.out.println(v.get(i).toString());
//		}
//		
		
	}

}
