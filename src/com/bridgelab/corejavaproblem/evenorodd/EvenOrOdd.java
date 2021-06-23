package com.bridgelab.corejavaproblem.evenorodd;

import java.util.Scanner;

/*********************************************
 * @author mihir
 * 
 * EvenOrOdd java file accept number from user.
 * checks if that number is even or odd.
 *********************************************/
public class EvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check if it is even or odd : ");
		int userNumber = scanner.nextInt();
		scanner.close();
		
		if(userNumber%2 == 0)
		{
			System.out.println("The given number : " + userNumber + " " + "is a even number.");
		}
		else
		{
			System.out.println("The given number : " + userNumber + " " + "is a odd number.");
		}
	}
}
