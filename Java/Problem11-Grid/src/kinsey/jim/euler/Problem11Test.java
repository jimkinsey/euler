package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;
import kinsey.jim.euler.library.Grid;

import org.junit.Test;

public class Problem11Test {

	@Test
	public void test_populateGrid_1x1() {
		Grid<Integer> grid = new Grid<Integer>(1, 1);
		Problem11.populateGridFromString(grid, "00");
		assertEquals(0, grid.get(0, 0).intValue());
	}

	@Test
	public void test_populateGrid_2x1() {
		Grid<Integer> grid = new Grid<Integer>(2, 1);
		Problem11.populateGridFromString(grid, "01 02");
		assertEquals(1, grid.get(0, 0).intValue());
		assertEquals(2, grid.get(1, 0).intValue());		
	}

	@Test
	public void test_populateGrid_2x2() {
		Grid<Integer> grid = new Grid<Integer>(2, 2);
		Problem11.populateGridFromString(grid, "01 02 03 04");
		assertEquals(1, grid.get(0, 0).intValue());
		assertEquals(2, grid.get(1, 0).intValue());
		assertEquals(3, grid.get(0, 1).intValue());
		assertEquals(4, grid.get(1, 1).intValue());		
	}
}
