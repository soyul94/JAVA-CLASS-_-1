package chapter02;

import java.util.Scanner;

public class Ex2_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		//if - else 문
//		if(20<=age && age <30)
//			System.out.println("20대 입니다.");
//		else if(30<=age && age <40)
//			System.out.println("30대 입니다.");
//		else if(40<=age && age <50)
//			System.out.println("40대 입니다.");
//		else
//			System.out.println("20~40대가 아닙니다.");
		
		//조건연산자 활용
		String msg;
		msg = (20<=age && age <30) ? "20대 입니다." : "20대가 아닙니다.";
		System.out.println(msg);
		
		scan.close();
	}
}
