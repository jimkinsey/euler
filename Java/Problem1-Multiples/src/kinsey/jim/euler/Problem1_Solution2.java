package kinsey.jim.euler;

public class Problem1_Solution2 {

	// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	//
	// Find the sum of all the multiples of 3 or 5 below 1000.

	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1000, 3, 5));
	}

	public static int sumOfMultiples(int limit, int... factors) {
		if (limit == 0)
			return 0;
		
		limit = limit - 1;
		
		if (isMultiple(limit, factors)) 
			return limit + sumOfMultiples(limit, factors);
		return sumOfMultiples(limit, factors);
	}
	
	private static boolean isMultiple(int number, int... factors) {
		if (factors.length == 0)
			return false;
		return ((number % head(factors)) == 0) || isMultiple(number, tail(factors));
	}
	
	private static int head(int... ints) {
		return ints[0];
	}
	
	private static int[] tail(int... ints) {
		int[] tail = new int[ints.length - 1];
		
		for (int i = 1; i < ints.length; i++) {
			tail[i - 1] = ints[i];
		}
		
		return tail;
	}
	
}
