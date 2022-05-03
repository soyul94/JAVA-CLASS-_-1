package chapter04;

class Calc{
	static int abs(int a) {
		return a>0? a : -a;
	}
	static int max(int a, int b) {
		return a>b? a : b; 
	}
	static int min(int a, int b) {
		return a<b? a : b;
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-10));
		System.out.println(Calc.max(3, 5));
		System.out.println(Calc.min(1, 2));
	}
}