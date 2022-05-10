package chapter06;

import java.util.Calendar;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] lotto = new int[7];
		Calendar now = Calendar.getInstance();

// 내가 맹근 중복 제거 방식
//		for(int i=0; i<7; i++) {
//			Boolean s = false;
//			int num = (int) (Math.random()*45+1);
//			if (i>0) {
//				for (int n = 0; n < i; n++) {
//					if (lotto[n] == num) {
//						s = true;
//						break;
//					}
//				} 
//			}
//			if(s)continue;
//			else lotto[i]=num;
//		}	
		
// 일반적인 중복 제거 방식	
//		for(int i=0; i<7; i++) {
//			lotto[i] = (int) (Math.random()*45+1);
//			for (int n = 0; n < i; n++) {
//				if (lotto[i] == lotto[n]) 
//				i--;	
//			} 
//		}
		
// random 클래스 이용해서 만들어보기 
		for(int i=0; i<7; i++) {
			lotto[i] = rd.nextInt(1, 45); // 왜 되는거딩..?
			for (int n = 0; n < i; n++) {
				if (lotto[i] == lotto[n]) 
				i--;	
			} 
		}
		
		
		for(int a:lotto)
			System.out.print(a+"  ");
		System.out.println();
		
		System.out.println("Calendar.DAY_OF_MONTH : "+Calendar.DAY_OF_MONTH);
		System.out.println("Calendar.YEAR : "+Calendar.YEAR);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		
		now.set(2020,12,20);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
	}

}
