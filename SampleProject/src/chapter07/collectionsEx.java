package chapter07;

import java.util.*;

public class collectionsEx {
	//직접 작성해보는 BinarySearch 메소드
	static boolean binarySearch(LinkedList<String> my, String key){
		Collections.sort(my);
		
		int start =0; //LinkedList의 첫 번호는 무조건 0이다.
		int end =my.size()-1;
		int middle;
		boolean success = false;
		
//		String.compareTo(String) 메소드 : 대상과 일치하는지 아닌지뿐만 아니라 사전상 순서로 앞순인지 아닌지도 알려줌.  
//									A.compareTo(B)를 했을 때 A가 B보다 앞순서라면 음수, A가 B보다 뒷순서라면 양수, A와 B가 동일하다면 0이다.
//									A와 B의 아스키코드의 차이를 반환하는 것이기 때문에 ! 
		while(start<=end) {
			middle= (start+end)/2;
			if(key.compareTo(my.get(middle))==0) {
				success = true;
				return success; 
			}
			//2022년 05월 17일 과제 : 문자비교 (String의 compare 메소드 활용)
			else if(key.compareTo(my.get(middle))<0)
				end = middle -1;
			else if(key.compareTo(my.get(middle))>0)
				start = middle+1;		
		}// 이 알고리즘이 바로 분할정복 알고리즘 !!
		return success;
		
//		if(state==1) System.out.println("탐색 성공");
//		else System.out.println("탐색 실패");
	}
	
	static void printList(LinkedList<String> link) {
		Iterator<String> iterator = link.iterator();
		int i=0;
		while(iterator.hasNext()) {
			String name = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = " ->";
			}
			else {
				separator = "\n"; // \b:백스페이스 \t:tap키 등등 출력문 제어문자가 있다.
			}
			System.out.print(i+"번 "+name+separator);	
			i++;
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		printList(myList);
		Collections.sort(myList); // 이 때 정렬은 사전순이다.
		printList(myList);
		Collections.reverse(myList);
		printList(myList);
		Collections.sort(myList,Comparator.reverseOrder());
		printList(myList);
		
		// Collections.binarySearch()는 꼭 오름차순으로 정렬이 되어 있는 상태여야 성공적인 수행이 된다. 
		int index= Collections.binarySearch(myList,"아바타"); // 검색한 컨텐츠가 있는 인덱스 번호를 반환함. 없는 값을 검색하면 '음수'을 반환
		System.out.println(myList.get(index)+"는 " +index+"번 인덱스에 있다.");
		index= Collections.binarySearch(myList,"어벤져스");
		System.out.println("List에 없는 값을 검색하면 " +index+"이 출력된다.");
		
		boolean success= binarySearch(myList,"아바타"); // 검색한 컨텐츠가 있는 인덱스 번호를 반환함. 없는 값을 검색하면 '음수'을 반환
		if(success)
			System.out.println("탐색 성공");
		else
			System.out.println("탐색 실패");
		success= binarySearch(myList,"어벤져스");
		if(success)
			System.out.println("탐색 성공");
		else
			System.out.println("탐색 실패");
	
		
//	//컬렉션을  출력하는 방식의 종류
//		//1-단순 for문
//		for(int i=0; i<myList.size(); i++) {
//			System.out.println(i+"번 : "+myList.get(i));
//		}
//		//2- for-each문
//		for(String movie : myList) {
//			System.out.println(movie);
//		}
//		//3- iterator이용
//		Iterator<String> it =  myList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		//4- Collections 사용 (메소드들이 모두 static으로 구성)
//		Collections.sort(myList);
//		for(int i=0; i<myList.size(); i++) {
//			System.out.println(i+"번 : "+myList.get(i));
//		}
		
	}
}
