package bascic1;

public class Keyword {
	public Keyword() {
		System.out.println("Default constructor");
		
	}
	public Keyword(int a) {
		this(22, 24);
		System.out.println("One parameterized constructor");
		
	}
	public Keyword(int a, int b) {
		this();
		System.out.println("Two parameterized constructor");
	}
	
	public static void main(String[] args) {
		Keyword obj = new Keyword(22);
		
	}
	
	
	
}
