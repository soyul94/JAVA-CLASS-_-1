package chapter04;

//getters and setters
//java beans
public class Person2 {
	
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	public Person2(String name, int sex) {
		this.name = name;
		this.sex = sex;
	}
	public Person2(String name) {
		this.name = name;
	}
	public Person2(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	private String name;
	private int sex;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
