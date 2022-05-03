package chapter04;
import java.util.Scanner;

// Grade 클래스를 작성해보자. 
// 수학, 과학, 영어 3개 과목을 입력받아 Grade 객체를 생성하고 평균을 출력하는
// main()의 실행예시는 다음과 같다 

public class Grade {
	//속성
	int math;
	int science;
	int eng;
	//생성자
	Grade() {}
	Grade(int math, int science, int eng){
		this.math = math;
        this.science = science;
        this.eng = eng;
	}
	//average 메소드
	public double average() 
	{return (double)(this.math + this.science + this.eng)/3;}
	//main 메소드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 점수를 순서대로 입력 >> ");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int eng = scan.nextInt();
		Grade me = new Grade(math, science, eng);
		System.out.println("평균은 " + me.average());			
		scan.close();
	}
}