package kinsey.jim.euler;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	private List<List<Integer>> rows = new ArrayList<List<Integer>>();
	
	public Triangle(String triangleData) {
		if (triangleData.isEmpty())
			throw new IllegalArgumentException();
		rows = parseData(triangleData);
	}

	private List<List<Integer>> parseData(String triangleDefinition) {
		List<List<Integer>> rows = new ArrayList<List<Integer>>();
		String[] rowDefinitions = triangleDefinition.split("\n");
		for (String row : rowDefinitions)
			rows.add(parseRow(row));
		return rows;
	}

	private List<Integer> parseRow(String rowDefinition) {
		List<Integer> row = new ArrayList<Integer>();
		String[] cellDefinitions = rowDefinition.split(" ");
		for (String cellDefinition : cellDefinitions)
			row.add(Integer.valueOf(cellDefinition));
		return row;
	}
		
	public int get(int row, int column) {
		return rows.get(row).get(column);
	}
}