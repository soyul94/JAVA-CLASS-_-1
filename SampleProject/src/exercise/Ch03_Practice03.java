package exercise;

import java.util.Scanner;

public class Ch03_Practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int num = scan.nextInt();
		
		for(int i=num; i>0; i-- ) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		scan.close();
	}

}
