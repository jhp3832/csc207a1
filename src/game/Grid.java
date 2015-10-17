package game;

public interface Grid<T> {
	public void setCell(int row, int column, T item);
	public T getcell(int row, int column);
	public int getNumRows();
	public int getNumColumns();
	public boolean equals(Object other);
	public String toString();
	
}
