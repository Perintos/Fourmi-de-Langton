package eni.formation.fourmilangton.bo;

import java.awt.Color;
import java.awt.Graphics2D;

public class GridGenerator {
	private boolean grid[][];
	private int row;
	private int col;
	private int cellDim = 10;						//Dimension d'une cellule en pixel (cellules de 10x10 px) 
	public static final int DECALLAGE_GRILLE=0;		//d�callage de la grille sur le panel graphics
	private Fourmi fourmi; 

	public GridGenerator(int row, int col) {
		this.row = row;
		this.col = col;
		this.grid = new boolean[row][col];
		this.fourmi = new Fourmi(row/2, col/2, 0, 1, this.cellDim/4*3);
		
		for(int i = 0 ; i < this.row ; ++i) {
			for(int j = 0 ; j < this.col ; ++j) {
				this.grid[i][j] = false;
			}
		}	
	}
	
	public boolean[][] getGrid() {
		return this.grid;
	}
	
	public void setGrid(boolean[][] grid) {
		this.grid = grid;
	}

	public void drawGrid(Graphics2D g) {
		
		for(int i = 0 ; i < this.row ; i++) {
			for(int j = 0 ; j<this.col ; j++) {
				
				if(this.grid[j][i] == false) {
					g.setColor(Color.BLACK);
					g.drawRect(i*cellDim+DECALLAGE_GRILLE, j*cellDim+DECALLAGE_GRILLE, this.cellDim, this.cellDim);
				}
				else {
					g.setColor(Color.BLACK);
					g.fillRect(i*cellDim+DECALLAGE_GRILLE, j*cellDim+DECALLAGE_GRILLE, this.cellDim, this.cellDim);
				}
			}
		}
		
		g.setColor(Color.RED);
		g.fillOval(this.fourmi.getPosY()*this.cellDim+DECALLAGE_GRILLE+this.fourmi.getCote()/4, 
				this.fourmi.getPosX()*this.cellDim + DECALLAGE_GRILLE+this.fourmi.getCote()/4, this.fourmi.getCote(), this.fourmi.getCote());
		
		g.setColor(Color.BLACK);
		g.drawOval(this.fourmi.getPosY()*this.cellDim+DECALLAGE_GRILLE+this.fourmi.getCote()/4, 
				this.fourmi.getPosX()*this.cellDim + DECALLAGE_GRILLE+this.fourmi.getCote()/4, this.fourmi.getCote(), this.fourmi.getCote());
	}

	public void changeValue(int i, int j) {
		try{
			if(this.grid[i][j])
			this.grid[i][j] = false;
		else
			this.grid[i][j] = true;
		}catch (Exception e) {
			System.out.println("erreur");
		}
	}

	public boolean getCell(int i, int j) {
		
		return this.grid[i][j];
	}
	
	public int getCellDimension() {
		return this.cellDim;
	}

	public static int getDecallageGrille() {
		return DECALLAGE_GRILLE;
	}

	public Fourmi getFourmi() {
		return fourmi;
	}
}
