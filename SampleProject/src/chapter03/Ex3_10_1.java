package chapter03;

public class Ex3_10_1 {

	public static void main(String[] args) {		
		double sum = 0.0;
		double score[][] = { //score 초기화
				{3.3, 4.0},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};		
		
		for(double[] grade : score) 
			for(double semester : grade) sum += semester;
		
		int grade_cnt = score.length;
		int semester_cnt = score[0].length;
		System.out.println("4년 전체 평점 평균은 " + sum/(grade_cnt * semester_cnt));
	}
}