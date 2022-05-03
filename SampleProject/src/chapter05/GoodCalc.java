package chapter05;

abstract class Calculator{
	abstract int add(int a, int b);
	abstract int subtract(int a, int b);
	abstract double average(int a[]);	
}

public class GoodCalc extends Calculator{
	@Override	
	int add(int a, int b){return a+b;};
	@Override
	int subtract(int a, int b){return a-b;};
	@Override
	double average(int a[])	//평균
	{
		int sum = 0;
		for(int n : a) sum += n;
		return (double)sum/a.length;
	};
	
	public static void main(String[] args) {
		GoodCalc gc = new GoodCalc();
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("add 값 : " + gc.add(10, 20));
		System.out.println("subtract 값 : " + gc.subtract(10, 20));
		System.out.println("subtract 값 : " + gc.average(a));
	}
}




