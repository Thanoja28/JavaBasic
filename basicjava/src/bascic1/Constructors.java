package bascic1;

public class Constructors {

	
	public Constructors() {
		System.out.println("default constructor");
		
	}
	public Constructors(int a) {
		System.out.println("one parameterized constructor");
		
	}
	public Constructors(int a, int b) {
		System.out.println("two parameterized constructor");
	}
	
	public static void main(String[] args) {
		Constructors x = new Constructors(3);
		Constructors ty = new Constructors();
		Constructors zx = new Constructors(4, 6);
		
	}

}
