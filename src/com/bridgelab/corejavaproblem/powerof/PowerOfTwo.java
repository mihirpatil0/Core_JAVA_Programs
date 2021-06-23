package com.bridgelab.corejavaproblem.powerof;

import java.util.Scanner;

/**
 * @author mihir
 * 
 * This program takes a command-line argument N,
 * and prints a table of the powers of 2 that are less than or equal to 2^N.
 */
public class PowerOfTwo
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base number : ");
		int userBaseNumber = scanner.nextInt();
		System.out.print("Enter the exponent number : ");
		int userExponent = scanner.nextInt();
		scanner.close();
		System.out.println();
		
		//Calculating power of base number using Math.pow() function that takes base value and exponent value.
		for(int i = 0; i <= userExponent; i++)
		{
			System.out.println(userBaseNumber + " to the power of " + i + " is " + (int)Math.pow(userBaseNumber, i));
		}
	}
}
