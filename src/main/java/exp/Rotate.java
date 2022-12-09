package exp;

import bandeau.Bandeau;

public class Rotate extends Effet {

    public Rotate(int repetitions, Bandeau bandeau, String message) {
        super(repetitions, bandeau, message);
    }
    public void afficher() {
        bandeau.setMessage(message);
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 0; i <= 100; i++) {
                this.bandeau.setRotation(2 * Math.PI * i / 100);
                this.bandeau.sleep(100);
            }
        }
    }
}