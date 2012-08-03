package kinsey.jim.euler;

import java.util.HashMap;
import java.util.Map;

public class Problem15 {

	public static void main(String[] args) {
		System.out.println(paths(Point.make(0,0), Point.make(20,20)));
	}
	
	public static long paths(Point start, Point finish) {
		if (start.x == finish.x || start.y == finish.y)
			return 1;
		return paths(start.nextX(), finish) + paths(start.nextY(), finish);
	}
	
	public static class Point {
		
		public final int x;
		public final int y;
		
		public static Point make(int x, int y) {
			if (hasCachedPoint(x, y))
				return getCachedPoint(x, y);
			return createAndCachePoint(x, y);
		}
		
		public Point nextX() {
			return make(x + 1, y);
		}
		
		public Point nextY() {
			return make(x, y + 1);
		}
		
		@Override
		public boolean equals(Object obj) {
			return (obj instanceof Point) && (((Point) obj).x == x) && (((Point) obj).y == y);
		}
		
		@Override
		public int hashCode() {
			return hash(x, y);
		}
		
		private static Map<Integer, Point> cache = new HashMap<Integer, Problem15.Point>();
		
		private static boolean hasCachedPoint(int x, int y) {
			return cache.containsKey(hash(x, y));
		}
		
		private static Point getCachedPoint(int x, int y) {
			return cache.get(hash(x, y));
		}
		
		private static Point createAndCachePoint(int x, int y) {
			Point point = new Point(x, y);
			cache.put(hash(x, y), point);
			return point;
		}

		private Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		private static int hash(int x, int y) {
			int hash = 1;
			hash = hash * 17 + x;
			hash = hash * 31 + y;
			return hash;
		}
		
	}

}
