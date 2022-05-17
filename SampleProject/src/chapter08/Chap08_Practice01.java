package chapter08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Chap08_Practice01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout;
		try {
			fout = new FileWriter("D:\\JAVACLASS\\streamTest\\Chap08_Practice01.txt");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = scan.nextLine();
				if(line.equals("그만")) break;
				fout.write(line, 0, line.length());
				fout.write("\r\n",0,2); // \r과 \n은 각각 1바이트이다.
			}
			System.out.println("D:\\JAVACLASS\\streamTest\\Chap08_Practice01.txt 에 저장하였습니다.");
			fout.close();
			scan.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일 만드는거 실패했슈");
		}
	}

}
