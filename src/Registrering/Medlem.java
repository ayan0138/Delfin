
//SUPERCLASS
package Registrering;


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
    public Medlem() {
        this.navn = navn;
        this.alder = alder;
        this.køn = køn;
        this.tlfnr = tlfnr;
        this.cprnr = cprnr;
        this.adresse = adresse;
        this.medlemstype = medlemstype;
        this.svømmehold = svømmehold;
        this.svømmedeciplin = svømmedeciplin;
    } //getter og setter metode

    public Medlem(String navn, int alder, String køn) {
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public int getAlder() {
        return alder;
    }
    public void setAlder(int alder) {
        this.alder = alder;
    }
    public String getKøn() {
        return køn;
    }
    public void setKøn(String køn) {
        this.køn = køn;
    }
    public int getTlfnr()  {
        return tlfnr;
    }
    public void setTlfnr (int tlfnr) {
        this.tlfnr = tlfnr;

    }
    public String getCprnr()  {
        return cprnr;
    }
    public void setCprnr (String cprnr) {
        this.cprnr = cprnr;
    }
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMedlemstype() {
        return medlemstype;
    }

    public void setMedlemstype(String medlemstype) {
        this.medlemstype = medlemstype;
    }

    public String getSvømmehold() {
        return svømmehold;
    }

    public void setSvømmehold(String svømmehold) {
        this.svømmehold = svømmehold;
    }

    public String getSvømmedeciplin() {
        return svømmedeciplin;
    }

    public void setSvømmedeciplin(String svømmedeciplin){
        this.svømmedeciplin = svømmedeciplin;
    }
    //display medleminfo
    public void displayInfo() {
        System.out.println("navn: " + navn + "alder: " + alder + "køn " + køn );
    }


    // Metode til at beregne pris
    public double beregnPris() {
        double pris = 0.0;
        if (medlemstype.equalsIgnoreCase("passiv")) {
            return 500;
        } else if (alder < 18) {
            return 1000;
        } else if (alder >= 60) {
            return (1600 * 0.75);
        } else {
            return 1600;
        }

    }


//Restance metode
    private boolean harRestance; // Ny attribut

    // Getter og setter for restance
    public boolean isHarRestance() {
        return harRestance;
    }

    public void setHarRestance(boolean harRestance) {
        this.harRestance = harRestance;


}

}