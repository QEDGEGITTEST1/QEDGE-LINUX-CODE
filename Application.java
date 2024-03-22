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

#code changes for feature-2.1 for method added on 21mar2024 by vivek
// Java program to copy content from 
// one file to another 

import java.io.*; 
import java.util.*; 

public class CopyFromFileaToFileb { 
	
	public static void copyContent(File a, File b) 
		throws Exception 
	{ 
		FileInputStream in = new FileInputStream(a); 
		FileOutputStream out = new FileOutputStream(b); 

		try { 

			int n; 

			// read() function to read the 
			// byte of data 
			while ((n = in.read()) != -1) { 
				// write() function to write 
				// the byte of data 
				out.write(n); 
			} 
		} 
		finally { 
			if (in != null) { 

				// close() function to close the 
				// stream 
				in.close(); 
			} 
			// close() function to close 
			// the stream 
			if (out != null) { 
				out.close(); 
			} 
		} 
		System.out.println("File Copied"); 
	} 

	public static void main(String[] args) throws Exception 
	{ 
		Scanner sc = new Scanner(System.in); 

		// get the source file name 
		System.out.println( 
			"Enter the source filename from where you have to read/copy :"); 
		String a = sc.nextLine(); 

		// source file 
		File x = new File(a); 

		// get the destination file name 
		System.out.println( 
			"Enter the destination filename where you have to write/paste :"); 
		String b = sc.nextLine(); 

		// destination file 
		File y = new File(b); 

		// method called to copy the 
		// contents from x to y 
		copyContent(x, y); 
	} 
}

}


 #code changes for feature-2.2 for method added on 22mar2024 by karthik
//import required classes and packages
import Java.util.*;
import java.io.*;
import java.util.Scanner;

//create BuzzNumberExample class to check whether the given number is Buzz number or not
class BuzzNumberExample {

    // create checkNumber() method that returns true when it founds number Buzz
    static boolean checkNumber(int number)
    {
        // check whether the number ends with 7, is divisible by 7 or not
        if(number % 10 == 7 || number % 7 == 0)
            return true;    //returns true when the number is Buzz
        else
            return false;   //returns flase when the number is not Buzz
    }

    // main() method start
    public static void main(String args[])
    {
        int n1, n2;

        //create scanner class object to get input from user
        Scanner sc=new Scanner(System.in);

        //show custom message
        System.out.println("Enter first number");

        //store user entered value into variable n1
        n1 = sc.nextInt();

        //show custom message
        System.out.println("Enter second number");

        //store user entered value into variable n2
        n2 = sc.nextInt();

        if (checkNumber(n1))
            System.out.println(n1 + " is a Buzz number");
        else
            System.out.println(n1 + " is not a Buzz number");
        if (checkNumber(n2))
            System.out.println(n2 + " is a Buzz number");
        else
            System.out.println(n2 + " is not a Buzz number");
    }
}
