package gayatri;

public class Constructor {
	// Constructor name is same as class name, and it doesn't have any return type
	// This is Default constructor, because it does not have any value
	public Constructor() {
		System.out.println("I am Constructor");
	}

	// Parameterized Constructor
	public Constructor(int a, int b) {
		System.out.println("Parameterized Constructor");
		System.out.println(a + b);
	}

	public Constructor(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cr = new Constructor();
		Constructor crp = new Constructor(6, 8);
		Constructor stri = new Constructor("Hello");
		// Note: if there is no constructor defined in a class then only java creates
		// one constructor implicitly,
		// but if there is any constructor defined in the class, then java will throw an
		// error when you create an object of the constructor
		// Note2: Constructor calls a block of code whenever an object is created
	}
}

