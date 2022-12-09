package exp;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Scenario {
	
	  private Bandeau bandeau;
	    ArrayList<Effet> mesEffets = new ArrayList<Effet>();

	    public Scenario(Bandeau bandeau) {
	        this.bandeau = bandeau;
	    }

	    public void addEffet(Effet mesEffets) {
	        this.mesEffets.add(mesEffets);
	    }

	    public void afficherScenario() {
	        for (Effet e : mesEffets) {
	            e.afficher();
	            bandeau.sleep(1000);
	        }
	        bandeau.close();  
	    }
}