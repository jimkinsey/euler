package kinsey.jim.euler;

import static kinsey.jim.euler.library.Numbers.isPrime;
import static kinsey.jim.euler.library.NumberLists.sum;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	//
	// Find the sum of all the primes below two million.
	
	public static void main(String[] args) {
		System.out.println(sum(primesBelow(2000000)));
	}
	
	public static List<Integer> primesBelow(int limit) {
		List<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 2; i < limit; i++) {
			if (isPrime(i))
				primes.add(i);
		}
		
		return primes;
	}
	
}
