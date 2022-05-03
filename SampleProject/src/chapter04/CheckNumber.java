package chapter04;

import java.util.Random;
import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);	

		int com = rand.nextInt(100) + 1;	//컴퓨터랜덤생성
		//int com1 = (int)(Math.random() * 100 + 1);		
		//시도횟수를 7회까지만 허용하라!
		boolean success = false; //성공여부		
		int tries = 1; 
		//do-while 문으로도 교체해보세요 !
		System.out.println("############ 숫자 맞추기 게임 ############");
		while(true) {		
			System.out.print("1~100사이의 숫자 입력 : ");
			int user = scan.nextInt();			//사용자입력한값
			if(tries >= 7)   break;
			if(user == com) 
				{
				    success = true;
					break;	//성공시 성공여부를 변경시킨다
				}
			else if(user > com)	System.out.println("Down 시켜봐~");
			else if(user < com) System.out.println("Up 시켜봐~");
			tries++;
		}		
		//성공여부에 따른 처리 
		if (success == true)	System.out.println("숫자맞추기 성공!");
		else 					System.out.println("시도횟수7회 초과!");
		System.out.println("컴퓨터 생성 값 : " + com);
	}
}