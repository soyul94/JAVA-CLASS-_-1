package exercise;

import java.util.Scanner;

public class Ch03_Practice05 {

	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i=0; i<10; i++) {
			num[i] = scan.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i=0; i<10; i++) {
			if(num[i]%3==0 && num[i]!=0)			
				System.out.print(num[i]+"  ");
		}

		scan.close();
	}

}
