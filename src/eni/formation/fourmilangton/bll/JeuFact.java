package eni.formation.fourmilangton.bll;

public class JeuFact {
	public static Jeu getInstance() {
		return new JeuImpl();
	}
}
