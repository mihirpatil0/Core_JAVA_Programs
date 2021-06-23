package com.bridgelab.corejavaproblem.swaptwonumbers;

import java.util.Scanner;

/**
 * @author mihir
 * 
 * Swapping of two numbers without using a third variable.
 * Taking two numbers from user, storing them as firstNumber & secondNumber.
 * Swapping the two number without using third (extra) variable. 
 */
public class SwapTwoNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int secondNumber = sc.nextInt();
		sc.close();
		
		System.out.println("Before swapping numbers : " + " " + "Number One : " + firstNumber + " " + "Number Two : " + " " + secondNumber);
		firstNumber += secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("After swapping numbers : " + " " + "Number One : " + firstNumber + " " + "Number Two : " + " " + secondNumber);
	}
}
