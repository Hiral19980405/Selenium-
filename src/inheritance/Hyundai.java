package inheritance;

public class Hyundai {

	static String brandName = "Hyundai";
	int price;
	
	public void startCar()
	{
		System.out.println("Start Car - Non Static Method");
	}
	
	
	public void stopCar()
	{
		System.out.println("Stop Car - Non Static Method");

	}
	
	public static void commonFeature()
	{
		System.out.println("Common Features");
	}
	
}
