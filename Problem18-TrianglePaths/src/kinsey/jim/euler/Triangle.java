package kinsey.jim.euler;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	private List<List<Integer>> rows = new ArrayList<List<Integer>>();
	
	public Triangle(String triangleDefinition) {
		if (triangleDefinition.isEmpty())
			throw new IllegalArgumentException();
		rows = parseDefinition(triangleDefinition);
	}
	
	private Triangle(List<List<Integer>> rows) {
		this.rows = rows;
	}

	private List<List<Integer>> parseDefinition(String triangleDefinition) {
		List<List<Integer>> rows = new ArrayList<List<Integer>>();
		String[] rowDefinitions = triangleDefinition.split("\n");
		for (String rowDefinition : rowDefinitions)
			rows.add(parseRow(rowDefinition));
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

	public long maxPathValue() {
		if (rows.size() == 1)
			return get(0,0);
		long max = get(0,0);
		max += Math.max(subTriangle(1,0).maxPathValue(), subTriangle(1,1).maxPathValue());
		return max;
	}
	
	public Triangle subTriangle(int row, int column) {
		if (row == 0)
			return this;
		List<List<Integer>> subTriangleRows = new ArrayList<List<Integer>>();
		for (int i = row; i < rows.size(); i++)
			subTriangleRows.add(rows.get(i).subList(column, (i - row) + 1 + column));
		return new Triangle(subTriangleRows);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Triangle)
			return ((Triangle) obj).rows.equals(this.rows);
		return false;
	}
	
	@Override
	public int hashCode() {
		return 23 + (17 * rows.hashCode());
	}
	
	@Override
	public String toString() {
		StringBuilder toStringBuilder = new StringBuilder();
		for (List<Integer> row : rows)
			toStringBuilder.append(row);
		return toStringBuilder.toString();
	}
}