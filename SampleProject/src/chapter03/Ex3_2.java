package chapter03;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();	//정수1개 입력
		int sum = 0;				//누적합 초기화
		int count = 0;				//갯수 초기화
		while(num != -1) {
			sum += num;
			count++;
			num = scan.nextInt();
		}
		if(count == 0) {System.out.println("평균계산불가");}
		else {
			double average = (double)sum / count;
			System.out.print("갯수는 " + count + "이며, ");
			System.out.print("평균은 " + average + "입니다. ");
		}
	}
}
