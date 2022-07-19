package exercise;

import java.util.Scanner;

public class Ch03_Practice06 {
	
	public static void main(String[] args) {
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >> ");
		int num= scan.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			if((num/unit[i])!=0) {
				System.out.print(unit[i]+"원 짜리 : "+(num/unit[i])+"개");
				System.out.println();
			}
			num %= unit[i];
		}
		scan.close();
	}
}
