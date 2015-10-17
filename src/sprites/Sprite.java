package sprites;

public abstract class Sprite {
	protected char symbol;
	protected int row, col;
	
	
	public Sprite(char symbol, int row, int col) {
		this.symbol = symbol;
		this.row = row;
		this.col = col;
		
	}
	
	public char getSymbol() {
		return this.symbol;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.col;
	}
	
	public String toString() {
		return "" + this.symbol;
	}
	
	
}
