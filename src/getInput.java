import java.util.Scanner;

public class getInput {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int firstUserNum = 0;
		int secondUserNum = 0;
		int firstDigitOfFirstUserNum;
		int firstDigitOfSecondUserNum;
		int secondDigitOfFirstUserNum;
		int secondDigitOfSecondUserNum;
		int thirdDigitOfFirstUserNum;
		int thirdDigitOfSecondUserNum;
		int sumOfFirstDigits;
		int sumOfSecondDigits;
		int sumOfThirdDigits;
		boolean isNumber;
		
		System.out.println("After inputting any two integers with the same number of digits (exactly three in this case), "
				+ "the program will check if each corresponding place in the two numbers sums to the same total.");
		
		do {
			System.out.println("Type any three-digit number and then press Enter: ");
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
			System.out.println("Type another three-digit number and then press Enter: ");
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
			
		firstDigitOfFirstUserNum = firstUserNum / 100 % 10;
		firstDigitOfSecondUserNum = secondUserNum / 100 % 10;
		sumOfFirstDigits = firstDigitOfFirstUserNum + firstDigitOfSecondUserNum;
		secondDigitOfFirstUserNum = firstUserNum / 10 % 10;
		secondDigitOfSecondUserNum = secondUserNum / 10 % 10;
		sumOfSecondDigits = secondDigitOfFirstUserNum + secondDigitOfSecondUserNum;
		thirdDigitOfFirstUserNum = firstUserNum % 10;
		thirdDigitOfSecondUserNum = secondUserNum % 10;
		sumOfThirdDigits = thirdDigitOfFirstUserNum + thirdDigitOfSecondUserNum;
		
		if ((sumOfFirstDigits == sumOfSecondDigits) && (sumOfSecondDigits == sumOfThirdDigits)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
