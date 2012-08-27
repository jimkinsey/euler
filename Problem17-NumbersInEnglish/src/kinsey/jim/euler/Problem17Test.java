package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem17Test {

	@Test
	public void count_letters_in_empty_string_is_0() {
		assertEquals(0, Problem17.countLetters(""));
	}
	
	@Test
	public void count_letters_in_A_is_1() {
		assertEquals(1, Problem17.countLetters("A"));
	}
	
	@Test
	public void count_letters_in_A1_is_1() {
		assertEquals(1, Problem17.countLetters("A1"));
	}
}
