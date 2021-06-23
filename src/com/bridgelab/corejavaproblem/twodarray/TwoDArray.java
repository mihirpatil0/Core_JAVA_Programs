package com.bridgelab.corejavaproblem.twodarray;

import java.util.Scanner;

/**
 * @author mihir
 * 
 * 
 */
public class TwoDArray
{
	
	/**
	 * Name : printTwoDArray()
	 * 
	 * @param rows //taking input from user for 2d arrays row.
	 * @param colum //taking input from user for 2d arrays column.
	 * 
	 *  Description : method to print two dimensional array.
	 *  
	 *  Algorithm : creating 2 d array and printing serial number starting from 1 to the each arrays index position.
	 *  
	 */
	public static void printTwoDArray(int rows,int colum) 
	{
		int[][] arr = new int [rows][colum];
		int k=1;
		for(int i=0; i < rows; i++)
		{
			for(int j=0; j < colum; j++)
			{
				arr[i][j]=k;
				System.out.print("arr[" + i + "][" + j + "]="+ arr[i][j] + "  ");
				k++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Creating a 2 Dimensional array");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.of Rows: ");
		int rows=scanner.nextInt();
		System.out.println("Enter the no.of Columns: ");
		int colum=scanner.nextInt();
		scanner.close();
		printTwoDArray(rows,colum);
	}
}
