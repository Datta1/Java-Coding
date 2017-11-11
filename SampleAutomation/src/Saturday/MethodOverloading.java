package Saturday;

public class MethodOverloading {

	public int add(int a, int b) {  // method1
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(int a,double b) {
		return a+b;
		
	}
	
	public double add(double a,int b) {
		return a+b;
		
		
	}
	
	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		System.out.println(MO.add(1, 2));
		System.out.println(MO.add(1, 2, 3));
		System.out.println(MO.add(1, 2.3));
		System.out.println(MO.add(2.5, 8));
	}
	
		
	}

	


