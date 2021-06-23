package com.bridgelab.corejavaproblem.quotientremainder;

import java.util.Scanner;

/*******************************************************************
 * @author mihir
 *
 * This class compute quotient and remainder for a user given number.
 *******************************************************************/
public class QuotientRemainder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find quotient and remainder : ");
		int userNumber = sc.nextInt();
		sc.close();
		
		//this for loop will run until user given number.
		for(int i=1; i<=userNumber; i++) 
		{
			//computes quotient part.
			int quotient = userNumber/i;
			//computes remainder part.
			int remainder = userNumber%i;
			System.out.println("For:" + " " + userNumber + "/" + i + " Quotient is = " + " " + quotient + " Remainder is = " + remainder);
		}
	}
}
