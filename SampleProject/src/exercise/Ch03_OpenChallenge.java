package exercise;

import java.util.Random;
import java.util.Scanner;

public class Ch03_OpenChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		randomNumber rn = new randomNumber();
		
		while(true) {
			rn.game(scan);
			scan.nextLine();
			System.out.print("다시 하시겠습니까 ? (y/n) >> ");
			String temp = scan.nextLine();			
			if(temp.equals("y"))
				continue;
			else
				break;
		}
		
		System.out.println("종료합니다");
		scan.close();
	}

}

class randomNumber{
	private int randNum;
	
	public void game(Scanner scan) {
		
		Random rand = new Random();
		randNum = rand.nextInt(100); //  0-99까지 임의의 정수 생성
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		
		int count=0;
		boolean succese = false;
		while(count<7) {
			count++;
			System.out.print(count+" >> ");
			int player = scan.nextInt();
			if((randNum-player)>0) {
				System.out.println("더 높게");
			}
			else if((randNum-player)<0) {
				System.out.println("더 낮게");
			} 
			else {
				System.out.println("맞았습니다");
				succese = true;
				break;
			}
		}
		if(!succese)
			System.out.println("실패했습니다.");
		
	}
	
}
