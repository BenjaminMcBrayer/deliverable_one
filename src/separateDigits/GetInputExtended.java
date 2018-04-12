package separateDigits;

import java.util.Scanner;

/*The following Java console program takes two positive integers (entered by a user) and then checks to see if each corresponding place in those two integers
	sums to the same total. */

public class GetInputExtended {

	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
		
			int firstUserNum = 0;
			int secondUserNum = 0;
			int lengthOfFirstUserNum;
			int lengthOfSecondUserNum;
			int lengthOfIntegers = 0;
			int i;
			int sumDigits;
			int firstDigitOfFirstUserNum;
			int firstDigitOfSecondUserNum;
			int secondDigitOfFirstUserNum;
			int secondDigitOfSecondUserNum;
			int thirdDigitOfFirstUserNum;
			int thirdDigitOfSecondUserNum;
			int sumOfFirstDigits = 0;
			int sumOfSecondDigits = 0;
			int sumOfThirdDigits = 0;
			boolean isNumber;
			boolean sameNumberOfDigits;
		
		System.out.println("After inputting any two positive integers with the same number of digits, "
				+ "the program will check if each corresponding place in the two numbers sums to the same total.");
		
		do {
			System.out.println("Type any positive integer and then press Enter: ");
			if (scnr.hasNextInt()) {
				firstUserNum = scnr.nextInt();
				isNumber = true;
			} 
			else {
				System.out.println("I don't understand you.");
				isNumber = false;
				scnr.next();
			}
				} while (!(isNumber));
		
		do {
			System.out.println("Type another positive integer and then press Enter: ");
			if (scnr.hasNextInt()) {
				secondUserNum = scnr.nextInt();	
				isNumber = true;
			} 
			else {
				System.out.println("I don't understand you.");
				isNumber = false;
				scnr.next();
			}
				} while (!(isNumber));
		
		lengthOfFirstUserNum = String.valueOf(firstUserNum).length();
		lengthOfSecondUserNum = String.valueOf(secondUserNum).length();
		
		do {
			if (lengthOfFirstUserNum == lengthOfSecondUserNum) {
				lengthOfIntegers = lengthOfFirstUserNum;
				sameNumberOfDigits = true;
			} else {
				System.out.println("The integers you have entered do not have the same number of digits.");
				sameNumberOfDigits = false;
				scnr.next();
			}
		} while (!(sameNumberOfDigits));
		
		for (i = 0; i >= (-lengthOfIntegers + 1); --i) {
			sumDigits = (int) (((firstUserNum * Math.pow(10, i) % 10) + ((secondUserNum * Math.pow(10, i)) % 10)));
			{
		
			if (lengthOfFirstUserNum == lengthOfSecondUserNum) {
			firstDigitOfFirstUserNum = firstUserNum / 100 % 10;
			firstDigitOfSecondUserNum = secondUserNum / 100 % 10;
			sumOfFirstDigits = firstDigitOfFirstUserNum + firstDigitOfSecondUserNum;
			secondDigitOfFirstUserNum = firstUserNum / 10 % 10;
			secondDigitOfSecondUserNum = secondUserNum / 10 % 10;
			sumOfSecondDigits = secondDigitOfFirstUserNum + secondDigitOfSecondUserNum;
			thirdDigitOfFirstUserNum = firstUserNum % 10;
			thirdDigitOfSecondUserNum = secondUserNum % 10;
			sumOfThirdDigits = thirdDigitOfFirstUserNum + thirdDigitOfSecondUserNum;
		}
			else {
				System.out.println("The integers you have entered do not have the same number of digits.");
			}
		
		if ((sumOfFirstDigits == sumOfSecondDigits) && (sumOfSecondDigits == sumOfThirdDigits)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
}}