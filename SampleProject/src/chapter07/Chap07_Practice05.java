package chapter07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chap07_Practice05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//ArrayList 이용
//		ArrayList<Student> list = new ArrayList<Student>(4);
//		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
//		for(int i=0; i<4; i++) {
//			System.out.print(">> ");
//			StringTokenizer st = new StringTokenizer(scan.nextLine(), ",");
//		
//			String name= st.nextToken().trim();
//			String dept= st.nextToken().trim();
//			int stuNum= Integer.parseInt(st.nextToken().trim());
//			double avgScor= Double.parseDouble(st.nextToken().trim());
//			list.add(new Student(name, dept, stuNum, avgScor));
//		}
//		System.out.println();
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("--------------------------------------------");
//			list.get(i).stuPrint();
//		}
//		System.out.println("--------------------------------------------");
//		
//		while(true) {
//			System.out.print("학생 이름 >> ");
//			String name = scan.nextLine();
//			boolean su = false;
//			
//			if(name.equals("그만")){
//				System.out.println("종료합니다");	
//				break;
//			}
//			for(int i=0; i<list.size(); i++) {
//				if(name.equals(list.get(i).getName())) {
//					System.out.println(list.get(i));
//					su=true;
//					break;
//				}
//			}
//			if(!su)
//				System.out.println("존재하지 않는 학생입니다.");
//		}	
		
		//HashMap이용
		HashMap<String, Student> hm= new HashMap<String, Student>();
		String[] hmIndex = new String[4];
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			StringTokenizer st = new StringTokenizer(scan.nextLine(), ",");
			
			String name= st.nextToken().trim();
			String dept= st.nextToken().trim();
			int stuNum= Integer.parseInt(st.nextToken().trim());
			double avgScor= Double.parseDouble(st.nextToken().trim());
			
			Student temp = new Student(name, dept, stuNum, avgScor);
			hm.put(temp.getName(),temp);
			hmIndex[i]= temp.getName();
		}
		System.out.println();
		for(int i=0; i<hm.size(); i++) {
			System.out.println("--------------------------------------------");
			hm.get(hmIndex[i]).stuPrint();
		}
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scan.nextLine();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다");	
				break;
			}
			if(hm.containsKey(name))
				System.out.println(hm.get(name));
			else
				System.out.println("존재하지 않는 학생입니다.");	
		}
		
		scan.close();
	}

}

class Student{
	private String name;
	private String department;
	private int studentNumber;
	private double avgScore;
	
	public Student() {}
	public Student(String name, String department, int studentNumber, double avgScore) {
		this.name = name;
		this.department = department;
		this.studentNumber = studentNumber;
		this.avgScore = avgScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
	
	public void stuPrint() {
		System.out.println("이름 : "+this.name);
		System.out.println("학과 : "+this.department);
		System.out.println("학번 : "+this.studentNumber);
		System.out.println("학점평균 : "+this.avgScore);
	}
	@Override
	public String toString() {
		return name + ", " + department + ", " + studentNumber + ", " + avgScore ;
	}
	
}
