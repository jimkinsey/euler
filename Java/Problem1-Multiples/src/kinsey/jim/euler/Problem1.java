package kinsey.jim.euler;

public class Problem1 {

	// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	//
	// Find the sum of all the multiples of 3 or 5 below 1000.

	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1000, 3, 5));
	}
	
	public static int sumOfMultiples(int limit, int... factors) {
		int sum = 0;
		
		for (int i = 0; i < limit; i++) {
			if (isMultiple(i, factors)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	private static boolean isMultiple(int number, int... factors) {
		for (int factor : factors) {
			if (number % factor == 0) {
				return true;
			}
		}
		
		return false;
	}	
	
}
