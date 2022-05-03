package chapter05;

class TV{
	//1.속성정의
	private int size;
	//2.메소드정의 (생성자, getters&setters, toString)
	public TV() {}
	public TV(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "TV [size=" + size + ", getSize()=" + getSize() + "]";
	}
}
class ColorTV extends TV{
	//1. 속성정의
	private int color;
	//2. 메소드정의 
	public ColorTV() {}
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	//3. todo : Property 추가	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
	
}

//todo : IPTV를 2번 문항에 맞춰 추가
class IPTV extends ColorTV{
	private String ip;
	public IPTV() {}
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "IPTV [ip=" + ip + ", getIp()=" + getIp() + "]";
	}
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + "주소의 ");
		System.out.println(getSize() + "인치 " + getColor() + "컬러");
	}
}

public class TV_Ex {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
