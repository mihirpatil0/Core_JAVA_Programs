package com.bridgelab.corejavaproblem.primefactorization;

import java.util.Scanner;

/**
 * @author mihir
 * Computing the prime factorization of N.
 * where N is user input number.
 * 
 */
public class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to find its prime factors:");
		int userNumber = scanner.nextInt();
		scanner.close();
		
		//this for loop iterate till the number which is entered by the user.
		for(int i=2; i<=userNumber; i++)
		{
			//check for the remender if it is equal to 0 if yes printing the i th value which is coming from for loop and then user number will get divide by the same i th value.
			while(userNumber%i == 0)
			{
				System.out.println(i);
				userNumber = userNumber/i;
			}
		}
	}
}
