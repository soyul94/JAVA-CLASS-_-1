package chapter02;
import java.util.Scanner;
public class Ex2_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해주세요: ");
		int score = scan.nextInt();
		if (score >= 80) System.out.println("합격입니다.");
		scan.close();
	}
}
