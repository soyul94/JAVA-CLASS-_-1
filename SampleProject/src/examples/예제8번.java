package examples;

class PositivePoint extends Point{
	PositivePoint(){
		super(0 ,0);
	}
	PositivePoint(int x, int y){
		super(x , y);
		 if(x<0 || y<0) {
	         super.move(0,0);
	      }
	   }
	@Override
	protected void move(int x, int y) {
	      if(x>0 && y>0) {
	         super.move(x, y);
	      }
	   }
	@Override
	public String toString() {
		return  "("+ getX()+ ", "+ getY()+")의 점 입니다.";
	}	
}


public class 예제8번 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
	}

}
