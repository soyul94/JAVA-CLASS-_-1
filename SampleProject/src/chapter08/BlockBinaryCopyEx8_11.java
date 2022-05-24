package chapter08;

import java.io.*;

public class BlockBinaryCopyEx8_11 {

	public static void main(String[] args) {
		File src= new File("D:\\JAVACLASS\\fileTest\\tiger.jpg");
		File dst = new File("D:\\JAVACLASS\\streamTest\\tigerCopy.jpg");
		FileInputStream fr = null;
		FileOutputStream fw= null;
		byte[] buf = new byte[1024*10];
		
		try {
			fr = new FileInputStream(src);
			fw = new FileOutputStream(dst);
			int c;
			while(true) {
				c=fr.read(buf);
				fw.write(buf,0,c);
				if(c<buf.length)
					break;
			}
			fr.close();
			fw.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
