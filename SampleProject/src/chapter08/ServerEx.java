package chapter08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	//클라이언트와 1대1 매칭될 서버
	public static void main(String[] args) {
		BufferedReader reader= null;
		BufferedWriter writer= null;
		ServerSocket ss= null;
		Socket s= null;
		Scanner scan= new Scanner(System.in);
		
		try {
			ss= new ServerSocket(5159);	//서버소켓 준비
			System.out.println("연결을 기다리고 있습니다...");
			s= ss.accept();				//소켓 연결
			System.out.println("연결되었습니다.");
			reader= new BufferedReader(new InputStreamReader(s.getInputStream()));
			writer= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				String inputMessage= reader.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트: "+inputMessage);
				System.out.print("보내기 >> ");
				String outputMessage= scan.nextLine();
				writer.write(outputMessage+"\n");	//키보드에서 입력받은 문자열 전송
				writer.flush();						//writer에 남은 모든 문자열을 전송
			}
		}
		catch(IOException e) {e.printStackTrace();}
		finally {
			try {
				scan.close();
				s.close();
				reader.close();
				writer.close();
			}
			catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}
		
	}
}
//well known port : 0~1023범위로 포트번호로 사용하면 안되는 번호. -> 자바의 예약어로 변수명을 만들 수 없는 것과 같은 맥락