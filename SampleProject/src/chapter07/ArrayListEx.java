package chapter07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//1.객체선언
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		//2.이름을 입력받아 ArrayList에 add한다.
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력해주세요 >>  ");
			list.add(scan.nextLine());
		}
		
		
		//3.Arraylist에 입력된 이름을 출력한다.
		//3-1. for문 이용
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+"  ");
		System.out.println();	
		
		//3-2. Iterator를 활용
		Iterator<String> it= list.iterator();
		while(it.hasNext())
			System.out.print(it.next()+"  ");
		System.out.println();	
		
		//3-3. for-each문을 활용
		for(String name : list)
			System.out.print(name+"  ");
		System.out.println();
		
		
		//4.ArrayList에 입력된 이름 중 가장 긴 이름을 찾아 출력한다.
		//4-1. 인덱스를 찾기
		int maxIndex=0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() > list.get(maxIndex).length())
				maxIndex= i;
		}
		System.out.println("가장 긴 이름은 >> "+list.get(maxIndex));	
		
		//4-2. string으로 찾기
		String maxName = "";
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() > maxName.length())
				maxName=list.get(i);
		}
		System.out.println("가장 긴 이름은 >> "+maxName);
			
		scan.close();
	}

}
