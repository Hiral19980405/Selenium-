package InterfaceProject;

public class Hyundai implements Car
{

	public static void main(String[] args) {
		
		Hyundai h =new Hyundai();
		
		h.startcar();
		h.stopcar();
		h.autoSensor();
		
	}

	@Override
	public void startcar() {
		
        System.out.println("This is start car method");		
	}

	@Override
	public void stopcar() {
		
		System.out.println("This is stop car method");
	}
	
	public void autoSensor()
	{
		System.out.println("This is autoSensor method");
	}

}
