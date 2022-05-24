package chapter08;

import java.io.*;

public class BinaryCopyEx8_10 {

	public static void main(String[] args) {
		File src= new File("D:\\JAVACLASS\\fileTest\\tiger.jpg");
		File dst = new File("D:\\JAVACLASS\\streamTest\\tigerCopy.jpg");
		//FileInputStream fr = null;
		//FileOutputStream fw= null;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dst);
			int c;
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
