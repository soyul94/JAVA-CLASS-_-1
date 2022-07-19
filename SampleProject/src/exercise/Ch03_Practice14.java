package exercise;

import java.util.Scanner;

public class Ch03_Practice14 {

	public static void main(String[] args) {
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목 이름 >> ");
			String temp = scan.nextLine();
			if(temp.equals("그만"))
				break;
			
			boolean succese = false;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(temp)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					succese=true;
					break;
				}
			}

			if(!succese)
				System.out.println("없는 과목입니다.");
		}
		
		System.out.println("종료합니다.");
		scan.close();
	}

}
