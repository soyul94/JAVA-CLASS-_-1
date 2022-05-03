package examples;

class Point_Ex07 {
	private int x, y;
	
	public Point_Ex07() {
		this.x = 0;
		this.y = 0;
	}

	public Point_Ex07(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getXY() {
		return "(" + x + "," + y + ",";
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class Point3D_Ex07 extends Point_Ex07 {
	private int z;
	
	public Point3D_Ex07() {
		this.z = 0;
	}
	
	public Point3D_Ex07(int x, int y) {
		super(x, y);
	}
	
	public Point3D_Ex07(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public String getZ() {
		return z + ")의 점";
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void moveUp() {
		z++;
		}
		
	public void moveDown() {
		z--;
		}
	
	public void move(int x, int y) {
		setXY(x,y);
	}
	
	public void move(int x, int y, int z) {
		setXY(x,y);
		setZ(z);
	}

	@Override
	public String toString() {
		return getXY() + getZ();
	}
	
}

public class Ex07 {

	public static void main(String[] args) {
		Point3D_Ex07 p = new Point3D_Ex07(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "입니다.");
	}

}
