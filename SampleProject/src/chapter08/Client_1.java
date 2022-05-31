package chapter08;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_1 {

	public static void main(String[] args) {
		try {
			Socket s= new Socket("172.16.144.12", 5000);
			System.out.println("#클라이언트 실행 ...");
			PrintWriter pw= new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("안녕하세요. 클라이언트에서 전송하는 메시지 입니다.");
			
			pw.close();
			s.close();
			System.out.println("#클라이언트 종료 ...");
			
		}catch(IOException e) {e.printStackTrace();}
		
	}

}
