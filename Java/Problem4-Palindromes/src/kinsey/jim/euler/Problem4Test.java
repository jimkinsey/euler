package kinsey.jim.euler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem4Test {

	@Test
	public void test_isPalindromic_A() {
		assertTrue(Problem4.isPalindromic("A"));
	}
	
	@Test
	public void test_isPalindromic_AA() {
		assertTrue(Problem4.isPalindromic("AA"));
	}
	
	@Test
	public void test_isPalindromic_AAA() {
		assertTrue(Problem4.isPalindromic("AAA"));
	}
	
	@Test
	public void test_isPalindromic_AB() {
		assertFalse(Problem4.isPalindromic("AB"));
	}
	
	
	
}
