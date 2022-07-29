package gayatri;

public class learnMethods {

	public static void main(String[] args) {
		learnMethods d = new learnMethods();
		d.getData1();

		String name = d.getData2();
		System.out.println(name);
		
		getData3();
		
		toCallthemethodinAnotherClass d1 = new toCallthemethodinAnotherClass();
		d1.getUserData();
	}
	
	
	public void getData1()
	{
		System.out.println("Calling a method gayatri");
	}
	
	public String getData2()
	{
		System.out.println("2nd- Calling a method gayatri");
		return "2nd method return statement";
	}
	public static String getData3()
	{
		System.out.println("3rd method");
		return "3rd method return statement";
	}

}
