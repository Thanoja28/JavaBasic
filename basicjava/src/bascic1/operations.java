package bascic1;

public class operations {
	
	public int sum(int a, int b) {
		int c;
		c = a+b;
		System.out.println("Sum of a and b is " + c);
		return c;
		
	}
	
	public int sub(int x, int y) {
		int z;
		z = x - y;
		System.out.println("sub of x and y is " + z);
		return z;
	}
	
	public void multiply(int x1, int x2) {
		int result;
		result = x1 * x2;
		System.out.println("final result is "+ result);
		
	}
	
	public static void main(String[] args) {
		operations obj = new operations();
		int sumresult = obj.sum(10, 4);
		int subresult = obj.sub(10, 4);
		obj.multiply(sumresult, subresult);
		
	}
	
}
