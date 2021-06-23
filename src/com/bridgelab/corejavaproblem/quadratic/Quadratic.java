package com.bridgelab.corejavaproblem.quadratic;

import java.util.Scanner;

/**
 * @author mihir
 * Program to find quadratic roots of equation.
 */
public class Quadratic
{
	/**
	 * Name : quadraticRoots.
	 * 
	 * Description : calculating quadratic roots.
	 * 
	 * Algorithm : Delta which is made up of user input formula for delta is secondValue * secondValue - 4 * firstValue * thirdValue,
	 * defining 2 quadratic equations to that will give us root of an equation.
	 *  
	 * @param a //passing firstValue to the method.
	 * @param b //passing secondValue to the method.
	 * @param c //passing thirdValue to the method.
	 * 
	 * Modified : Initial commit 23-June-2021.
	 */
	public static void quadraticRoots(int a,int b,int c)
	{
		int Delta = b*b-4*a*c;
		if (Delta>=0)
		{	
			float Root1= (float) (-b+Math.sqrt(Delta))/(2*a);
			float Root2= (float) (-b-Math.sqrt(Delta))/(2*a);
			System.out.println("Root 1: "+Root1+" & Root 2: "+Root2);
		}
		else
		{
			System.out.println("Imaginary, Since Delta is <0");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Calculating Quadratic Roots of Equation");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of 'a' in Qudratic equation:");
		int a=scanner.nextInt();
		System.out.println("Enter the value of 'b' in Qudratic equation:");
		int b=scanner.nextInt();
		System.out.println("Enter the value of 'c' in Qudratic equation:");
		int c=scanner.nextInt();
		System.out.println("The roots of the equation "+a+"x^2+"+b+"x+"+c+" are ");
		scanner.close();
		
		quadraticRoots(a,b,c);
	}
}
