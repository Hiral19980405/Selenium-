package accessmodifier1;

public class Class2
{
	
	public static void main(String[] args)
	{
		Class1 c =new Class1();
		
				System.out.println(c.name);
				System.out.println(Class1.value);
				System.out.println(Class1.dv);
				System.out.println(Class1.prov);
				
				
				c.nsmethod();
				Class1.smethod();
	}
}
