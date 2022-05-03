package chapter06;

class Point{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;		//이건 왜 업캐스팅 없이 다운캐스팅이 되는거지 ?
		if(this.x==p.x && this.y==p.y) return true;
		else return false;
	}
	
}


public class ObjectPropertyEx {

	public static void print(Object obj) {
		System.out.println(obj.getClass()); 
		System.out.println(obj.getClass().getName());
		System.out.println("obj 의 hashcode : "+obj.hashCode());
		System.out.println("obj 의 toString : "+obj.toString());
		System.out.println(obj); //자동으로 toString호출
	}
	
	public static void main(String[] args) {
		Point P = new Point(2,3);
		print(P); //모든 class들은 Object를 상속받은 상태. 즉 Object가 인수인 print는 업캐스팅되어 실행된다.
		System.out.println();
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		Point p3 = p1;
		
		System.out.println(p1);
		System.out.println(p2);
		if(p1==p2) System.out.println("p1과 p2는 같은 객체이다");
		else System.out.println("p1과 p2는 객체아이디가 다릅니다");
		if(p1==p3) System.out.println("p1과 p3는 같은 객체아이디입니다");
		else System.out.println("p1과 p2는 객체아이디가 다릅니다");
		if(p1.equals(p2))System.out.println("p1과 p2는 같은 값을 갖고있습니다.");
		
//		Object obj_1 = new Object();
//		Object obj_2 = new Object();
//		ㄴ
//		System.out.println(obj_1.getClass()); // object객체가 가지고 있는 패키지 주소를 찍어줌
//		System.out.println(obj_1.getClass().getName());
//		System.out.println("obj_1 "+obj_1.hashCode());
//		System.out.println("obj_2 "+obj_2.hashCode());
//		System.out.println("obj_1 "+obj_1.toString());
//		System.out.println("obj_2 "+obj_2.toString());
//		System.out.println(obj_1); //자동으로 toString호출
	}

}
