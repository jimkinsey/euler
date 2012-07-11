package kinsey.jim.euler.library;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersTest {

	@Test
	public void test_isPrime_0() {
		assertFalse(Numbers.isPrime(0));
	}
	
	@Test
	public void test_isPrime_1() {
		assertFalse(Numbers.isPrime(1));
	}
	
	@Test
	public void test_isPrime_2() {
		assertTrue(Numbers.isPrime(2));
	}

	@Test
	public void test_isPrime_3() {
		assertTrue(Numbers.isPrime(3));
	}

	@Test
	public void test_isPrime_4() {
		assertFalse(Numbers.isPrime(4));
	}
	
	@Test
	public void test_isPrime_17() {
		assertTrue(Numbers.isPrime(17));
	}
	
}
