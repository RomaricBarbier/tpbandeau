package exp;

import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;


public abstract class Effet {
	 	public Bandeau bandeau;
	    protected int repetitions;
	    protected String message;
	    protected Color couleur;

		public Effet( Bandeau bandeau, String message,Color couleur) {
			this.bandeau = bandeau;
			this.message = message;
			this.couleur = couleur;
		}
	    public Effet(int repetitions, Bandeau bandeau, String message) {
	        this.repetitions = repetitions;
	        this.bandeau = bandeau;
	        this.message = message;
	    }

	    public abstract void afficher();
}