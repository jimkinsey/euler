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
	
	@Test(expected=IllegalArgumentException.class)
	public void row_with_too_few_cells() {
		new Triangle("01\n02");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void row_with_too_many_cells() {
		new Triangle("01\n02 03 04");
	}
	
	@Test
	public void max_path_value_of_triangle_with_one_row() {
		Triangle triangle = new Triangle("01");
		assertEquals(1, triangle.maxPathValue());
	}
	
	@Test
	public void max_path_value_of_triangle_with_two_rows() {
		Triangle triangle = new Triangle("01\n02 03");
		assertEquals(4, triangle.maxPathValue());
	}
	
	@Test
	public void max_path_value_of_triangle_with_three_rows() {
		Triangle triangle = new Triangle("01\n02 03\n04 05 06");
		assertEquals(10, triangle.maxPathValue());
	}
	
	@Test
	public void max_path_value_using_example_data() {
		Triangle triangle = new Triangle("3\n7 4\n2 4 6\n8 5 9 3");
		assertEquals(23, triangle.maxPathValue());
	}
	
	@Test
	public void sub_triangle_at_0_0_is_same_triangle() {
		Triangle triangle = new Triangle("01\n02 03");
		assertEquals(triangle, triangle.subTriangle(0, 0));
	}
	
	@Test
	public void sub_triangle_with_one_row() {
		Triangle triangle = new Triangle("01\n02 03");
		assertEquals(new Triangle("02"), triangle.subTriangle(1, 0));
	}
	
	@Test
	public void sub_triangle_with_two_rows() {
		Triangle triangle = new Triangle("01\n02 03\n04 05 06");
		assertEquals(new Triangle("02\n04 05"), triangle.subTriangle(1, 0));
		assertEquals(new Triangle("03\n05 06"), triangle.subTriangle(1, 1));
	}
	
}
