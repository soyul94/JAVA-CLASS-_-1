package chapter03;
import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("분자: ");
			int dividend = scan.nextInt();
			System.out.println("분모: ");
			int divisor = scan.nextInt();
			try 
			{	
				System.out.println("나눗셈결과 : " + dividend/divisor);
				break;
			}
			catch(ArithmeticException e) 
			{
				System.out.println("분모가 0이라 나눌 수 없어요!");
			}
		}
	}
}
