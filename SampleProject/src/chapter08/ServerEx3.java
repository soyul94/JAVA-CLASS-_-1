package chapter08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ServerEx3 {
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
				String outputMessage= null;
				if(inputMessage.equalsIgnoreCase("bye")) { //클라이언트의 입력이 bye이면 while문 종료
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트: "+inputMessage);
				
				boolean cal= false;	//계산 성공 여부
				String[] mark =new String[4]; //사칙연산 기호를 담은 string배열
				mark[0]="+"; mark[1]="-"; mark[2]="*"; mark[3]="/";
				Double result=null; //계산 결과값
				
				for(int i=0; i<mark.length; i++) {
					if(inputMessage.contains(mark[i])) {
						//계산식에 포함된 연산기호로 문자열 분할
						StringTokenizer st = new StringTokenizer(inputMessage,mark[i]);
						double num_1=Double.parseDouble(st.nextToken().trim());
						double num_2=Double.parseDouble(st.nextToken().trim());
						
						cal=true;
						switch(mark[i]) {
							case "+": result= num_1 + num_2; break;
							case "-": result= num_1 - num_2; break;
							case "*": result= num_1 * num_2; break;
							case "/": if(num_2==0.0) cal=false; 
									  else result= num_1 / num_2;
									  break;
						}
					}
				}
				//outputMessage에 연산결과 대입 
				if(cal) {
					outputMessage= result.toString();
				}
				else {
					outputMessage= "잘못된 입력입니다.";
				}
				
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