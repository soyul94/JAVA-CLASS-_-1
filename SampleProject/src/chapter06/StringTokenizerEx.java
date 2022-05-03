package chapter06;

import java.util.StringTokenizer;
class Person{
	String name ;
	String gender;
	int weight;
	int height;
	
	public Person(){}
	public Person(String name, String gender, int weight, int height) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", weight=" + weight + ", height=" + height + "]";
	}
	
}



public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String query = "김명수, 남, 77, 167 / 홍길동, 남, 65, 170 / 김새영, 여, 57, 164 / 이장군, 남, 77, 167 / 홍미영, 여, 64, 165";
		StringTokenizer st = new StringTokenizer(query, "/");

		Person[] person = new Person[st.countTokens()];
		String name ;
		String gender;
		int weight;
		int height;
		
		int cnt =0;
		while(st.hasMoreTokens()) {
			StringTokenizer st_2 = new StringTokenizer(st.nextToken(),",");
			while(st_2.hasMoreTokens()) {
				name= st_2.nextToken().trim();
				gender= st_2.nextToken().trim();
				weight= Integer.parseInt(st_2.nextToken().trim());
				height= Integer.parseInt(st_2.nextToken().trim());
				person[cnt] = new Person(name,gender,weight,height);
				
				System.out.println(person[cnt].toString());
			}
			cnt++;
		}
		
		int sum = 0;
		int num = 0;
		for(int i=0; i<person.length; i++) {
			if(person[i].gender.equals("남")) {
				sum+=person[i].weight;
				num++;
			}
		}
		System.out.println("남자의 평균체중은 "+(sum/(double)num)+" 이다." );
		
		
		
		
		
//		String query = "김명수, 남, 77, 167";
//		//while(st.hasMoreTokens())
//		//	System.out.println(st.nextToken());
//		while(st.hasMoreTokens()) {
//			//System.out.println(st.nextToken().trim());
//			name= st.nextToken().trim();
//			gender= st.nextToken().trim();
//			weight= Integer.parseInt(st.nextToken().trim());
//			height= Integer.parseInt(st.nextToken().trim());
//			System.out.println("name = "+name+", gender = "+gender+", weight = "+weight+", height = "+height);
//		}
	}

}
