package inheritance;

public class CretaSXModel extends Creta{

	public static void main(String[] args) {

		CretaSXModel c = new CretaSXModel();
		c.autoFeatures();
		c.machineMech();
		c.startCar();
		c.stopCar();
		
		checkTyres();
		suvProperties();
		commonFeature();
	}
	
	public static void checkTyres()
	{
		System.out.println("checkTyres");
		
	}
	
	public void autoFeatures()
	{
		System.out.println("autoFratures");
	}

}
