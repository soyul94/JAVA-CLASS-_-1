package chapter08;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*

public class FileReaderEx {

	public static void main(String[] args) {
		//FileReader fin= null; // try 안에 쓰면 try 밖에서는 쓸 수 없기 때문에 미리 선언해줌.
		FileInputStream fin= null; // try 안에 쓰면 try 밖에서는 쓸 수 없기 때문에 미리 선언해줌.	
		InputStreamReader in= null;
		try {
			fin= new FileInputStream("D:\\JAVACLASS\\streamTest\\test_2.txt");
			in= new InputStreamReader(fin,"MS949"); //"MS949"인코딩 방식은 ANSI파일에서 한글을 가져올 수 있는 인코딩
			int c;									//"UTF-8"인코딩 : UTF-8파일에서 한글을 가져올 수 있음 
			while((c=in.read()) != -1)
				System.out.print((char)c);
			fin.close();
			in.close();
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("찾는 파일이 없슈");
		}
	}

}
