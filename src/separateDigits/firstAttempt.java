package separateDigits;

public class firstAttempt {
	
	public static void main(String[] args) {
		
	int firstUserNum = 123;
	String number;
	
	number = String.valueOf(firstUserNum);
	
	for(int i = 0; i < number.length(); i++) {
	    int j = Character.digit(number.charAt(i), 10);
	    System.out.println(j);
	}
}
}