package chapter08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


//sample.csv 에서 읽어들인 데이터에서 남자의 체중의 평균을 구하라. 해당 평균은 sample3.txt에 저장하라
public class Ex08_13 {
	public static void main(String[] args) {
		BufferedReader reader =null;
		FileWriter fout =null;
		StringTokenizer st;	
		ArrayList<Person> person = new ArrayList<Person>();
		
		try {
			//csv파일에서 
			reader= new BufferedReader(new FileReader("d:\\JAVACLASS\\fileTest\\sample.csv"));
			reader.readLine();//표의 헤더는 쓸모가 없기 때문에 그냥 날려버리는 것
			String msg;
			while((msg=reader.readLine())!=null) { //reder가 문서의 맨 아랫줄을 만나면 null이 들어감
				st = new StringTokenizer(msg, ",");
				System.out.println(msg);
				while(st.hasMoreTokens()) {
					Person p = new Person();
					p.setName(st.nextToken().trim());
					p.setGender(st.nextToken().trim());
					p.setWeight(Integer.parseInt(st.nextToken().trim()));
					p.setHeight(Integer.parseInt(st.nextToken().trim()));
					person.add(p) ;
				}
			}
			
			//남자의 평균 구하기
			int sum=0; int num=0;
			for(Person p:person) {
				//System.out.println(p.toString());
				if(p.getGender().equals("남")) {
					sum+=p.getWeight();
					num++;
				}
			}
			double avg = (double)sum/num;
			System.out.println("남자 평균몸무게는 "+avg);
			
			//txt파일에 결과 기록하기
			fout = new FileWriter("D:\\JAVACLASS\\streamTest\\sample_result.txt");
			String line ="남자 평균몸무게는 "+avg;
			fout.write(line, 0, line.length());
			fout.write("\r\n",0,2); // \r과 \n은 각각 1바이트이다.
			
			reader.close();
			fout.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}		
	}
}

class Person{
	private String name ;
	private String gender;
	private int weight;
	private int height;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
