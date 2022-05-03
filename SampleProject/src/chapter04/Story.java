package chapter04;

public class Story {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title);
		System.out.println(littlePrince.author);
		littlePrince.printContent("어린왕자");
		System.out.println(loveStory.title);
		System.out.println(loveStory.author);
		loveStory.printContent("춘향이");
	}

}
