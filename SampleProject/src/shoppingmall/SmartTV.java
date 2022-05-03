package shoppingmall;

public class SmartTV extends Product{
	String resolution;
	
	SmartTV(String pname, int price, String resolution){
		super(pname,price);
		this.resolution = resolution;
	}
	
	@Override
	void printExtra() {
		System.out.println("해상도 : " + resolution);
	}
}
