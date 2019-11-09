package eni.formation.fourmilangton.bll;

import javax.swing.Timer;

import eni.formation.fourmilangton.bo.GridGenerator;

public class JeuImpl implements Jeu {
	Timer timerDeplacement;
	
	private GridGenerator grille;
	private int numTurn = 0;					//num�ro du tour �x�cut�
	
	public static final int TURN_MAX =20000; 	//nombre de tour a executer

	public void setGridGenerator(GridGenerator gridGenerator) {
		this.grille = gridGenerator;
	}
	
	public GridGenerator getGridGenerator() {
		return this.grille;
	}
	
	public Timer getTimerDeplacement() {
		return timerDeplacement;
	}

	public void setTimerDeplacement(Timer timerDeplacement) {
		this.timerDeplacement = timerDeplacement;
	}

	public void play() {	//execution d'un tour de jeu
		
		if(this.numTurn <= TURN_MAX) {
			try {
								this.grille.changeValue(this.grille.getFourmi().getPosX(),this.grille.getFourmi().getPosY());
				
				if(this.grille.getCell(this.grille.getFourmi().getPosX(),this.grille.getFourmi().getPosY())) {
					this.grille.getFourmi().goRight();
					this.grille.getFourmi().go();
				}
				else {
					this.grille.getFourmi().goLeft();
					this.grille.getFourmi().go();
				}
				
				this.numTurn++;
			} catch(ArrayIndexOutOfBoundsException e) {
				this.timerDeplacement.stop();
				System.out.println("Simulation complete !");
			}
		}
	}

	public int getTurn() {
		return this.numTurn ;
	}
}
