package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem2Test {

	@Test
	public void test_sumOfEvenFibsBelow_0() {
		assertEquals(0, Problem2.sumOfEvenFibsBelow(0));
	}
	
	@Test
	public void test_sumOfEvenFibsBelow_2() {
		assertEquals(2, Problem2.sumOfEvenFibsBelow(2));
	}
	
	@Test
	public void test_sumOfEvenFibsBelow_3() {
		assertEquals(2, Problem2.sumOfEvenFibsBelow(3));
	}

	@Test
	public void test_sumOfEvenFibsBelow_9() {
		assertEquals(10, Problem2.sumOfEvenFibsBelow(9));
	}

}
