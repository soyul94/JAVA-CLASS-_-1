package chapter02;

import java.util.Scanner;

public class Ex2_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("시간 (09~24) : ");
		int time = scan.nextInt();
		System.out.print ("나이 (03~99) : ");
		int age = scan.nextInt();
		//중첩if를 활용한 입장권 매표 프로그램
		int price = 0;
		if(time >= 9 && time <= 18) 	//주간권
			if(age <= 5 || age >= 65) 	price = 15000;//소인,노인
			else						price = 20000;//대인
		else if(time > 18 && time <=24)	//야간권
			if(age <= 5 || age >= 65) 	price = 5000;//소인,노인
			else						price = 10000;//대인
		
		System.out.println("나이 : " +age + ", 시간 : " + time);
		System.out.println("입장료 : " + price);
		scan.close();
	}
}
