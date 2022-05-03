package chapter02;

import java.util.Scanner;

public class Exx2_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99 사이의 정수 입력 >> ");
		int num = scan.nextInt();
		int count = 0;	//3,6,9의 갯수를 카운팅
		
		if(num>=1 && num <=99) 	
		{
			int ten = num / 10; //십의 자리 분리
			int one = num % 10;	//일의 자리 분리
			if(ten!=0 && ten%3==0) count++;
			if(one!=0 && one%3==0) count++;
			
			if(count == 1) 		System.out.println("박수짝");
			else if(count == 2)	System.out.println("박수짝짝");
			else				System.out.println("박수없어!");
		}
		else					
		{System.out.println("입력범위오류!");}
		scan.close();
	}
}