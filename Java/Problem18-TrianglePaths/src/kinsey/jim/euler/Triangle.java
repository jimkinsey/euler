package kinsey.jim.euler;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	private List<List<Integer>> rows = new ArrayList<List<Integer>>();
	
	public Triangle(String triangleDefinition) {
		if (triangleDefinition.isEmpty())
			throw new IllegalArgumentException("Triangle string is empty");
		parseDefinition(triangleDefinition);
	}
	
	private Triangle(List<List<Integer>> rows) {
		this.rows = rows;
	}

	private void parseDefinition(String triangleDefinition) {
		rows = new ArrayList<List<Integer>>();
		for (String row : triangleDefinition.split("\n"))
			addRow(parseRow(row));
	}
	
	private void addRow(List<Integer> cells) {
		if (cells.size() != (rows.size() + 1))
			throw new IllegalArgumentException("Row " + rows.size() + " has wrong number of cells, expected " + (rows.size() + 1) + " got " + cells.size());
		rows.add(cells);
	}

	private List<Integer> parseRow(String cells) {
		List<Integer> row = new ArrayList<Integer>();
		for (String cell : cells.split(" "))
			row.add(Integer.valueOf(cell));
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
		List<List<Integer>> subTriangleRows = new ArrayList<List<Integer>>();
		for (int i = row; i < rows.size(); i++)
			subTriangleRows.add(rows.get(i).subList(column, column + (i - row) + 1));
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