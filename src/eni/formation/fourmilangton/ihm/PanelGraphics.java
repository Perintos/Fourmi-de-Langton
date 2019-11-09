package eni.formation.fourmilangton.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import javax.swing.JPanel;

import eni.formation.fourmilangton.bll.Jeu;
import eni.formation.fourmilangton.bll.JeuFact;
import eni.formation.fourmilangton.bo.GridGenerator;

@SuppressWarnings("serial")
public class PanelGraphics extends JPanel implements ActionListener {
	private Jeu jeu;
	private static final int COTE = 100;				//nombre de cellule par cot� (grille de 100 par 100 cellules)
	public static final int  PosXDepart = COTE/2 ;		//pos x de la foumis au d�part sur la grille
	public static final int  PosYDepart = COTE/2;		//pos y de la fourmis au d�part sur la grille
	public static final int  TEMPS_PAR_TOUR = 5;		//execution des tour toutes les 10ms
	
	public PanelGraphics() {
		this.jeu = JeuFact.getInstance();
		this.jeu.setGridGenerator(new GridGenerator(COTE,COTE));
		this.jeu.setTimerDeplacement(new Timer(TEMPS_PAR_TOUR, this));
		
		this.jeu.getTimerDeplacement().start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		this.jeu.getGridGenerator().drawGrid((Graphics2D)g);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(String.valueOf(this.jeu.getTurn() ), this.getWidth()-this.getWidth()/10, 50);
	}

	public void actionPerformed(ActionEvent e) {
		this.jeu.play();
		this.repaint();
	}
}
