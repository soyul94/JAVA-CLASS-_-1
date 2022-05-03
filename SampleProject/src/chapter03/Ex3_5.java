package chapter03;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i<=5; i++) {
			System.out.print("입력 : ");
			int num = scan.nextInt();
			if (num > 0) sum += num;
			else continue;
		}
		System.out.println("합산결과는 " + sum);
		scan.close();
	}
}