package chapter08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		//사용자가 키보드로 입력한 값이 들어간 in 버퍼의 내용을 읽어들ㄹ일 reader
		BufferedReader reader =null;
		//사용자가 입력한 값을 파일에 출력할 writer
		BufferedWriter writer =null;
		Scanner scan = new Scanner(System.in);
		System.out.println("메모장 프로그램 ver.1");
		System.out.print("저장할 파일명 >>>>");
		String fileName = scan.next();
		System.out.println("저장은 마지막 라인에 bye를 입력해주세요.");
				
		
		try {
			reader= new BufferedReader(new InputStreamReader(System.in));
			writer= new BufferedWriter(new FileWriter("d:\\JAVACLASS\\fileTest\\"+fileName));
			String msg;
			while(!(msg=reader.readLine()).equals("bye")) {
				writer.write(msg+"\r\n");
			
			}
			
			reader.close();
			writer.close();
			scan.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			}
	
	}

}
