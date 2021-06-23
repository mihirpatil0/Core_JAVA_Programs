package com.bridgelab.corejavaproblem.leapyear;

import java.util.Scanner;

/**
 * @author mihir
 *
 * LeapYear class checking if user entered year is leap year or not. 
 */
public class LeapYear
{
	public static void main(String[] args)
	{
		System.out.print("Enter only 4 digit YEAR : ");
		Scanner scanner = new Scanner(System.in);
		int userYear = scanner.nextInt();
		scanner.close();
		// checking if user input is 4 digit value or not.
		if(userYear >= 1000 && userYear <= 9999 )
		{
			//condition for checking leap year.
			if( userYear % 4 == 0 && ( userYear % 100 != 0 || userYear % 400 == 0 ) )
			{
				System.out.println(userYear + " Is a leap year.");
			}
			else
			{
				System.out.println(userYear + " Is not a leap year.");
			}
		}
		else
		{
			System.out.println("Enter 4 digit year only.");
		}
	}
}

