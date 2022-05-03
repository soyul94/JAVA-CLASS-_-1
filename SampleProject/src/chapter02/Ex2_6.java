package chapter02;

public class Ex2_6 {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		c = ++a - b--;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("================");
		a += 3;
		System.out.println("a=" + a);
		boolean result = a <= b;
		System.out.println("a<=b ==> " + result);
	}

}
