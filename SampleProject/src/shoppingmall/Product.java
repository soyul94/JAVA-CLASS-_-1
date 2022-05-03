package shoppingmall;

public abstract class Product {
	String pname;	//상품이름
	int price;		//상품가격
	
	Product(String pname, int price){
		this.pname = pname;
		this.price = price;
	}
	
	void printDetail() {
		System.out.println("상품명 : " + pname);
		System.out.println("상품가격 : " + price);
		printExtra();
	}
	
	abstract void printExtra();
}
