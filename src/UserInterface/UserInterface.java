package UserInterface;

import Registrering.Medlem;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private List<Medlem> medlemmer;

public UserInterface(){
    this.medlemmer = new ArrayList<>();
}
public void start(){
    Scanner scanner = new Scanner(System.in);
while (true) {
    System.out.println("Registering af medlem");
    System.out.println("Prisliste");
    System.out.println("Restance");
    System.out.println("Luk");
    System.out.println("Valg en af mulighederne");
    int valg = scanner.nextInt();
    scanner.nextLine();
    switch(valg){
        case 1: Medlem(scanner);
            break;

        case 2: beregnPris();
            break;

        case 3:
            break;

        case 4:
            break;

        default:
            System.out.println();
    }
  }
}
//lav en metode der registrerer medlem() / Medlems registering af nye medlemmer via input
public void registeremedlem(Scanner scanner) {

    System.out.println("Indtast navn:");
    String navn = scanner.nextLine();

    System.out.println("Indtast alder");
    int alder = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Indtast køn");
    String køn = scanner.nextLine();

    System.out.println("Indtast tlf-nr");
    int tlfnr = scanner.nextInt();

    System.out.println("Indtast adresse");

    System.out.println("Indtast medlemstype");

    System.out.println("Indtast svømmehold");
}

    //get/setter for at sikre encapsulation
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
    public int getCprnr()  {
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

    public int beregnAlder(int fødselsårr) {
        int nuværendeår = LocalDate.now().getYear();
        return nuværendeår - fødselsårr;

    }
}
