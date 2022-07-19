package exercise;

public interface CalcInterface {
	public static final int a=0, b=0; //인터페이스에는 이 속성을 가진 필드만 생성가능
	
	void setValue(int a, int b);
	int calculate();
}
