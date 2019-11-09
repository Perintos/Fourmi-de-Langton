package eni.formation.fourmilangton.bo;

import eni.formation.fourmilangton.util.Direction;

public class Fourmi {
	private int posX;
	private int posY;
	private Direction direction;
	private int cote;
	
	public Fourmi(int posX, int posY, int dirX, int dirY, int cote) {
		this.posX = posX;
		this.posY = posY;
		this.cote = cote;
		this.direction = Direction.NORTH;
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}
	
	public int getCote() {
		return cote;
	}

	public void goRight() {							//s'orienter � droite
		if(this.direction == Direction.NORTH)
			this.direction = Direction.EAST;

		else if(this.direction == Direction.EAST)
			this.direction = Direction.SOUTH;

		else if(this.direction == Direction.SOUTH)
			this.direction = Direction.WEST;

		else if(this.direction == Direction.WEST)
			this.direction = Direction.NORTH;
	}

	public void goLeft() {							//s'orienter � gauche
		if(this.direction == Direction.NORTH)
			this.direction = Direction.WEST;

		else if(this.direction == Direction.WEST)
			this.direction = Direction.SOUTH;

		else if(this.direction == Direction.SOUTH)
			this.direction = Direction.EAST;

		else if(this.direction == Direction.EAST)
			this.direction = Direction.NORTH;
	}

	public void go() {								//Avancer de une case
		this.posX += this.direction.getDirX();
		this.posY += this.direction.getDirY();
		
	}
}
