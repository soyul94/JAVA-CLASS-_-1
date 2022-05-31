package chapter08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader reader= null;
		BufferedWriter writer= null;
		Socket s= null;
		Scanner scan= new Scanner(System.in);
		
		try {
			s= new Socket("localhost",5159);	//"localhost"= "172.16.144.12", "127.0.0.1"
			reader= new BufferedReader(new InputStreamReader(s.getInputStream()));
			writer= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			while(true) {
				System.out.print("보내기 >> ");
				String outMessage= scan.nextLine();
				if(outMessage.equalsIgnoreCase("bye")) {
					writer.write(outMessage+"\n");
					writer.flush();
					break;
				}
				writer.write(outMessage+"\n");
				writer.flush();
				String inMessage= reader.readLine();
				System.out.println("서버 : "+inMessage);
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
				e.printStackTrace();
			}
		}
		
	}

}
