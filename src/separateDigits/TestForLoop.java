package separateDigits;

public class TestForLoop {

	public static void main(String[] args) {
		int lengthofIntegers = 3;
		int firstUserNum = 119;
		int secondUserNum = 911;
		int i;
		int sumDigits = 0;
		
			for (i = 0; i >= (-lengthofIntegers + 1); --i) {
				sumDigits = (int) ((Math.floor(firstUserNum * Math.pow(10, i) % 10) + (Math.floor(secondUserNum * Math.pow(10, i)) % 10)));
				System.out.println(sumDigits);
				
		}
	}

}
