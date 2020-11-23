//package CFLAB;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


public class ASCIIChars {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String newQuest = "yes";
		System.out.println("Please enter your name ?");
		String firstName = userInput.next();

		System.out.println("Hello " + firstName + "Would you like to continue the interactive portion?");
		String answer= userInput.next();
		
		do {

		if (answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("n")) {
			System.out.println("Please return later to complete the survey");
				System.exit(0);
		}else if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Do you have a red car?");
			String car = userInput.next();

			System.out.println("What is the name of your favorite pet?");
			String petName = userInput.next();

			System.out.println("What is your lucky number?");
			int lucky = userInput.nextInt();

			System.out.println("DO you have a favorite Quarter back?");
			String entry = userInput.next();
			
			if (entry.equalsIgnoreCase("no")) {
				System.out.println("What is the two-digit model year of your car?");
				int modelYear = userInput.nextInt();
			}else if (entry.equalsIgnoreCase("yes")) {
				System.out.println("What is the jersey number of your favorite quaterback?");
				int jerseyNum = userInput.nextInt();
			}
			System.out.println("What is the first name of yout favorite actor or  actress");
			String actor = userInput.next();
			System.out.println("Enter a random number between 1 and 50");
			int rando = userInput.nextInt();
		Object upperbound;
		Scanner random;
			int int_random = random.nextInt();
			int int_random0 = random.nextInt((int) upperbound);
			int int_random1 = random.nextInt((int) upperbound);
			int int_random2 = random.nextInt((int) upperbound);
			int int_random3 = random.nextInt((int) upperbound);
			int upper = 75;
			int luckyNum;
			int magic = luckyNum + int_random;
			
			System.out.print("Lottery numbers: " + int_random + "," + int_random0 + "," + int_random1 + "," + int_random2 + "," + int_random3);
 			System.out.println("magic Ball: " + magic);
			System.out.println();
			System.out.println("Would you like to answer questions to generate a new set of numbers?");
			newQuest = userInput.next();
		}while (newQuest.equalsIgnoreCase("yes")) {
			System.out.println("Thank you for playing");
				int luckyNum = userInput.nextInt();
		}
		
		public static void printNumbers() {
			ASCIIChars.printNumbers();
			int i;
			for(i = 0; i >=47 && i <= 57; i++) {
				System.out.println("The ASCII value of " + (char)i + " = " + i);
			}
		
			

	}
		public static void printLowerCase() {
			ASCIIChars.printLowerCase();
			int a;
				for (a=0; a>= 97 && a<= 122; a++) {
					System.out.println(" the ASCII value of " + (char)a+ " = " + a );
				}
		}
	}
		
				
				
		
	




	


