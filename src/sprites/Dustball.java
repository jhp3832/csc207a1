package sprites;

public class Dustball extends Dirt implements Moveable{
	public Dustball (char symbol, int row, int col, int value) {
		super (symbol, row, col, value);
	}	
	
	@Override
	public void moveTo(int row, int column) {
		this.row = row;
		this.col = column;
	}
}
