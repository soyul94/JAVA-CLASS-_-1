package chapter03;

public class Ex3_10 {

	public static void main(String[] args) {		
		int letter_K[][] = { //K 초기화
				{1, 0, 0, 0, 1, 1},
				{1, 0, 0, 1, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{1, 0, 0, 1, 0, 0},
				{1, 0, 0, 0, 1, 1}
		};
		
		for(int[] row : letter_K) {
			for(int col : row)
				if(col == 1) 	System.out.print("■");
				else			System.out.print(" ");
			System.out.println();
		}
	}
}