package chapter04;

import java.util.Scanner;

public class StaticMember {
	public static void main(String[] args) {
		//로직 작성
		Scanner scan = new Scanner(System.in);
		//1. 환율을 입력받는다.
		System.out.println("환율(1달러) >>> ");
		double rate = scan.nextDouble();
		CurrencyConverter.setRate(rate);
		
		System.out.println("백만원은 달러로 " + CurrencyConverter.toDollor(1000000.0));
		System.out.println("백달러는 원화로 " + CurrencyConverter.toKWR(100.0));
	}
}

//원화 변환 클래스 
class CurrencyConverter{
	//속성
	private static double rate = 1250.0; //클래스 변수
	//메소드
	public static void setRate(double r){rate = r;}
	public static double getRate(){return rate;}
	public static double toDollor(double won)
	{return won / rate;}
	public static double toKWR(double dollar)
	{return dollar * rate;}
}




