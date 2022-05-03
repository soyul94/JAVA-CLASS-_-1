package chapter04;

public class Person {
	//속성
	private String name;
	public int sex;
	public int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	//생성자
	Person(){
		System.out.println("Person()생성자 호출");
	}
	Person(String name){
		this();
		this.name = name; 
	}
	Person(String name, int age){
		this("");
		this.age = age;
	}
	//행위
	int eat(int rice, int side){return rice+side;}
	int eat(int rice){return rice;}
	void eat() {System.out.println("뭘 좀 먹어봐!");}
	//main 행위
	public static void main(String[] args) {
		Person student1 = new Person("엄남경");
		Person student2 = new Person("엄남경", 20);
		System.out.println(student2.name + ", " + student2.age);
	}
}
