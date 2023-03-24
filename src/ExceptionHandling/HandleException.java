package ExceptionHandling;

public class HandleException {

	public static void main(String[] args) {
		
	System.out.println("OPen URL");
	System.out.println("Click on signin link");
	System.out.println("Enter email aaddress and password");
	System.out.println("Click on LOgin button");
	System.out.println("Chcek if hiral keyword is present in the welcome text");
	
	try
	{
		int count=100/0;
	}
	catch(Exception e)
	{
		System.out.println("Error occurred->"+e.getMessage());
	}
	
	System.out.println("Click on JBL Product Link");
	System.out.println("Print the product name and price");
	System.out.println("Logout process");
	
	}

}
