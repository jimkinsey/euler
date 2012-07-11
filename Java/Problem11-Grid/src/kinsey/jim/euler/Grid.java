package kinsey.jim.euler;

import java.util.ArrayList;
import java.util.List;

public class Grid<T> {

	final int width;
	final int height;
		
	public Grid(int width, int height) {
		this.width = width;
		this.height = height;
		initialiseGrid();
	}
	
	public T get(int x, int y) {
		return points.get(x).get(y);
	}

	public void set(int x, int y, T value) {
		points.get(x).add(y, value);
	}

	public List<T> getLine(int x1, int y1, int length, Direction direction) {
		List<T> line = new ArrayList<T>();
		
		for (int x = x1, y = y1; line.size() < length; x += direction.deltaX(), y += direction.deltaY()) {
			line.add(get(x,y));
		}
		
		return line;
	}
	
	public enum Direction {
		
		N,NE,E,SE,S,SW,W,NW;
		
		public int deltaX() {
			switch(this) {
				case N:
				case S:
					return 0;
				case NE:
				case E:
				case SE:
					return 1;
				case NW:
				case W:
				case SW:
					return -1;
			}
			
			return 0;
		}
		
		public int deltaY() {
			switch(this) {
				case E:
				case W:
					return 0;
				case SW:
				case S:
				case SE:
					return 1;
				case NW:
				case N:
				case NE:
					return -1;
			}
			
			return 0;
		}
	}

	private List<List<T>> points;
	
	private void initialiseGrid() {
		points = new ArrayList<List<T>>();
		for (int x = 0; x < width; x++) {
			List<T> column = new ArrayList<T>();
			points.add(column);
			for (int y = 0; y < height; y++) {
				column.add(null);
			}
		}
	}
				
}
