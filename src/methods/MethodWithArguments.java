package methods;

public class MethodWithArguments {

	public static void main(String[] args) {

		signIN("tanmay@unicodetechnologies.in","unicode");
		signIN("info@unicodetechnologies.in","unicode111");
		searchProduct("iphone 14 Plus");
		searchProduct("JBL Earbuds");
		searchProduct("Panasonic DJ Headphones");
	}
	
	public static void signIN(String email, String password)
	{
		System.out.println("Email Address is->"+email);
		System.out.println("Password is->"+password);
		System.out.println("Click on Sign In Button");
		System.out.println("-------------------------------");

	}
	
	public static void searchProduct(String keyword)
	{
		System.out.println("Search product by "+keyword);
	}
	
	
}
