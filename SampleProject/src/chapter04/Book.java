package chapter04;

public class Book {
	//필드
	String title;	
	String author;

	//생성자 오버로딩
	public Book() {}
	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printContent(String title) {
		System.out.println("옛날옛날에 " + title + "가/이 살았습니다.");
	} 
}
