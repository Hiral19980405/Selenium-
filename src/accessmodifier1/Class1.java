package accessmodifier1;

public class Class1 {
	
    public String name="Testing using Selenium";
	static int value = 10;
	private String pv ="Hello private variable";
    static String dv ="Hello default variable";
    protected static String prov ="Hello protected variable";
	
	public static void main(String[] args)
	{
		System.out.println(value);
		System.out.println(dv);
		smethod();
		
		Class1 c =new Class1();   
		System.out.println(c.name);
		System.out.println(c.pv);
		c.nsmethod();
		
		System.out.println(prov);
		
	}
	
	public static void smethod()
	
	{
				System.out.println("This is static method ");
	
	}
	
	public void nsmethod()
	{
		System.out.println("This is non-static method");
	}
}
