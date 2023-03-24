package loops;

public class ForLoop {

	public static void main(String[] args) {

		for(int count=1;count<=10;count++)
		{
			System.out.println(count);
			
			if(count==5)
			{
				System.out.println("Value of count is 5");
				break;
			}
			
		}
	}

}
