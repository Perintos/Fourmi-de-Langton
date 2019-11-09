package eni.formation.fourmilangton.ihm;

import javax.swing.SwingUtilities;

/*	Thomas CHATEAU
 * 	Fourmi de Langton
 * 	https://www.youtube.com/watch?v=qZRYGxF6D3w&t=151s
 * 	18/08/2019
 */

public class Demo {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				FenetrePrincipale frame = new FenetrePrincipale();
				frame.setVisible(true);
				
			}
		});
	}
}
