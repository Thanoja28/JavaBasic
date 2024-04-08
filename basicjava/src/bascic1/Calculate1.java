package bascic1;

public class Calculate1 {
	public int multiply(int e, int f) {
		int g;
		g = e * f;
		System.out.println("Result1 is " + g);
		return g;
	}
	public int add(int e1, int f1) {
		int g1;
		g1 = e1 + f1;
		System.out.println("Result2 is " + g1 );
		return g1;
	}
	
	public int sub(int e2, int f2) {
		int g2;
		g2 = e2 - f2;
		System.out.println("Result3 is " + g2);
		return g2;
	}
	public void divide(int e3, int f3) {
		int g3;
		g3= e3/f3;
		System.out.println("Result4 is " + g3);
		
		
	}
	
	public static void main(String[] args) {
		Calculate1 obj = new Calculate1();
		int multiResult = obj.multiply(10, 2);
		int addResult = obj.add(multiResult, 2);
		int subResult = obj.sub(addResult, 2);
		int multiResult1 = obj.multiply(subResult, 2);
		obj.divide(multiResult1, 2);
		
	}

}
