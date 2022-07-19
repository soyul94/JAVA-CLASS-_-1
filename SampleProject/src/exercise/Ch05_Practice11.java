package exercise;

import java.util.Scanner;

//추상클래스 정의
abstract class Calc{
	protected int a;
	protected int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
}

public class Ch05_Practice11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a= scan.nextInt(); //Integer.parseInt(scan.next());
		int b= scan.nextInt(); //Integer.parseInt(scan.next());
		char op = scan.next().charAt(0);
		scan.nextLine();
		
		switch(op) {
		case '+' : 
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate()); 
			break;
		case '-' : 
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate()); 
			break;
		case '*' : 
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate()); 
			break;
		case '/' : 
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate()); 
			break;
		default :System.out.println("잘못된 입력입니다");
		}
		scan.close();
	}

}

class Add extends Calc {
	
	public int calculate() {
		return super.a+super.b; 
	}
}
class Sub extends Calc{

	
	public int calculate() {
		return super.a-super.b; 
	}
}
class Mul extends Calc{

	
	public int calculate() {
		return super.a*super.b; 
	}
}
class Div extends Calc{
	
	public int calculate() {
		int result=0;
		
		try {
			result=a/b;
		}
		catch(ArithmeticException e){
			result=0;
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		return result;
	}
}
