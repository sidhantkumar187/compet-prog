package basics;

class Base{
	public Base(String name) {      // This in turn would be calling constructor of its super class
		System.out.println("Base Class Instantiated");
	}
}

class Child extends Base{
	public Child(String name) {
		super(name);
		System.out.println("Child Class: "+name);
	}
}

public class ObjectOrient {

	public static void main(String[] args) {
		
		Child ch = new Child("Advik");

	}

}
