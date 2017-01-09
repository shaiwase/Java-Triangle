/**
 * This program calculates the area and perimeter of a legal triangle using the Heron formula and return the triangle details
 * to the console.
 * Name : Karine Or
 * ID : 310261243
 * Course : Intro to computer scienses and Java PL. 20114
 * MMN 11 Question 1
 */

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		//Explain to the user the purpose of this program
		System.out.println ("This program calculates the area " +
				"and the perimeter of a given triangle ");
		//Ask from the user to enter the lenght of the triangle
		System.out.println ("Please enter the three lengths of the " +
				"triangle's sides");

		int a = scan.nextInt(); //a side of the triangle
		int b = scan.nextInt(); //b side of the triangle
		int c = scan.nextInt(); //c side of the triangle

		//Check with condition if the sides of the triangle are legals and quit the program if not legal.
		if  ((a + b) < c || (a + c) < b || (b + c) < a || a <= 0 || b <= 0 || c <= 0) 
		{
			System.out.println("The lenghts are not legal.");
		} else {
			//Calculate the perimeter of the triangle
			int perim = (a + b + c);
			//Calculate half perimeter of the triangle needed for Heron formula
			double perimHalf = (a + b + c) /2;
			//Heron formula to calculate the triangle area.
			double area = (Math.sqrt(perimHalf*(perimHalf - a)*(perimHalf - b)*(perimHalf - c)));

			//Prints the triangle perimeter + area on the user's console
			System.out.println("The perimeter of the triangle is : " + perim);
		 	System.out.println("The area of the triangle with lengths " + "a=" + a + " b=" + b + " c=" + c + " is: " + area);
		}

	}

}
