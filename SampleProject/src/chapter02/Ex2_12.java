package chapter02;

import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade;
		System.out.print("점수입력(0~100): ");
		int score = scan.nextInt();
		
		//다중 if-else 문 활용
		if(score >=90)		grade = 'A';
		else if(score >=80)	grade = 'B';
		else if(score >=70)	grade = 'C';
		else if(score >=60)	grade = 'D';
		else				grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");		
		scan.close();
	}
}
