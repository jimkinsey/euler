package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

	@Test(expected=IllegalArgumentException.class)
	public void triangle_with_no_rows() {
		new Triangle("");
	}
	
	@Test
	public void triangle_with_one_row_containging_01() {
		Triangle triangle = new Triangle("01");
		assertEquals(1, triangle.get(0,0));
	}
	
	@Test
	public void triangle_with_one_row_containing_02() {
		Triangle triangle = new Triangle("02");
		assertEquals(2, triangle.get(0,0));
	}
	
	@Test
	public void triangle_with_two_rows() {
		Triangle triangle = new Triangle("01\n02 03");
		assertEquals(3, triangle.get(1,1));
	}
	
}
