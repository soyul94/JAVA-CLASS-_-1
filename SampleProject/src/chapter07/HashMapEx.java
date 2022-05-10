package chapter07;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("apple", "사과");
		hm.put("peach", "복숭아");
		hm.put("watermelon", "수박");
		
//		for(int i=0; i<hm.size(); i++) {
//			System.out.println(hm.get);
//		}
		System.out.println(hm.get("apple"));

	}

}
