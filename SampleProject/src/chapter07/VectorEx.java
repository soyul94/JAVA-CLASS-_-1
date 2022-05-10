package chapter07;

import java.util.Vector;
import java.util.*; // java.util 패키지 모두 import하는 것 

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //new Vector<>() 로 element를 생략 가능하다.
		Iterator<Integer> it = v.iterator();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		System.out.println(v.get(0));
//		System.out.println(v);
//		System.out.println(v.remove(0));
//		System.out.println(v);
//		v.removeAll(v);
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		v.clear();
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		v.add(4);
//		v.add(-1);
//		System.out.println(v);
		

	}

}
