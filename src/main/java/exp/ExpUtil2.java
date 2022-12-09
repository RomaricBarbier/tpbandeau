package exp;

import bandeau.Bandeau;
import java.awt.Color;

public class ExpUtil2 {
	  
	  public static void main(String[] args) {
      Bandeau monBandeau = new Bandeau();
      Scenario monscenario = new Scenario(monBandeau);
      Color couleur =  Color.RED;
      monscenario.addEffet(new Zoom(3, monBandeau, "Zoomons"));
     // monscenario.addEffet(new Rotate(2, monBandeau, "On tourne"));
      monscenario.addEffet(new Clignotant(3, monBandeau, "Clignote"));
      monscenario.addEffet(new Couleur(monBandeau, "Changeons de couleurs", couleur));
      monscenario.afficherScenario();
	  }
}