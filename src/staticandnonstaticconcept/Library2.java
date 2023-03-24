package staticandnonstaticconcept;

public class Library2 {

	public static void main(String[] args) {

		Library2.staticMethod2();
		
		Library2 lib = new Library2();
		lib.nonStaticMethod2();
		
		Library1.staticMethod1();
		Library1 lib1 = new Library1();
		lib1.nonStaticMethod1();
		
	}
	
	public static void staticMethod2()
	{
		
		System.out.println("This is Static Method 2");
	}
	
	public void nonStaticMethod2()
	{
		
		System.out.println("This is Non Static Method 2");
	}

}
