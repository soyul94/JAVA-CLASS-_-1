package chapter08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Simple_HangMan {

	public static void main(String[] args) {
		//words.txt파일의 단어들을 Vector에 저장하기 
		Vector<String> wordVector = new Vector<>();
		try {
			Scanner scan = new Scanner(new FileReader("d:\\JAVACLASS\\fileTest\\words.txt"));
			while(scan.hasNext()) {
				String word = scan.nextLine();
				wordVector.add(word);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 행맨 게임 실행
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		while(true) {
			Random random = new Random();
			int number = random.nextInt(wordVector.size());
			
			String word=wordVector.get(number);
			if(word.length()<2) // 랜덤으로 뽑힌 단어가 한자리면 해당 while문을 스킵하고 다시 뽑음
				continue;
			
			System.out.println(word);
			
			break;
			
		}
	}

}
