/** Une classe qui définit un objet simple */
public class HdmiPort {

    public static void main(String[] args) {
  // attributs
  boolean functioning;
  String connectedTo;

  // Constructeurs

  HdmiPort() {
      // Initialiser les valeurs par défaut directement
      // functioning = true;
      // connectedTo = "None";

      // Utiliser l'autre constructeur en lui passant les 
      // valeurs par défaut
      this(true, "None");
  }

  HdmiPort(boolean functioning, String connectedTo){
      // this. fait référence à l'objet (ses attributs)
      // ce qui différencie les deux mots functioning
      // this.functioning : attribut de l'objet
      // functionion : valeur passée via le paramètre
      this.functioning = functioning;
      this.connectedTo = connectedTo;
  }


  // comportements
  public void damage() {
      functioning = false;
  }
  public void repair() {
      functioning = true;
  }

  public void connect(String device) {
      connectedTo = device;
  }
  public void disconnect() {
      connectedTo = "None";
  }

  @Override
  public String toString() {
      String output = "";
      output += "Functioning? " + this.functioning + "; ";
      output += "Connected to: " + this.connectedTo + "\n";
      
      return output; 
  }

  @Override
  public boolean equals(Object otherPort){
      // même objet en mémoire 
      if (this == otherPort){
          return true;
      }

      // pas un HdmiPort
      if (!(otherPort instanceof HdmiPort)){
          return false;
      }

      // c'est un HdmiPort alors on compare les valeurs
      HdmiPort o = (HdmiPort)otherPort;

      return o.functioning == this.functioning
          && (o.connectedTo).equals(this.connectedTo); 
    }
}