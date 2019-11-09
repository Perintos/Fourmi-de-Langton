package eni.formation.fourmilangton.util;

public enum Direction {
	NORTH(-1,0),
	SOUTH(+1,0),
	EAST(0,+1),
	WEST(0,-1);
	
	private int dirX;
	private int dirY;
	
	Direction(int dirX, int dirY) {
		this.dirX = dirX;
		this.dirY = dirY;
	}

	public int getDirX() {
		return dirX;
	}

	public int getDirY() {
		return dirY;
	}	
}
