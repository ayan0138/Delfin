
//SUPERCLASS
package Registrering;

//Superklasse
public class Medlem {

    private String navn;
    private int alder;
    private String køn;
    private int tlfnr;
    private String cprnr;
    private String adresse;
    private String medlemstype; //Aktiv - passiv
    private String svømmehold;
    private String svømmedeciplin;

    //paramariseret konstuktør
    public Medlem(String navn, int alder, String køn, int tlfnr, String cprnr, String adresse,
                  String medlemstype, String svømmehold, String svømmedeciplin) {
        this.navn = navn;
        this.alder = alder;
        this.køn = køn;
        this.tlfnr = tlfnr;
        this.cprnr = cprnr;
        this.adresse = adresse;
        this.medlemstype = medlemstype;
        this.svømmehold = svømmehold;
        this.svømmedeciplin = svømmedeciplin;
    }

    // Metode til at beregne pris
    public double beregnPris() {
        double pris = 0.0;
        if (medlemstype.equalsIgnoreCase("passive")) {
            return 500;
        } else if (alder < 18) {
            return 1000;
        } else if (alder >= 60) {
            return (1600 * 0.75);
        } else {
            return 1600;
        }
    }
}
