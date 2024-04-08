package bascic1;

public class Student {
	int rollNo;
	int age;
	
	public static void main(String[] args) {
		Student abc = new Student();
		abc.age = 22;
		System.out.println("age = " + abc.age);
		abc.display1();
		abc.display2();
	}

	
public void display1() {
	System.out.println("Welcome all of you");
}

public void display2() {
	System.out.println("Automation is very easy");
}


}
