package conditions;

import java.util.Scanner;

public class MultipleConditions {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the price->");
		int price = sc.nextInt();
		

		
		if(price>1000 & price<=2000)
		{
			System.out.println("10% Discount is applicable");
		}
		else if(price>2000 & price<=3000)
		{
			System.out.println("20% Discount is applicable");

		}
		else if(price>3000 & price<=5000)
		{
			System.out.println("30% Discount is applicable");

		}
		else if(price>5000)
		{
			System.out.println("Flat 50% Discount is applicable");

		}else if(price>=0 & price<=1000)
		{
			System.out.println("Sorry...No Discount");
		}
		else
		{
			System.out.println("Invalid Price");
		}
	}
}
