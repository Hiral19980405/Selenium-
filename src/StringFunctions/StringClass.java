package StringFunctions;

public class StringClass {

	public static void main(String[] args) {
		
		
		String actualResult = "Selenium";
		String expectedResult = "SelEnium";
		
		if (actualResult == expectedResult)
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		System.out.println("----------------------------------------------------");
		
		if (actualResult.equals(expectedResult))
		{
			System.out.println("pass");
		
		}
		else
		{
			System.out.println("fail");
		}
		
		System.out.println("-----------------------------------------------------");
		
		if (actualResult.equalsIgnoreCase(expectedResult))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
