package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//int[] values = new int[5];
		String[][] data = new String[3][4];  //[1stBox]- Rows  and [2ndBox] - Columns
		
		data[0][0] = "A";
		data[0][1] = "B";
		data[0][2] = "C";
		data[0][3] = "D";
		
		data[1][0] = "E";
		data[1][1] = "F";
		data[1][2] = "G";
		data[1][3] = "H";
		
		data[2][0] = "I";
		data[2][1] = "J";
		data[2][2] = "K";
		data[2][3] = "L";
		
		int rowLen = data.length;
		int colLen = data[0].length;
		
		
		for(int row=0;row<rowLen;row++)
		{
			for(int col=0;col<colLen;col++)
			{
				System.out.print(data[row][col]+"   ");
			}
			System.out.println();
		}
		
	}

}
