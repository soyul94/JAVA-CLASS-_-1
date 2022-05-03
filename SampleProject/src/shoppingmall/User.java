package shoppingmall;

public class User {
	public enum payType {CASH, CARD}
	private String name;	//사용자 이름	
	private payType paytype;//결제 타입
	User(String name, payType paytype){
		this.name = name;
		this.paytype = paytype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public payType getPaytype() {
		return paytype;
	}
	public void setPaytype(payType paytype) {
		this.paytype = paytype;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", paytype=" + paytype + "]";
	}
}
