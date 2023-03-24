package Constructor;
//When i need to initiallized anything than we use constructor.
//Use constuctor when variable and data come from outside and use in project and program.
/*when we need to check flow of data class1, class 2, class3 .... than we need to create constuctor
 * in class 2 and pass the value */

public class ConstructorConcept {

	public ConstructorConcept(String filepath)
	{
		System.out.println(filepath);
		
	}
	
	public ConstructorConcept(int value)
	{
		System.out.println(value);
		
	}
	public static void main(String[] args)
	{
		ConstructorConcept c1 =new ConstructorConcept(100);
		ConstructorConcept c= new ConstructorConcept("D:/Monday project/Mondaybugs");
		
		c.nsMethod();
		c1.nsMethod();	
	}
	
	public void nsMethod()
	{
		System.out.println("Non-static method");
	}

}
