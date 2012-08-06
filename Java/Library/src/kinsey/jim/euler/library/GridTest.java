package kinsey.jim.euler.library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import kinsey.jim.euler.library.Grid.Direction;

import org.junit.Test;

public class GridTest {

	@Test
	public void test_grid_initialisation_1x1() {
		Grid<Integer> grid = new Grid<Integer>(1,1);
		
		assertEquals(1, grid.width);
		assertEquals(1, grid.height);
		assertNull(grid.get(0, 0));
	}
	

	@Test
	public void test_grid_initialisation_2x2() {
		Grid<Integer> grid = new Grid<Integer>(2,2);
		
		assertEquals(2, grid.width);
		assertEquals(2, grid.height);
		
		assertNull(grid.get(0, 0));
		assertNull(grid.get(1, 0));
		assertNull(grid.get(0, 1));
		assertNull(grid.get(1, 1));
	}
	
	@Test
	public void test_get_line_0_0_1_N() {
		Grid<Integer> grid = new Grid<Integer>(1,1);
		grid.set(0,0,7);
		List<Integer> line = grid.getLine(0,0,1,Direction.N);
		assertEquals(1, line.size());
		assertEquals(7, line.get(0).intValue());
	}
	
	@Test
	public void test_get_line_0_0_2_SE() {
		Grid<Integer> grid = new Grid<Integer>(2,2);
		grid.set(0,0,7);
		grid.set(1,0,5);
		grid.set(0,1,3);
		grid.set(1,1,2);
		List<Integer> line = grid.getLine(0,0,2,Direction.SE);
		assertEquals(2, line.size());
		assertEquals(7, line.get(0).intValue());
		assertEquals(2, line.get(1).intValue());
	}
	
	@Test
	public void test_get_line_0_0_3_E() {
		Grid<Integer> grid = new Grid<Integer>(3,1);
		grid.set(0,0,7);
		grid.set(1,0,5);
		grid.set(2,0,3);
		List<Integer> line = grid.getLine(0,0,3,Direction.E);
		assertEquals(3, line.size());
		assertEquals(7, line.get(0).intValue());
		assertEquals(5, line.get(1).intValue());
		assertEquals(3, line.get(2).intValue());
	}
	
	@Test
	public void test_get_line_2_0_3_W() {
		Grid<Integer> grid = new Grid<Integer>(3,1);
		grid.set(0,0,7);
		grid.set(1,0,5);
		grid.set(2,0,3);
		List<Integer> line = grid.getLine(2,0,3,Direction.W);
		assertEquals(3, line.size());
		assertEquals(3, line.get(0).intValue());
		assertEquals(5, line.get(1).intValue());
		assertEquals(7, line.get(2).intValue());
	}
	
}
