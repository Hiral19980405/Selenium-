package StringFunctions;

public class StringExercise1 {

	public static void main(String[] args) {
		String text ="There are 50 products in my cart";
		
		int expResult = 5;
		
		int actResult;
		
		System.out.println(text.substring(10,11));
		 
		System.out.println("------------------------------");
		
		String[] data =text.split(" ");
		
		String myvalue =data[2];
		
		System.out.println(myvalue);
		
		/* myvalue variable type is string and actResult variable type is integer
		 so, i have to convert variable value from string to integer 
		 */
		
		actResult=Integer.parseInt(myvalue);
		
		System.out.println("Actual result is:"+actResult);
		System.out.println("Expected result is:"+expResult);
		
		
		if(actResult==expResult)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
