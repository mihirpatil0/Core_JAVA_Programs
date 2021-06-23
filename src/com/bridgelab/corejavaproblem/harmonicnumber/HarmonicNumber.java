package com.bridgelab.corejavaproblem.harmonicnumber;

import java.util.Scanner;

/**
 * @author mihir
 * This class prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 * where N is the number accepted from user.
 */
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		double harmonic = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to find harmonic value:");
		int userInput = scanner.nextInt();
		scanner.close();
		
		for(int i=1; i<=userInput; i++)
		{
			harmonic += (double) 1/i ;
			System.out.println("\nHarmonic " + i + ": " + harmonic);
		}
		
	}
}
