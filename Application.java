// Contributed by Manish Sharma

import java.io.*;

class GFG 
{ 
	public static void printRow(int n) // for printing a row
	{
		if(n == 0)
		{
			return;
		}
		System.out.print("* ");
		printRow(n - 1); // for next * in the current row
	}

	public static void changeRow(int n) // for moving to next row...n = 1 means last row
	{
		if(n == 0)
		{
			return;
		}
		changeRow(n - 1);
		printRow(n); // when call stack of changeRow method is popping out we will print row 
		System.out.print("\n"); // new line after each column
	}

	public static void main (String[] args) 
	{
		GFG.changeRow(5); // changeRow method is static so no need to create an object of GFG class.
	}
}

