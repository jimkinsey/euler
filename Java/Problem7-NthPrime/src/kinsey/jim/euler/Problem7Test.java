package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem7Test {

	@Test
	public void test_prime_0() {
		assertEquals(0, Problem7.prime(0));
	}
	
	@Test
	public void test_prime_1() {
		assertEquals(2, Problem7.prime(1));
	}

	@Test
	public void test_prime_2() {
		assertEquals(3, Problem7.prime(2));
	}

	@Test
	public void test_prime_3() {
		assertEquals(5, Problem7.prime(3));
	}

	@Test
	public void test_prime_4() {
		assertEquals(7, Problem7.prime(4));
	}
}
