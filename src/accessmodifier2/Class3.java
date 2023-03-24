package accessmodifier2;

import accessmodifier1.Class1;

public class Class3 extends Class1
{
	public static void main(String[] args)
	{
		Class3 c = new Class3();
		
		System.out.println(c.name);
		System.out.println(prov);
		
		c.nsmethod();
		smethod();
		
		
	}
}
