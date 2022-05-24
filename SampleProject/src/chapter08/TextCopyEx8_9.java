package chapter08;

import java.io.*;

public class TextCopyEx8_9 {

	public static void main(String[] args) {
		//File src =‪new File("c:\\windows\\system.ini");
		File src = new File("c:\\windows\\system.ini");
		File dst =new File("D:\\JAVACLASS\\fileTest\\system.txt");
		FileReader fr= null;
		FileWriter fw= null;
		
		int c;
		try {
			fr= new FileReader(src);
			fw= new FileWriter(dst);
			
			while((c=fr.read())!=-1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}