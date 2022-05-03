package examples;


class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getters&setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	// getters&setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// toString
	@Override
	public String toString() {
		return getColor() + "색의 , (" + getX() + "," + getY() + ")의 점";
	}
}

	
	public class ColorPoint23 {
		public static void main(String[] args) {
			ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
			cp.setXY(10, 20);
			cp.setColor("RED");
			String str = cp.toString();
			System.out.println(str + "입니다");
}
	}
