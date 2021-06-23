package com.bridgelab.corejavaproblem.vowelorconsonant;

import java.util.Scanner;

/*******************************************************************************************************
 * @author mihir
 * 
 * VowelOrConsonant java class finding given alphabet is vowel or consonant.
 * vowel are predefined in program.
 * asking user to enter alphabet if that alphabet matches with vowel then it is vowel or it is consonant.
 *******************************************************************************************************/
public class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		String userInput = scanner.next();
		scanner.close();
		switch (userInput)
		{
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(userInput + " is vowel.");
				break;
		default:
			System.out.println(userInput + " is consonant.");
		}
	}
}
