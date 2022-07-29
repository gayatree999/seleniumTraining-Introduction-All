package gayatri;

import java.util.ArrayList;

public class JavaArrayList {

	// arraylist can accept duplicate values
	// Arraylist, LinkedList and Vector implementing the same interface List
	// interface
	// array have fixed size whereas, arraylist can grow dynamically
	// you can access and insert value in any index

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("gayatri");
		a.add("java");
		a.add("list");
		System.out.println(a);
		a.add(0, "first");
		System.out.println(a);
		// a.remove(2);
		a.remove("first");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("list"));
		// testing
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("gayatri"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
