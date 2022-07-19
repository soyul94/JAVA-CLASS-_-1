package chapter13;

public class MainThreadEx {

	public static void main(String[] args) {
		System.out.println("ID : "+ Thread.currentThread().getId());
		System.out.println("NAME : "+ Thread.currentThread().getName());
		System.out.println("Priority : "+ Thread.currentThread().getPriority());
		System.out.println("State : "+ Thread.currentThread().getState());
	}

}
