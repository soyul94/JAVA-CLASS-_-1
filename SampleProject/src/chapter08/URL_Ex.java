package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL_Ex {

	public static void main(String[] args) {
		try {
			//입력한 주소가 될 수도 안될 수도 있는 불확실한 것이기 때문에 try-catch문을 사용하지 않으면 에러가 난다.
			URL url = new URL("https://www.icqa.or.kr/cn/page/network");
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("호스트 : "+url.getHost());
			System.out.println("포트 : "+url.getPort());
			
			System.out.println("<< HTML 전송 시작 >>");
			InputStream is= url.openStream();//url의 정보를 가져올 통로(1byte로 가져옴)
									// 1바이트로 가져오는 것을 2바이트로 바꾸어 버퍼(라인)단위로 읽어올 수 있도록
			BufferedReader reader= new BufferedReader(new InputStreamReader(is));
			String msg;
			
			while((msg=reader.readLine())!=null) {
				System.out.println(msg);
			}
			
			is.close();
			reader.close();
			
		}catch(IOException e) {e.printStackTrace();}
		
	}

}
