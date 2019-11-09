package eni.formation.fourmilangton.bll;

import javax.swing.Timer;

import eni.formation.fourmilangton.bo.GridGenerator;

public interface Jeu{
	public void setGridGenerator(GridGenerator gridGenerator);
	public GridGenerator getGridGenerator();
	public void setTimerDeplacement(Timer timerDeplacement) ;
	public Timer getTimerDeplacement();
	public void play() ;
	public int getTurn();
}
