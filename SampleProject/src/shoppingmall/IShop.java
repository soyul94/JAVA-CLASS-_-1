package shoppingmall;

public interface IShop {
	public abstract void setTitle(String title); //쇼핑몰이름 설정
	public abstract void genUser();				//예제사용자 생성
	public abstract void getProduct();			//예제상품 생성
	public abstract void start();				//쇼핑몰시작 메서드
}
