/** Pilote du programme */
public class Main {
    public static void main(String[] args) {
        // créer des instances de l'objet
        HdmiPort hdmi1 = new HdmiPort();
        HdmiPort hdmi2 = new HdmiPort();

        // utiliser les comportements de l'objet
        hdmi2.damage();
        hdmi2.connect("Big monitor");
        hdmi1.connect("TV");


        // afficher le statut des attributs de l'objet
        System.out.println("HDMI1");
        System.out.println(hdmi1);

        System.out.println("HDMI2");
        System.out.println(hdmi2);

        System.out.println("HDMI1 le même que HDMI2?");
        System.out.println(hdmi1.equals(hdmi2));
    }
