package accessmodifier1;

public class Class4 extends Class1
{

	public static void main(String[] args) {
		
		Class4 obj = new Class4();
		
		System.out.println(obj.name);
		System.out.println(value);
		//System.out.println(obj.pv);   private variable is not accessible in other class 
		
		System.out.println(dv);
		
		System.out.println(prov);
		
		obj.nsmethod();
		
		smethod();
				

	}

}
