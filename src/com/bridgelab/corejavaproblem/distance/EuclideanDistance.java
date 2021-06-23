package com.bridgelab.corejavaproblem.distance;

import java.util.Scanner;

/**************************************************************
 * @author mihir
 * 
 * Program that finds distance using Euclidean distance formula.
 **************************************************************/

public class EuclideanDistance
{
	/**
	 * Name : findEuclideandistance
	 * 
	 * Description : Finding distance.
	 * 
	 * Algorithm : using Euclidean distance formula calculating distance.
	 * float distance=(float) Math.sqrt((x*x)+(y*y));
	 * 
	 * @param x //first input value from user.
	 * @param y //second input value from user.
	 * 
	 * Modification : Initial commit 23-June-2021
	 */
	public static void findEuclideandistance(int x,int y)
	{
		float distance=(float) Math.sqrt((x*x)+(y*y));
		System.out.println("Euclidean Distance of ("+x+","+y+") is "+distance);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Calculating Euclidean Distance");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of x point:");
		int x=scanner.nextInt();
		System.out.println("enter the value of y point:");
		int y=scanner.nextInt();
		scanner.close();
		
		findEuclideandistance(x,y);
	}
}
