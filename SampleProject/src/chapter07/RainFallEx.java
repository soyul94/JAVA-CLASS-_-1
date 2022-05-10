package chapter07;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class RainFallEx {
	
	//Vector를 받아서 출력하는 메소드
	public static void print(Vector<Integer> v) {
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");			
		}
		System.out.println();
	}
	//Vector를 받아서 평균 정수로 변환하는 메소드
	public static int average(Vector<Integer> v) {
		int sum=0;
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			sum += it.next();
		}
		
		return sum/v.size();
	}

	public static void main(String[] args) {
		//0을 입력할 때 까지 강수량과 평균을 출력하는 시나리오
		//1. 필요한 객체를 선언
		Scanner scan = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();
		
		//2. 0을 입력할 때까지 강수량 목록(print)과 평균(average)을 출력한다.
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)  >>  ");
			int num=scan.nextInt();
			if(num==0) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				vec.add(num);
				print(vec);
				System.out.println("강수 평균 : "+average(vec));
			}
		}
		
		scan.close();
	}

}
