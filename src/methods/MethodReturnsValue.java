package methods;

public class MethodReturnsValue {

	public static void main(String[] args) {

		boolean output = checkDiscount(500,300);
		
		if(output)
		{
			System.out.println("Flat Rs. 200 Discount is Applicable");
		}
		else
		{
			System.out.println("No Discounts");
		}
		
		int value = checkPrice(250,500,750);
		
		System.out.println(value);
	}
	
	
	
	public static boolean checkDiscount(int val1, int val2)
	{
		int total = val1 + val2;
		
		if(total>1000)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static int checkPrice(int prod1, int prod2, int prod3)
	{
		int total = prod1 + prod2 + prod3;
		
		return total;
	}
	
	
	
	
	

}
