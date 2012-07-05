package kinsey.jim.euler;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class Problem10Test {

	@Test
	public void test_primesBelow_0() {
		assertEquals(0, Problem10.primesBelow(0).size());
	}

	@Test
	public void test_primesBelow_2() {
		assertEquals(0, Problem10.primesBelow(2).size());
	}

	@Test
	public void test_primesBelow_3() {
		List<Integer> primesBelow = Problem10.primesBelow(3);
		assertEquals(1, primesBelow.size());
		assertEquals(2, primesBelow.get(0).intValue());
	}
	

	@Test
	public void test_primesBelow_10() {
		List<Integer> primesBelow = Problem10.primesBelow(10);
		assertEquals(4, primesBelow.size());
		assertEquals(2, primesBelow.get(0).intValue());
		assertEquals(3, primesBelow.get(1).intValue());
		assertEquals(5, primesBelow.get(2).intValue());
		assertEquals(7, primesBelow.get(3).intValue());
	}
}
