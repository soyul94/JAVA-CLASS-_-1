package chapter08;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Simple_HangMan {

	public static void main(String[] args) {
		HangMan_Game hangmanGame= HangMan_Game.getHangmanGame();
		
		//hangmanGame.setAnswerCnt(7);
		//hangmanGame.setBlankNum(4);
		
		hangmanGame.hangmanGameRepeat();
		
/*		
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		do {			
			hangmanGame.hangmanGame();
			System.out.print("계속하겠습니까 ? >> ");
			String enser = hangmanGame.scan.nextLine();
			if(enser.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
			else if(enser.equals("Y"))
				continue;
			else {
				System.out.println("잘못된 입력입니다. 종료합니다.");
				break;
			}
		}
		while(true);
*/		
		hangmanGame.scan.close();
	}
}



class HangMan_Game{
	private Random random = new Random();
	private Vector<String> wordVector;
	private int blankNum=2; // 단어에 있을 빈칸의 수
	private int answerCnt=5;// 정답 입력이 가능한 횟수
	public Scanner scan = new Scanner(System.in);
	
	//싱글톤 패턴
	private static HangMan_Game hangmanGame = new HangMan_Game();
	public static HangMan_Game getHangmanGame() {
		return hangmanGame;
	}
	//외부에서 생성할 수 없도록 private 
	private HangMan_Game() {};
	
	
	//getters and setters
	public int getBlankNum() {
		return blankNum;
	}
	public void setBlankNum(int blankNum) {
		this.blankNum = blankNum;
	}
	public int getAnswerCnt() {
		return answerCnt;
	}
	public void setAnswerCnt(int answerCnt) {
		this.answerCnt = answerCnt;
	}


