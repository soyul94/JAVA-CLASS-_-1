package chapter06;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ILOVEYOU");
		
		System.out.println(sb1);
		System.out.println(sb1.delete(1, 5)); //IYOU
		System.out.println(sb1); //함수를 수행하면 본문자열이 변함
		System.out.println(sb1.reverse());
		System.out.println(sb1.reverse());
		System.out.println(sb1.insert(1, "LOVE"));
	}

}
