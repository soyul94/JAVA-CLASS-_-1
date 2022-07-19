package exercise;

import java.util.Scanner;

public class Ch03_Practice16 {

	public static void main(String[] args) {
		String[] str = {"가위","바위","보"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보 ! >> ");
			String temp = scan.nextLine();
			
			if(temp.equals("그만"))
				break;
			
			int com=(int)(Math.random()*str.length);
			int player = -1;
			int result= -10;
			
			for(int i=0; i<str.length; i++) {
				if(str[i].equals(temp)) {
					player = i;
					result = player-com;
					break;
				}
			}
			
			System.out.print("사용자 = "+str[player]+" , 컴퓨터 = "+str[com]+". ");
			if(result==0) {
				System.out.println("비겼습니다.");
			}
			else if(result==-1 || result==2) {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(result==1 || result==-2) {
				System.out.println("사용자가 이겼습니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		System.out.println("종료합니다");
		scan.close();
	}

}
