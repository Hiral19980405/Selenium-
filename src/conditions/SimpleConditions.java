package conditions;

public class SimpleConditions {

	public static void main(String[] args) {

		System.out.println("****************Possibility 1*****************");
		
		int expResult = 500;
		int actResult = 501;
		
		int price = 1000;
		
		if(expResult==actResult)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");

		}
		
		System.out.println("****************Possibility 2*****************");
		
		if(price>500)
		{
			System.out.println("Price is greater than 500");
		}
		

	}

}
