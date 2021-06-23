package com.bridgelab.corejavaproblem.integersaddtozero;

import java.util.Scanner;

/*********************************************************************************************
 * @author mihir
 * 
 * In this program finding 3 integers whose sum will equal to zero.
 * Asking user to enter negative and positive values that will be stored inside an array.
 * Iterating through the array to check if 3 interns are their whose sum will be equal to zero.
 *********************************************************************************************/
public class SumOfIntegersAddToZero
{	
	static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Name : storeNumber.
	 * 
	 * Description : to store numbers inside array.
	 * 
	 * Algorithm : Asking user to enter positive and negative numbers,
	 * and storing them inside an array.
	 * 
	 * @param arrStoreNo //passing arrStoreNo array to the function to store number inside it.
	 * 
	 * Modification : Initial commit on 23-june-2021
	 */
	public static void storeNumber(int[] arrStoreNo)
	{
		for(int i=0; i<arrStoreNo.length; i++)
		{
			System.out.println("Enter any positive or negative numbers");
			int userInput = scanner.nextInt();
			arrStoreNo[i] = userInput;
		}
		
		for(int j=0; j<arrStoreNo.length; j++)
		{
			System.out.println("Values are : " + " " + arrStoreNo[j]);
		}
		scanner.close();
	}
	
	/**
	 * Name : sumOfIntegers
	 * 
	 * Description : Finding integers whose sum will be equal to zero.
	 * 
	 * Algorithm : three different for loop will iterate through the array to to check which are the possible elements present in an array,
	 * whose sum will be equal to zero.
	 * 
	 * @param arrStoreNo //Passing array for  iteration.
	 * 
	 * Modification : Initial commit on 23-june-2021.
	 */
	public static void sumOfIntegers(int[] arrStoreNo)
	{
		for(int a=0; a<arrStoreNo.length-2; a++) 
		{
			for(int b=1; b<arrStoreNo.length-1; b++)
			{
				for(int c=2; c<arrStoreNo.length; c++)
				{	
					//checking if sum of 3 integers from an array is equal to zero.
					if(arrStoreNo[a]+arrStoreNo[b]+arrStoreNo[c] == 0)
					{
						System.out.println("The sume of 3 integer" + " " + arrStoreNo[a]+"+"+arrStoreNo[b]+"+"+arrStoreNo[c] + " = 0");
					}
					else
					{
						System.out.println("Cant find sum = 0");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{	
		System.out.println("Enter how many numbers you want to store : Minimum 3 numbers");
		int arrayLegth = scanner.nextInt();
		int[] arrStoreNo = new int[arrayLegth];
		
		storeNumber(arrStoreNo);
		sumOfIntegers(arrStoreNo);
	}
}
