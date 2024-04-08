package bascic1;

public class Alpha1 {
	int a, b, c, d, e;
	
	public void Solution(int x1, int x2, int x3, int x4, int x5) {
		a = x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
		
	}
	
	public static void main(String[] args) {
		Alpha1 sol = new Alpha1();
		sol.Solution(2, 4, 6, 8, 10);
		
		System.out.println(sol.a);
		System.out.println(sol.b);
		System.out.println(sol.c);
		System.out.println(sol.d);
		System.out.println(sol.e);
		
	}

}
