package chapter08;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx8_7 {

	public static void main(String[] args) {
		FileReader fin= null;
		BufferedOutputStream out = null;
		try {
			fin= new FileReader("D:\\JAVACLASS\\streamTest\\test_4.txt");
			out= new BufferedOutputStream(System.out, 5);
			int c;
			while((c=fin.read()) != -1) {
				out.write(c);
			}
			
			//Scanner scan = new Scanner(System.in);
			//scan.nextLine();
			new Scanner(System.in).nextLine();
			out.flush();
			
			fin.close();
			out.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
