//원의 면적 구하는 프로그램
package chapter01;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14;	//파이값 상수
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 반지름은? ");
		double radius = scan.nextDouble();
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적은? " + circleArea);
		scan.close();
	}
}