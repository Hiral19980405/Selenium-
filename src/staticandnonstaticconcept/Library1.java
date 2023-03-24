package staticandnonstaticconcept;

public class Library1 {
	
	static int quantity = 5;  //Static Global Variable
	String name = "Unicode Technologies";  //Non Static Global Variable


	public static void main(String[] args) {

		System.out.println("-------------Static Methods and Global Variables-------------");
		
		staticMethod1();
		Library1.staticMethod1();
		System.out.println(quantity);
		System.out.println(Library1.quantity);

		System.out.println("-------------Non Static Methods and Global Variables-------------");

		Library1 lib = new Library1();
		lib.nonStaticMethod1();
		System.out.println(lib.name);
		
		
	}
	
	public static void staticMethod1()
	{
		
		int value = 100;   //Local Variable
		
		System.out.println("This is Static Method");
	}
	
	public void nonStaticMethod1()
	{
		
		System.out.println("This is Non Static Method");
	}

}
