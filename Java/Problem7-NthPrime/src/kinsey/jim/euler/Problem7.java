package kinsey.jim.euler;

import static kinsey.jim.euler.library.Numbers.isPrime;

public class Problem7 {

	// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	//
	// What is the 10 001st prime number?
	
	public static void main(String[] args) {
		System.out.println(prime(10001));
	}
	
	public static long prime(long n) {
		int count = 0;
		
		for (int i = 1; count <= n; i++) {
			if (isPrime(i)) {
				count++;
				if (count == n)
					return i;
			}
		}
		
		return 0;
	}
	
}
