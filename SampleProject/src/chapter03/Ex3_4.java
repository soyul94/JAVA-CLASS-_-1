package chapter03;
//중첩반복
public class Ex3_4 {

	public static void main(String[] args) {
		/* 
		 *****   1) row, col
		 *****   2)
		 *****   3) 
		 *****   4)
		 *****   5)
		 */
		for(int row=1; row<=5; row++)
		{
			for(int col = 1; col <= 5; col++)
				System.out.print("*");
			
			System.out.println("");
		}
		/* 
		 *   
		 **   
		 *** 
		 ****
		 ***** 
		 */
		for(int row=1; row<=5; row++)
		{
			for(int col = 1; col <= row; col++)
				System.out.print("*");
			
			System.out.println("");
		}

		for(int row=1; row<=5; row++)
		{
			for(int col = 1; col <= 6-row; col++)
				System.out.print("*");
			
			System.out.println("");
		}
		//구구단 프로그램
		for(int row=2; row<=9; row++)
		{
			for(int col = 1; col <= 9; col++)
				System.out.println(row + " X " + col + " = " + row*col);
			
			System.out.println("");
		}
		
	}

}
