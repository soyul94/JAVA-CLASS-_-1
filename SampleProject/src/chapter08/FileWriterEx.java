package chapter08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fout;
		int c;
		try {
			fout = new FileWriter("D:\\JAVACLASS\\streamTest\\write_test.txt");
			while(true) {
				String line = scan.nextLine();
				if(line.length()==0) break;
				fout.write(line, 0, line.length());
				fout.write("\r\n",0,2); // \r과 \n은 각각 1바이트이다.
			}
			fout.close();
			scan.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("만든 파일이 없슈");
		}
	}

}
