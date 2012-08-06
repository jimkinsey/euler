package kinsey.jim.euler;

import java.util.HashMap;
import java.util.Map;

public class Problem15 {

	public static void main(String[] args) {
		System.out.println(paths(Point.make(0,0), Point.make(20,20)));
	}
	
	public static long paths(Point start, Point finish) {
		if (isCached(start, finish))
			return getCachedPaths(start, finish);
		if (start.x == finish.x || start.y == finish.y)
			return cachePaths(start, finish, 1);
		return cachePaths(start, finish, paths(start.nextX(), finish) + paths(start.nextY(), finish));
	}

	private static Map<Integer, Long> pathCache = new HashMap<Integer, Long>();

	private static boolean isCached(Point start, Point finish) {
		return pathCache.containsKey(hash(start, finish));
	}
	
	private static long getCachedPaths(Point start, Point finish) {
		return pathCache.get(hash(start, finish));
	}
	
	private static long cachePaths(Point start, Point finish, long paths) {
		pathCache.put(hash(start, finish), paths);
		return paths;
	}
	
	private static int hash(Point start, Point finish) {
		int hash = 1;
		hash = hash * 17 + start.hashCode();
		hash = hash * 17 + finish.hashCode();
		return hash;
	}

}
