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
        String svømmehold = scanner.nextLine();

        System.out.println("Indtast svømmedeciplin");
        String svømmedeciplin = scanner.nextLine();

        System.out.println("Har medlemmet restance? (Ja/Nej):");
        String restanceSvar = scanner.nextLine();
        boolean harRestance = restanceSvar.equalsIgnoreCase("Ja");


        Medlem medlem = new Medlem();
        medlem.setNavn(navn);
        medlem.setAlder(alder);
        medlem.setKøn(køn);
        medlem.setTlfnr(tlfnr);
        medlem.setCprnr(cprnr);
        medlem.setAdresse(adresse);
        medlem.setMedlemstype(medlemstype);
        medlem.setSvømmehold(svømmehold);
        medlem.setSvømmedeciplin(svømmedeciplin);
        medlem.setHarRestance(harRestance);

        medlemmer.add(medlem);
        System.out.println("Medlem registreret: + " + medlem.getNavn());
    }

    public void visPrisliste() {
        if (medlemmer.isEmpty()) {
            System.out.println("ingen medlemmer endnu");
            return;
        }
        System.out.println("Prisliste for medlemmer:");
        for (Medlem medlem : medlemmer) {
            System.out.println("Navn: " + medlem.getNavn() + ", Pris: " + medlem.beregnPris() + "kr.");
        }
    }

    public void visMedlemmerMedRestance() {
        if (medlemmer.isEmpty()) {
            System.out.println("Ingen medlemmer registreret endnu.");
            return;
        }

        System.out.println("Medlemmer med restance:");
        boolean findesRestance = false;

        for (Medlem medlem : medlemmer) {
            if (medlem.isHarRestance()) {
                System.out.println("Navn: " + medlem.getNavn() + ", CPR: " + medlem.getCprnr());
                findesRestance = true;
            }
        }


        if (!findesRestance) {
            System.out.println("Ingen medlemmer har restance.");
        }
    }
}