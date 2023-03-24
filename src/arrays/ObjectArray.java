package arrays;

public class ObjectArray {

	public static void main(String[] args) {

		Object str[] = new Object[5];
		
		str[0] = 1000;
		str[1] = "Automation testing";
		str[2] = 103.50;
		str[3] = true;
		str[4] = 'U';
		
		
		for(int count=0;count<str.length;count++)
		{
			System.out.println(str[count]);
		}
	}

}
