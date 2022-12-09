package exp;
import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;
public class ExpUtil {

    public static void main(String[] args) {
        new ExpUtil().exp();
    }

    public void exp() {


        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();


        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Bonjour");
        monBandeau.sleep(1000);
        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("Tournons");
        monBandeau.sleep(1000);
        monBandeau.setMessage("de 90°");
        monBandeau.setRotation(Math.PI / 1.0f);
        monBandeau.sleep(1000);
        monBandeau.setRotation(0.0f);

        monBandeau.setMessage("Changeons de police");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Mettons une police Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("Maintenant SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoomons");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom...");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);
        monBandeau.setFont(new Font("Dialog", Font.BOLD, 20));

        monBandeau.setMessage("Changons la couleur du background");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("Changons de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Fin");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}