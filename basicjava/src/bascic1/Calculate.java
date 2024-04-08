package bascic1;

public class Calculate {
	public int sum(int b, int c ) {
		int d;
		d = b + c;
		System.out.println("Addition is " + d);
		return d;
	}
	
public int sub(int b1, int c1) {
	int d1;
	d1 = b1 - c1;
	System.out.println("Subtraction is " + d1);
	return d1;
	
}
public int multiply(int b2, int c2) {
	int d2;
	d2 = b2 * c2;
	System.out.println("multiplication is " + d2);
	return d2;
}

public void divide(int b3, int c3) {
	int d3;
	d3 = b3/c3;
	System.out.println("Division is " + d3);
	
}

public static void main(String[] args) {
	Calculate bcd = new Calculate();
	int addResult = bcd.sum(10, 2);
	int addResult1 = bcd.sum(addResult, 2);
	int subResult = bcd.sub(addResult1, 2);
	int multiResult = bcd.multiply(subResult, 2);
	bcd.divide(multiResult, 2);
	
}

}
