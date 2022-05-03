package chapter03;

public class Selection_Sort {

	static final int IU_NUM = 8;
	
	public static void main(String[] args) {
		int iu[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		//정렬전 출력
		System.out.println("IU 정렬 전 : " );
		for(int n : iu) System.out.printf("%5d", n);
		System.out.println();
		
		//3.끝까지 반복하기 
		for(int x = 0; x < IU_NUM; x++) {
			//1. 최소값 찾기
			int min_index = x;
			for (int i = x+1; i < IU_NUM; i++) 
				if(iu[min_index] > iu[i])
					min_index = i;					
			//2. 교환 하기 
			int temp = iu[min_index];
			iu[min_index] = iu[x];
			iu[x] = temp;
		}
		
		//정렬후 출력
		System.out.println("IU 정렬 후 : " );
		for(int n : iu) System.out.printf("%5d", n);
		System.out.println();	
		
		System.out.println("IU는 " + iu.length + "명 있습니다.");
	}
}
