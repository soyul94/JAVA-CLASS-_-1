package chapter04;

public class Circle {
	//속성 
	public double radius;	//원의 반지름
	public String name;	//원의 이름
	
	//생성자 메소드 오버로딩
	public Circle(){}	//기본생성자	
	public Circle(double radius, String name){
		this.radius = radius;
		this.name = name;
		System.out.println(this.name + ": " + this.getArea());
	}
	
	//일반 메소드
	public double getArea(){
		return 3.14 * radius * radius;
	}
	
	//main 메소드
	public static void main(String[] args) {
		Circle pizza = new Circle(10.0, "콤비네이션피자");//1.객체선언,객체생성후 레퍼런스하도록 함\
		Circle coin = new Circle();//1.객체선언,객체생성후 레퍼런스하도록 함\
		coin.radius= 5.0;
		coin.name = "500원 동전";
		System.out.println(coin.name + ": " + coin.getArea());				
	}
}