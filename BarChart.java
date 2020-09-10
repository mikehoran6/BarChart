//ch6 exercise 13 p.326

import java.util.Scanner;

public class BarChart
{
	public static void main(String[] args) 
	{
		//constants and variables
		int artPoints;
		int bobPoints;
		int calPoints;
		int danPoints;
		int eliPoints;

		//input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter points earned by Art >> ");
		artPoints = input.nextInt();	
		System.out.print("Please enter points earned by Bob >> ");
		bobPoints = input.nextInt();	
		System.out.print("Please enter points earned by Cal >> ");
		calPoints = input.nextInt();
		System.out.print("Please enter points earned by Dan >> ");
		danPoints = input.nextInt();		
		System.out.print("Please enter points earned by Eli >> ");
		eliPoints = input.nextInt();	

		//output
		System.out.println();
		System.out.println("Points earned this game: ");
		displayPoints("Art",artPoints);
		displayPoints("Bob",bobPoints);
		displayPoints("Cal",calPoints);
		displayPoints("Dan",danPoints);
		displayPoints("Eli",eliPoints);
	}
	//method that generates asterisk characters for bar chart
	public static void displayPoints(String name, int points)
	{
		System.out.print("\n" + name + ": ");
		for(int i = 1; i <= points; ++i)
		{
			System.out.print("*");
		}
	}

}