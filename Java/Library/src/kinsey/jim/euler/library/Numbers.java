package kinsey.jim.euler.library;

import static kinsey.jim.euler.library.Lists.flatten;
import static kinsey.jim.euler.library.Lists.head;
import static kinsey.jim.euler.library.Lists.reversed;
import static kinsey.jim.euler.library.Lists.tail;
import static kinsey.jim.euler.library.Strings.head;
import static kinsey.jim.euler.library.Strings.tail;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	
	public static boolean isPrime(Number number) {
		int x = number.intValue();
		
		if (x < 2 || (x > 2 && x % 2 == 0))
			return false;
		
		for (int i = 3; i <= Math.sqrt(x); i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static List<Byte> getDigits(Number number) {
		return getDigits(number.toString());
	}
	
	@SuppressWarnings("unchecked")
	public static List<Byte> getDigits(String bigNumber) {
		if (bigNumber.isEmpty())
			return new ArrayList<Byte>();
		return flatten(Byte.valueOf(head(bigNumber)), getDigits(tail(bigNumber)));
	}

	public static Long fromDigits(List<Byte> digits) {
		long number = 0;
		List<Byte> reversedDigits = Lists.reversed(digits);
		for (int i = 0; i < reversedDigits.size(); i++)
			number += (reversedDigits.get(i) * Math.pow(10, i));
		return number;
	}
	
	public static String sum(List<String> numbers) {
		if (numbers.size() == 0)
			return "";
		return sum(head(numbers), sum(tail(numbers)));
	}
	
	public static String sum(String a, String b) {
		return sum(a, b, 0);
	}
	
	private static String sum(String a, String b, int carry) {
		if (a.isEmpty() && b.isEmpty() && carry == 0)
			return "";
		int sum = lastDigit(a) + lastDigit(b) + carry;
		return sum(firstDigits(a), firstDigits(b), (sum / 10)) + String.valueOf(sum % 10);
	}
	
	private static int lastDigit(String number) {
		if (number.length() == 0)
			return 0;
		return Integer.valueOf(number.substring(number.length() - 1));
	}
	
	private static String firstDigits(String number) {
		if (number.length() == 0)
			return "";
		return number.substring(0, number.length() - 1);
	}
	
	public static String product(String a, String b) {
		List<Byte> bDigits = reversed(getDigits(b));
		List<String> products = new ArrayList<String>();
		for (Byte bDigit : bDigits)
			products.add(product(a, bDigit) + zeros(bDigits.indexOf(bDigit)));
		return sum(products);
	}
	
	private static String product(String a, byte b) {
		if (a.equals("0") || b == 0)
			return "0";
		String product = "";
		for (int i = 0; i < b; i++)
			product = sum(a, product);
		return product;
	}
	
		
//		List<String> aDigits = Lists.reversed(Strings.characters(a));
//
//		List<String> products = new ArrayList<String>();
//		
//		for (int i = 0; i < bDigits.size(); i++) {
//			StringBuilder sb = new StringBuilder();
//			int carry = 0;
//			for (int j = 0; j < aDigits.size(); j++) {
//				int product = (Byte.valueOf(bDigits.get(i)) * Byte.valueOf(aDigits.get(j))) + carry;
//				sb.insert(0, product % 10);
//				carry = product / 10;
//			}
//			if (carry > 0)
//				sb.insert(0, carry);
//			products.add(sb.toString() + zeros(i));
//		}
//		
//		return sum(products);
//	}
	
	private static String zeros(int n) {
		if (n == 0)
			return "";
		return "0" + zeros(n - 1);
	}
	
	public static String pow(String a, long b) {
		String result = "1";
		for (long i = 0; i < b; i++)
			result = product(result, a);
		return result;
	}
	
}
