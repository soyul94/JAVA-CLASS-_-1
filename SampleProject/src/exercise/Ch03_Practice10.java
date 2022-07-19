package exercise;

public class Ch03_Practice10 {

	public static void main(String[] args) {
		int[][] num= new int[4][4];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = 0;
			}
		}
		
		int count=0;
		while(count<6) {
			int i=(int)(Math.random()*4);
			int j=(int)(Math.random()*4);
			if(num[i][j]==0) {
				num[i][j]=(int)(Math.random()*10)+1;
				count++;
			}
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%5d",num[i][j]);
			}
			System.out.println();
		}
		
	}

}
