package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		int[] values = new int[5];
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		values[4] = 50;

		
		//int values[] = {10,20,30,40,50};
	//	String products[] = {"A","B","C","D"};
		
	//	int value;
	//	int value1[];
		/*
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);

		System.out.println(values[4]);
		*/
		
		int len = values.length;
		
		
		for(int count=0;count<len;count++)
		{
			System.out.println(values[count]);
		}
	}

}
