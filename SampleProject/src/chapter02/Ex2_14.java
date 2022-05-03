package chapter02;

import java.util.Scanner;

//switch 문을 활용한 월별 일수 계산 프로그램
public class Ex2_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력 (1~12) : ");
		int month = scan.nextInt();
		int days = 0;
		switch(month) {
		case 2 : 	days = 28; break;
		case 4 :
		case 6 : 
		case 9 : 
		case 11 : 	days = 30; break;
		case 1 :
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 12 :	days = 31; break;
		default : 
			System.out.println("입력값 오류!");
		}
		scan.close();
	}
}
