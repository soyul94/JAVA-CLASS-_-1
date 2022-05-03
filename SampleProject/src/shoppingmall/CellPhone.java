package shoppingmall;

public class CellPhone extends Product {
	String carrier;
	//생성자
	CellPhone(String pname, int price, String carrier){
		super(pname,price);
		this.carrier = carrier;
	}
	
	@Override
	void printExtra() {
		System.out.println("통신사 : " + carrier);
	}	
}
