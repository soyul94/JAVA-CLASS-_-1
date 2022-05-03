package chapter03;

import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];	//배열선언 및 생성
		int max = 0;
		for(int i = 0; i < 5; i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i] > max) max = intArray[i];
		}
		System.out.println("가장 큰 값은 " + max + "입니다.");		
		scan.close();
	}
}
