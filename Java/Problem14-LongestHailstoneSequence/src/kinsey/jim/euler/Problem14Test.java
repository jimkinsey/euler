package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem14Test {
	
	@Test
	public void test_hailstone_length_1() {
		assertEquals(1, Problem14.hailstoneSequenceLength(1));
	}
	
	@Test
	public void test_hailstone_length_2() {
		assertEquals(2, Problem14.hailstoneSequenceLength(2));
	}
	
	@Test
	public void test_hailstone_length_3() {
		assertEquals(8, Problem14.hailstoneSequenceLength(3));
	}
	
	@Test
	public void test_hailstone_length_4() {
		assertEquals(3, Problem14.hailstoneSequenceLength(4));
	}

	@Test
	public void test_hailstone_length_13() {
		assertEquals(10, Problem14.hailstoneSequenceLength(13));
	}
	
	@Test
	public void test_start_point_with_longest_sequence_2() {
		assertEquals(1, Problem14.startPointWithLongestSequence(2));
	}
	
	@Test
	public void test_start_point_with_longest_sequence_3() {
		assertEquals(2, Problem14.startPointWithLongestSequence(3));
	}

	@Test
	public void test_start_point_with_longest_sequence_4() {
		assertEquals(3, Problem14.startPointWithLongestSequence(4));
	}

	@Test
	public void test_start_point_with_longest_sequence_5() {
		assertEquals(3, Problem14.startPointWithLongestSequence(5));
	}

	@Test
	public void test_start_point_with_longest_sequence_10() {
		assertEquals(9, Problem14.startPointWithLongestSequence(10));
	}
	
}
