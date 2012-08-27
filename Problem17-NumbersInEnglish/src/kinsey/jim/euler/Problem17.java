package kinsey.jim.euler;

import static kinsey.jim.euler.library.Strings.head;
import static kinsey.jim.euler.library.Strings.tail;
import static java.lang.Character.isLetter;

public class Problem17 {

	public static void main(String[] args) {
		long count = 0;
		for (int i = 1; i <= 1000; i++)
			count += countLetters(new EnglishLanguageNumberFormat().format(i));
		System.out.println(count);
	}

	public static long countLetters(String string) {
		if (string.length() == 0)
			return 0;
		return countLetters(head(string).charAt(0)) + countLetters(tail(string));
//		
//		long count = 0;
//		for (char character : string.toCharArray()) {
//			if (Character.isLetter(character))
//				count++;
//		}
//		return count;
	}
	
	private static long countLetters(char character) {
		if (isLetter(character))
			return 1;
		return 0;
	}
	
}
