package chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

//이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고, 장학생 선발 기준을 입력 받아 장학생 명단을 출력하라.
public class Chap07_Practice07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("미래장학금관리시스템입니다.");
		
		HashMap<String, Double> studentList = new HashMap<String, Double>();
		for(int i=0; i<5; i++) {	
			System.out.print("이름과 학점 >> ");
			StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
			String name= st.nextToken().trim();
			Double score= Double.parseDouble(st.nextToken().trim());
			studentList.put(name,score);
		}
		System.out.println();
		
		Set<String> keys = studentList.keySet();
		Iterator<String> it =  keys.iterator();
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		Double score = scan.nextDouble(); scan.nextLine();
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String key=it.next();
			Double value = studentList.get(key);
			if(value >= score)
			System.out.print(key +" ");
		}
		
//		it =  keys.iterator();
//		while(it.hasNext()) {
//			String key=it.next();
//			Double value = studentList.get(key);
//			System.out.println(key + value);
//		}
		scan.close();
	}
}
