package kinsey.jim.euler.library;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static <E> E head(List<E> list) {
		if (list.size() == 0)
			return null;
		return list.get(0);
	}
	
	public static <E> List<E> tail(List<E> list) {
		if (list.size() == 0)
			return new ArrayList<E>();
		return list.subList(1, list.size());
	}
	
}
