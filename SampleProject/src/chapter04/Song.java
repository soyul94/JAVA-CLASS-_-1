package chapter04;

import java.util.Scanner;

//노래 한곡을 위한 Song 클래스를 작성하라. 
public class Song {
	//속성
	String title; 	//노래 제목을 나타내는 title
	String artist;	//가수를 나타내는 artist
	int year;		//노래가 발표된 연도를 나타내는 year
	String country;	//국적을 나타내는 country
	
	//생성자 2개
	Song(){}		//기본생성자
	//모든필드를 초기화하는 생성자
	public Song(String title, String artist, int year, String country) 
	{
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}	
	//노래정보를 출력하는 show 메소드
	void show()
	{	
		System.out.print(this.year + ", ");
		System.out.print(this.country + ", ");
		System.out.print(this.artist + ", ");
		System.out.println(this.title);
	}
	public static void main(String[] args) {
		Song song[] = new Song[3];
		Scanner scan = new Scanner(System.in);
		//사용자에게 title, artist, year, country를 입력받아서 
		//Song를 3개 초기화 시킨다. 
		for(int i = 0; i<song.length; i++) {
			System.out.print("타이틀, 가수, 년도, 국가 순 입력 >>> ");
			String title = scan.next();
			String artist = scan.next();
			int year = scan.nextInt(); 
			String country = scan.next();
			song[i] = new Song(title, artist, year, country);
		}		
		for(Song s : song) s.show();
	}
}