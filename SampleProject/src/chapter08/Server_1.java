package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {
	//클라이언트와 1대1 매칭될 서버
	public static void main(String[] args) {
		try {
			ServerSocket ss= new ServerSocket(5000); //1.서버소켓 준비 : port번호 5000입력
			System.out.println("#서버 실행 ...");
			while(true) { // 서버를 계속 열어두기 위해 무한루프 생성
				Socket s= ss.accept(); //2.요청된 소켓 연결
				BufferedReader reader= new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("클라이언트 연결 완료 ...");
				System.out.println("클라이언트 메시지 : "+reader.readLine());
				
				reader.close();
				
			}
			
		}catch(IOException e) {e.printStackTrace();}
	}

}
//well known port : 0~1023범위로 포트번호로 사용하면 안되는 번호. -> 자바의 예약어로 변수명을 만들 수 없는 것과 같은 맥락