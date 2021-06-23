package com.bridgelab.corejavaproblem.flipcoin;

/**********************************************************************************************
 * @author mihir
 * 
 * FlipCoin class calculating percentage of head and tail occurrences. 
 * User enters number to flip a coin.
 * Using Math.random() function to generate random number between greater than 0 and less than 1,
 * If random number is less than 0.5 then considering it is as tails otherwise head.
 * Keeping count of head and tail occurrences to calculate percentage.
 ***********************************************************************************************/
 
import java.util.Scanner;

public class FlipCoin
{
	/**
	 * Name: flip()
	 * 
	 * Description: method to flip a coin method.
	 * 
	 * Algorithm: passing userInput to flip a coin generating random numbers between 0 and 1
	 * if random number is less than 0.5 count as tail else count as head.
	 * calculating percentage of occurrences for head and tail.
	 * 
	 *  @param userInputCoinFlip
	 *  
	 *  Modification: Initial commit on 23-jun-2021.
	 */
	public static void flip(int userInputCoinFlip)
	{
		if(userInputCoinFlip <= 0)
		{
			System.out.println("Invalid input, Enter number greater than 0.");
		}
		else
		{
			int headCount = 0;
			for(int numberOfFlip = 1; numberOfFlip <= userInputCoinFlip; numberOfFlip++)
			{
				//checking if random number generated is greater than equal to 0.5.
				if( Math.random() >= 0.5 )
				{
					headCount ++;
				}
			}
			int headPercentage = (headCount*100) / userInputCoinFlip;
			System.out.println("Percentage of HEAD is : " + headPercentage + " %");
			int tailPercentage = 100 - headPercentage;
			System.out.println("Percentage of TAIL is : " + tailPercentage + " %");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter how many number of times you want to flip the coin : ");
		Scanner scanner = new Scanner(System.in);
		int userInputCoinFlip = scanner.nextInt();
		scanner.close();
		flip(userInputCoinFlip);
	}
}

