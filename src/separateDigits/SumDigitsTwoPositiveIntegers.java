package separateDigits;

import java.util.Scanner;

/*The following Java console program takes two positive integers (entered by a user) and then checks to see if each corresponding place in those two integers
sums to the same total. */

public class SumDigitsTwoPositiveIntegers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int firstUserNum = 0;
		int secondUserNum = 0;
		int lengthOfFirstUserNum;
		int lengthOfSecondUserNum;
		int lengthOfIntegers = 0;
		int i;
		int sumDigits;
		int firstDigits = 0;
		boolean isNumber;
		boolean areEqual = false;
		
		System.out.println("After inputting any two positive integers with the same number of digits, "
				+ "the program will check if each corresponding place in the two numbers sums to the same total.");
		
		//Request and validate user input. 
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
		
		//Ascertain and store lengths of each integer.
		lengthOfFirstUserNum = String.valueOf(firstUserNum).length();
		lengthOfSecondUserNum = String.valueOf(secondUserNum).length();
		
		//Compare integer lengths; if equal, run for loop; if not, notify user.
		if (lengthOfFirstUserNum == lengthOfSecondUserNum) {
			lengthOfIntegers = lengthOfFirstUserNum;
			//Run operation to compare integers with the same number of digits.
			for (i = 0; i >= (-lengthOfIntegers + 1); --i) {
						sumDigits = (int) ((Math.floor(firstUserNum * Math.pow(10, i) % 10)
								+ (Math.floor(secondUserNum * Math.pow(10, i)) % 10)));
						//Store value of the sum of the first two digits in a pair of integers.
						if (i == 0) {
							firstDigits = (int) (((firstUserNum * Math.pow(10, i) % 10)
									+ ((secondUserNum * Math.pow(10, i)) % 10)));
						}
						//Compare stored value with each sum until they are not equal.
						if (firstDigits != sumDigits) {
							areEqual = false;
							System.out.println("False");
							break;
						}
						else {
							areEqual = true;
						}	
					}
		
		if (areEqual == true) {
			System.out.println("True");
		}
		
			}
		else {
			System.out.println("The integers you have entered do not have the same number of digits.");
			scnr.next();
		}
}
	}
