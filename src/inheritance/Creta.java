package inheritance;

//Hyundai -> Parent Class or Super Class
//Creta -> Child Class or Sub Class

//By creating object of child class, we can access the non static methods of child class as well as parent class

public class Creta extends Hyundai{

	public static void main(String[] args) {

		Creta c = new Creta();
		c.machineMech();
		suvProperties();
		c.startCar();
		c.stopCar();
		commonFeature();
	
	}

	public void machineMech()
	{
		System.out.println("machine Mech");
		
	}
	
	public static void suvProperties()
	{
		
		System.out.println("SUV Properties");
	}
	
}
