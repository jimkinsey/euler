package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Problem13Test {

	@Test
	public void test_sum_0() {
		assertEquals("0", Problem13.sum(Arrays.asList("0")));
	}
	
	@Test
	public void test_sum_2_2() {
		assertEquals("4", Problem13.sum(Arrays.asList("2", "2")));
	}
	
	@Test
	public void test_sum_1_2_3() {
		assertEquals("6", Problem13.sum(Arrays.asList("1", "2", "3")));
	}
	
	@Test
	public void test_sum_1_13() {
		assertEquals("14", Problem13.sum(Arrays.asList("1", "13")));
	}
	
	@Test
	public void test_sum_99_99() {
		assertEquals("198", Problem13.sum(Arrays.asList("99", "99")));
	}
	
	@Test
	public void test_sum_12345_246() {
		assertEquals("12591", Problem13.sum(Arrays.asList("12345", "246")));
	}
	
	@Test
	public void test_sum_20_7_1978() {
		assertEquals("2005", Problem13.sum(Arrays.asList("20", "7", "1978")));
	}
	
}
