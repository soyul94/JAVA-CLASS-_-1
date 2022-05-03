package chapter03;

import java.util.Scanner;

public class Ex3_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		while(true)	//무한루프, for(;;)
		{
			System.out.println(">> ");
			String text = scan.nextLine();
			if(text.equals("exit")) break;
		}
		System.out.println("종료합니다.");
	}

}
