package sprites;

import game.Constants;

public class Vacuum extends Sprite implements Moveable {
	private int score;
	private int capacity;
	private int fullness;
	private Sprite under;
	
	public Vacuum (char symbol, int row, int column, int capacity) {
		super (symbol, row, column);
		this.capacity = capacity;
		this.under = new CleanHallway(Constants.CLEAN, row, column);
	}
		
	public int getCapacity() {
		return this.capacity;
		
	}
	public int getFullNess() {
		return this.fullness;
	}
	
	public void setFullness() {
		this.fullness = fullness;
	}

	public boolean clean (int score) {
		if (fullness < capacity) {
			this.score += score;
			this.fullness += Constants.FULLNESS_INC;
			return true;
		}
		return false;
	}
	public void empty() {
		this.fullness = 0;
		
	}
	
	public int getScore() {
		return this.score;
		
	}
	public void setUnder(Sprite under) {
		this.under = under;
	}
	
	public Sprite getUnder() {
		return this.under;
	}
	
	@Override
	public void moveTo(int row, int column) {
		this.row = row;
		this.col = column;
	}
}
