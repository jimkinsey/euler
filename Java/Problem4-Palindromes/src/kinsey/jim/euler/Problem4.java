package kinsey.jim.euler;

public class Problem4 {

	// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	//
	// Find the largest palindrome made from the product of two 3-digit numbers.
	
	public static void main(String[] args) {
		long largest = 0;
		int factorI = 0;
		int factorJ = 0;
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				long product = i * j;
				if (isPalindromic(String.valueOf(product)) && product > largest) {
					factorI = i;
					factorJ = j;
					largest = product;
				}
			}
		}
		
		System.out.println(factorI + " * " + factorJ + " = " + largest);
	}
	
	public static boolean isPalindromic(String string) {
		if (string.length() <= 1)
			return true;
		return lastChar(string) == firstChar(string) && isPalindromic(midChars(string));
	}
	
	private static char lastChar(String string) {
		return string.charAt(string.length() - 1);
	}

	private static char firstChar(String string) {
		return string.charAt(0);
	}
	
	private static String midChars(String string) {
		return string.substring(1, string.length() - 1);
	}
	
}
