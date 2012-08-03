package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;
import kinsey.jim.euler.Problem15;
import kinsey.jim.euler.Problem15.Point;

import org.junit.Test;

public class Problem15Test {

	@Test
	public void test_paths_1_x_1() {
		assertEquals(2, Problem15.paths(point(0,0), point(1,1)));
	}
	
	@Test
	public void test_paths_2_x_2() {
		assertEquals(6, Problem15.paths(point(0,0), point(2,2)));
	}
	
	@Test
	public void test_paths_3_x_3() {
		assertEquals(20, Problem15.paths(point(0,0), point(3,3)));
	}
	
	@Test
	public void test_paths_1_x_2() {
		assertEquals(3, Problem15.paths(point(0,0), point(1,2)));
	}
	
	@Test
	public void test_paths_2_x_3() {
		assertEquals(10, Problem15.paths(point(0,0), point(2,3)));
	}
	
	private static Point point(int x, int y) {
		return Point.make(x, y);
	}
	
}
