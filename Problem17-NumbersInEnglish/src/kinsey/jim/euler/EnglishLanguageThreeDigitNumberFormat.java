package kinsey.jim.euler;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Map;

class EnglishLanguageThreeDigitNumberFormat extends NumberFormat {
	private static final Map<Long, String> namedNumbers = new HashMap<Long, String>();

	@Override
	public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
		StringBuffer result = new StringBuffer();
		appendHundreds(result, number);
		appendTensAndUnits(result, number);
		return result;
	}
	
	private void appendHundreds(StringBuffer buffer, long number) {
		long hundreds = number / 100;
		
		if (hundreds > 0) {
			buffer.append(getNumberName(hundreds));
			buffer.append(" hundred");
			long tensAndUnits = number % (hundreds * 100);
			if (tensAndUnits > 0) {
				buffer.append(" and ");
			}
		}
	}

	private void appendTensAndUnits(StringBuffer buffer, long number) {
		long units = (number % 10);
		long tens = ((number % 100) - units) / 10;
		
		if (tens >= 2) {
			buffer.append(getNumberName(tens * 10));
			if (units > 0) {
				buffer.append("-");
				buffer.append(getNumberName(units));
			}
		} else if (units > 0) {
			long tensAndUnits = (tens * 10) + units;
			buffer.append(getNumberName(tensAndUnits));
		}
	}
	
	private String getNumberName(long number) {
		if (namedNumbers.containsKey(number))
			return namedNumbers.get(number);
		throw new IllegalArgumentException("Number " + number + " does not have a unique name");
	}
	
	static {
		namedNumbers.put(0l, "zero");
		namedNumbers.put(1l, "one");
		namedNumbers.put(2l, "two");
		namedNumbers.put(3l, "three");
		namedNumbers.put(4l, "four");
		namedNumbers.put(5l, "five");
		namedNumbers.put(6l, "six");
		namedNumbers.put(7l, "seven");
		namedNumbers.put(8l, "eight");
		namedNumbers.put(9l, "nine");
		namedNumbers.put(10l, "ten");
		namedNumbers.put(11l, "eleven");
		namedNumbers.put(12l, "twelve");
		namedNumbers.put(13l, "thirteen");
		namedNumbers.put(14l, "fourteen");
		namedNumbers.put(15l, "fifteen");
		namedNumbers.put(16l, "sixteen");
		namedNumbers.put(17l, "seventeen");
		namedNumbers.put(18l, "eighteen");
		namedNumbers.put(19l, "nineteen");
		namedNumbers.put(20l, "twenty");
		namedNumbers.put(30l, "thirty");
		namedNumbers.put(40l, "forty");
		namedNumbers.put(50l, "fifty");
		namedNumbers.put(60l, "sixty");
		namedNumbers.put(70l, "seventy");
		namedNumbers.put(80l, "eighty");
		namedNumbers.put(90l, "ninety");
	}

	@Override
	public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Number parse(String source, ParsePosition parsePosition) {
		throw new UnsupportedOperationException();
	}

}
