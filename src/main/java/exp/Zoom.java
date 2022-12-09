package exp;

import java.awt.Font;
import bandeau.Bandeau;


public class Zoom extends Effet {

    public Zoom(int repetitions, Bandeau bandeau, String message) {
        super(repetitions, bandeau, message);

    }
    public void afficher() {
        bandeau.setMessage(message);
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 5; i < 60; i += 5) {
                this.bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
                this.bandeau.sleep(100);
            }
        }
    }
}