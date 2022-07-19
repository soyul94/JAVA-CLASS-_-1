package exercise;

public class Ch03_Practice09 {

	public static void main(String[] args) {
		int[][] num= new int[4][4];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = (int)(Math.random()*10)+1;
//				System.out.printf("%5d",num[i][j]);
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
