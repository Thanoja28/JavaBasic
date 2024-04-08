package bascic1;

public class Keyword1 {
	public Keyword1() {
		this(2, 3, 4);
		System.out.println("Default Constructor");
	}
	public Keyword1(int c) {
		this(2, 3, 4, 6);
		System.out.println("One parameterized Constructor");
	}
	public Keyword1(int c, int d) {
		this(5);
		System.out.println("Two parameterized Constructor");
		
	}
	public Keyword1(int c, int d, int e) {
		System.out.println("Three parameterized Constructor");
	}
	public Keyword1(int c, int d, int e, int f) {
		this();
		System.out.println("Four parameterized Constructor");
	}
	
	public static void main(String[] args) {
		Keyword1 cvc = new Keyword1(2, 4);
	}
}
