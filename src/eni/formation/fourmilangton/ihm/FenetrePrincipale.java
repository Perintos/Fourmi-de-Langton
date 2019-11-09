package eni.formation.fourmilangton.ihm;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame {
	private final static int COTE = 1050;
	
	public FenetrePrincipale() {
		
	    this.setTitle("Fourmi de Langton");
	    this.setSize(COTE, COTE);
	    this.setBackground(Color.WHITE);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    
	    this.setVisible(true);
		
		initIhm();
	}

	private void initIhm() {
		JPanel pan= new PanelGraphics();
		
		this.setContentPane(pan);
	}
}
