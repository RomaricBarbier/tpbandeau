package exp;

import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;

public class Couleur extends Effet {

	public Couleur( Bandeau bandeau, String message, Color couleur) {
		super( bandeau, message, couleur);
	}

	public void afficher() {
		bandeau.setMessage(message);
		this.bandeau.setForeground(couleur);
	}
}