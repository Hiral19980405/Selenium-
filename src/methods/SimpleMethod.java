package methods;

public class SimpleMethod {

	public static void main(String[] args) {

		System.out.println("This is Main Method");
		sayHi();//sayHi();sayHi();sayHi();sayHi();
	}
	
	public static void sayHi()
	{
		
		System.out.println("Say Hi");
		sayHello();
	}

	
	public static void sayHello()
	{
		
		System.out.println("Say Hello");
	}
}
