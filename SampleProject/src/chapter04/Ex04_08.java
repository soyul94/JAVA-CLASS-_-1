package chapter04;

public class Ex04_08 {

	//replaceSpace : char배열을 받아 공백을 콤마로 교체하는 메소드
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ') a[i] = ',';
	}
	//printCharArray : char배열을 받아 배열안에 문자들을 화면에 출력하는 메소드
	static void printCharArray(char a[]){
		//for(int i=0; i<a.length; i++)
		//	System.out.println(a[i]);
		for(char c : a) System.out.print(c);
		System.out.println();
	}
	
	public static void main(String[] args) {
		 char a[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U', '.'};
		 printCharArray(a);
		 replaceSpace(a);
		 printCharArray(a);
	}
}
