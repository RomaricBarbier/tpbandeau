package exp;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class Couleur extends Effet {

	public Couleur( Bandeau bandeau, String message, Color couleur) {
		super( bandeau, message, couleur);
	}

	public void afficher() {
		bandeau.setMessage(message);
                this.bandeau.setForeground(couleur);
            }
	}