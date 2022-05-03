package chapter03;

public class Ex3_9 {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	
	public static void main(String[] args) {
		for(Week w : Week.values())	
			System.out.println(w + "요일");
		
		String fruits[] = {"한라봉", "딸기", "사과"};
		for(String f : fruits)
			System.out.println(f);
	}
}
