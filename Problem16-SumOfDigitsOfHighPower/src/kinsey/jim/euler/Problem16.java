package kinsey.jim.euler;

import static kinsey.jim.euler.library.NumberLists.sum;
import static kinsey.jim.euler.library.Numbers.getDigits;
import static kinsey.jim.euler.library.Numbers.pow;

public class Problem16 {

	public static void main(String[] args) {
		String problemNumber = pow("2", 1000);
		System.out.println(sum(getDigits(problemNumber)));
	}

}
