package exercise;

import java.util.Scanner;

public class Ch04_OpenChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int plNum = scan.nextInt(); scan.nextLine();
		
		String[] name= new String[plNum];
		for(int i=0; i<name.length; i++)
			name[i]= scan.nextLine();
		
		System.out.println("시작하는 단어는 아버지입니다");
		String word = "아버지";
		while(true) {
			for(int i=0; i<name.length; i++) {
				String temp = scan.nextLine();
				
			}
		}
		
	}
	
	class WordGameApp{
		public WordGameApp() {}
		
		public void run(int plNum) {
			Player[] player=new Player[plNum];
		}
	}
	
	class Player{
		private String name;
		//private String wordFromUser;
		
		public Player() {}
		public Player(String name) {
			this.name = name;
		}
		
		public void getWordFromUser(Scanner scan) {
			
		}
		
	}

}
