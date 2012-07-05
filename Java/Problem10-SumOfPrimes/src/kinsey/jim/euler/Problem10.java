package kinsey.jim.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	//
	// Find the sum of all the primes below two million.
	
	public static void main(String[] args) {
		System.out.println(sum(primesBelow(2000000)));
	}

	public static long sum(List<Integer> numbers) {
		long sum = 0;
		
		for (Integer number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	public static List<Integer> primesBelow(int limit) {
		List<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 2; i < limit; i++) {
			if (isPrime(i))
				primes.add(i);
		}
		
		return primes;
	}
	
	private static boolean isPrime(long number) {
		if (number < 2)
			return false;
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		
		return true;
	}
	
}
