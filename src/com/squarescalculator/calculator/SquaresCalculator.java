/*
 * Sum of All Squares Calculator - v0.1
 * Author: Alen Sreckovic
 * Date: February 18, 2020
 * JRE System Library: Java 1.8 (Java 8)
 * */

package com.squarescalculator.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.apple.eawt.Application;

public class SquaresCalculator {

	//Constructor calls the printIntro fuction
	public SquaresCalculator() {

		printIntro();

	}

	//Function which prints the introduction text
	public void printIntro() {

		System.out.println("Sum of All Squares Calculator - v0.1, by Alen Sreckovic");
		System.out.println("--------------------------------------------------------");

		sumFunc();
	}

	//Calculation functionality
	public void sumFunc() {

		boolean cont = true;
		double sum = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("\nPlease enter the number of squares to add: ");
			try {
				int numOfSquares = scanner.nextInt();
				double[] arr = new double[numOfSquares];

				for (int i = 0; i < arr.length; i++) {

					System.out.print("Enter square " + (i + 1) + ": ");
					double square = scanner.nextDouble();
					if (square <= 0) {
						continue;
					} else {
						sum += Math.pow(square, 2);
					}
				}
				System.out.println("The sum of squares is: " + sum + "\n");
			} catch (InputMismatchException e) {
				System.out.println("Incorrect input.");
			} catch (NegativeArraySizeException e) {
				//Error text unnecessary in this catch-block
			}

			System.out.print("Press 'x' to exit, press Enter to continue: ");
			
			scanner.nextLine();

			if (scanner.nextLine().equalsIgnoreCase("x")) {
				cont = false;
				exitText();
				scanner.close();
				System.exit(0);
			} else {
				continue;
			}

		} while (cont == true);

	}

	//Function which displays exit text
	public void exitText() {
		System.out.println("Thank you for using the Sum of All Squares Calculator!");
	}

}
