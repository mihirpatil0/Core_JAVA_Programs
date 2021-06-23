package com.bridgelab.corejavaproblem.largestnumber;

import java.util.Scanner;

/**
 * @author mihir
 * 
 * 
 */
public class LargestNumber
{
	public static void main(String[] args)
	{
		int temp,largest;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int numberOner = scanner.nextInt();
		System.out.print("Enter second number : ");
		int numberTwo = scanner.nextInt();
		System.out.print("Enter third number : ");
		int numberThree = scanner.nextInt();
		scanner.close();
		
		//using ternary operator finding largest amongst three numbers. variable_name = (expression) ? value if true:value if false  
		temp = numberOner>numberTwo?numberOner:numberTwo;
		largest = temp>numberThree?temp:numberThree;
		System.out.println("The largest number amongst : " + " " + numberOner + ", " + numberTwo + ", " + numberThree + " is" + " --> " + largest);
	}
}