	//words.txt파일의 단어들을 Vector에 저장하기 
	{//클래스 생성시 한번만 움직이도록 초기화 블럭생성.
		this.wordVector = new Vector<>();
		try {
			Scanner scan = new Scanner(new FileReader("d:\\JAVACLASS\\fileTest\\words.txt"));
			while(scan.hasNext()) {
				String word = scan.nextLine();
				this.wordVector.add(word);
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	//wordVector에서 랜덤한 단어 생성
	public String randomWord() {
		String word=null;
		while(true) {
			int number = this.random.nextInt(this.wordVector.size());
			
			word=this.wordVector.get(number).toLowerCase();
			if(word.length()<blankNum) // 랜덤으로 뽑힌 단어는 빈칸의 갯수보다 길이가 커야한다.
				continue;
			else
				break;
		}		
		return word;
	}
	
	
	//주어진 단어에서 랜덤한 위치로 주어진 수만큼 빈칸을 만들어 주는 메소드
	public ArrayList<Character> coverWord(String word) {
		ArrayList<Character> gameWord = new ArrayList<Character>();
		
		for(int i=0; i<word.length(); i++) //gameWord에 word를 대입 
			gameWord.add(word.charAt(i));
		
		int i=0;
		while(true) {
			//System.out.println(i);
			int number = random.nextInt(word.length());
			//Character temp = word.charAt(number); -> 중복검사를 위해 임시로 만든 변수에 들어가는 값이 _표시 하지 않은 원본 단어여서 중복 검사가 되지 않던 것 
			Character temp = gameWord.get(number);
			
			if(temp.equals('_')) //랜덤하게 뽑은 수에 해당하는 값이 '_'인 경우 해당 while문은 스킵 
				continue;
				
			gameWord.set(number, '_');
			i++;
			//가져야할 문자가 2개라는 조건에서만 사용할 수 있는 확실한 break조건문
			//if((gameWord.indexOf('_')!=gameWord.lastIndexOf('_'))&&gameWord.indexOf('_')>0&&gameWord.lastIndexOf('_')>0)
			if(i==blankNum)
				break;
		}	
		return gameWord;
	}
	
	
	//coverWord()에서 생성한 gameWord를 콘솔에 출력하는 메소드
	public void printCoverWord (ArrayList<Character> coverWord) {
		for(char a: coverWord)
			System.out.print(a+" ");
		System.out.println();
	}
	
	
	//gameWord의 빈칸에 있는 문자를 저장한 HashMap<Integer, Character>를 반환하는 메소드
	//이때, Character은 문자이고 Integer은 문자의 자리값이기 때문에 중복이 발생할 수 없는 자리값을 HashMap의 key값이 되어야한다.
	public HashMap<Integer, Character> blankWord(ArrayList<Character> gameWord, String randomWord){
		HashMap<Integer, Character> blankChar= new HashMap<Integer, Character>(blankNum);
		for(int i=0; i<gameWord.size(); i++) {
			if(gameWord.get(i).equals('_')) {
				blankChar.put(i, randomWord.charAt(i)) ;
			}
			if(blankChar.size()==blankNum)
				break;
		}
		System.out.println(blankChar);
		return blankChar;
	}
	
	
	//행맨 게임 1회 실행
	public void hangmanGame() {
		String randomWord = hangmanGame.randomWord();
		ArrayList<Character> gameWord = hangmanGame.coverWord(randomWord);
		HashMap<Integer, Character> blankChar = hangmanGame.blankWord(gameWord, randomWord);
		
		boolean success = false;
		
		for(int cnt=0; cnt<answerCnt; cnt++) { //정답을 언급할 수 있는 횟수만큼 for문 실행
			hangmanGame.printCoverWord(gameWord); //문제 출력
			System.out.print(">> ");
			Character answer = scan.nextLine().charAt(0); //정답을 입력받음
			if(!blankChar.containsValue(answer)) { //입력 받은 answer이 blankChar에 포함된 value인지 확인
				continue;						 //answer가 blankChar의 value에 포함되지 않는다면 for문 스킵
			}
			else {						
				Iterator<Integer> keys = blankChar.keySet().iterator();
				while(keys.hasNext()) {
					Integer key = keys.next(); // 빈칸의 문자가 중복일 경우 따로따로 입력될 수 있도록 gameWord가 '_'인지 확인
					if(blankChar.get(key).equals(answer) && gameWord.get(key).equals('_')) {
						gameWord.set(key, answer);
						break;
					}	
				}
			}
			
			if(!gameWord.contains('_')) {	//gameWord에 모든_가 문자로 치환되면 for문을 중단하고 게임 성공으로 변경
				success = true;
				break;
			}
		}
		System.out.println("정답은 "+randomWord+" 입니다.");
		if(success)
			System.out.println("성공했습니다");
		else
			System.out.println(answerCnt+"번 실패 하였습니다.");
		System.out.println();
	}
	
		
	//행맨 게임 반복 실행
	public void hangmanGameRepeat() {
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		do {			
			hangmanGame.hangmanGame();
			System.out.print("계속하겠습니까 ? >> ");
			String enser = hangmanGame.scan.nextLine();
			if(enser.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
			else if(enser.equals("Y"))
				continue;
			else {
				System.out.println("잘못된 입력입니다. 종료합니다.");
				break;
			}
		}
		while(true);
	}
		
/*	//blankWord를 ArrayList<Character>로 생성한 경우.
	//gameWord의 빈칸에 있는 문자를 저장한 ArrayList<Character>를 반환하는 메소드
	public ArrayList<Character> blankWord(ArrayList<Character> gameWord, String randomWord){
		ArrayList<Character> blankChar= new ArrayList<Character>();
		int index=0;
		for(int i=0; i<gameWord.size(); i++) {
			if(gameWord.get(i).equals('_')) {
				blankChar.add(randomWord.charAt(i)) ;
				index++;
			}
			if(index==blankNum)
				break;
		}
		System.out.println(blankChar);
		return blankChar;
	}
	
	//행맨 게임 1회 실행
	public void hangmanGame() {
		String randomWord = hangmanGame.randomWord();
		ArrayList<Character> gameWord = hangmanGame.coverWord(randomWord);
		ArrayList<Character> blankChar = hangmanGame.blankWord(gameWord, randomWord);
		
		boolean success = false;
		
		for(int cnt=0; cnt<5; cnt++) {
			int number;
			hangmanGame.printCoverWord(gameWord);
			System.out.print(">> ");
			Character chance = scan.nextLine().charAt(0);
			if(!blankChar.contains(chance)) {
				continue;
			}
			else {
				number= blankChar.indexOf(chance);
				if(number==0) 
					gameWord.set(gameWord.indexOf('_'), chance);
				else if(number==1)	
					gameWord.set(gameWord.lastIndexOf('_'), chance);
			}
			
			if(!gameWord.contains('_')) {
				success = true;
				break;
			}
		}
		System.out.println("정답은 "+randomWord+" 입니다.");
		if(success)
			System.out.println("성공했습니다");
		else
			System.out.println("5번 실패 하였습니다.");
	}
	*/
}
