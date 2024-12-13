package UserInterface;
//Userinterface

import Registrering.Konkurrencesvømmer;
import Registrering.Medlem;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UserInterface {
    private List<Medlem> medlemmer;

    public UserInterface() {
        this.medlemmer = new ArrayList<>();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registering af medlem");
            System.out.println("2. Prisliste");
            System.out.println("3. Restance");
            System.out.println("4. Samlet kontigent");
            System.out.println("5. Luk");
            System.out.println("Vælg en af mulighederne");
            int valg = Integer.parseInt(scanner.nextLine());


            switch (valg) {
                case 1:
                    registeremedlem(scanner);
                    break;

                case 2:
                    visPrisliste();
                    break;

                case 3:
                    visMedlemmerMedRestance();
                    break;

                case 4:
                    beregnSamletKontigent();
                    break;

                case 5:
                    System.out.println("Program lukkes");
                    return;

                default:
                    System.out.println("Ugyldigt valgt. Prøv igen");
            }
        }
    }

    //lav en metode der registrerer medlem() / Medlems registering af nye medlemmer via input
    public void registeremedlem(Scanner scanner) {

        System.out.println("Indtast navn:");
        String navn = scanner.nextLine();

        System.out.println("Indtast alder");
        int alder = Integer.parseInt(scanner.nextLine());

        System.out.println("Indtast køn");
        String køn = scanner.nextLine();

        System.out.println("Indtast tlf-nr");
        int tlfnr = Integer.parseInt(scanner.nextLine());

        System.out.println("Indtast CPR-nummer");
        String cprnr = scanner.nextLine();

        System.out.println("Indtast adresse");
        String adresse = scanner.nextLine();

        System.out.println("Indtast medlemstype (aktiv/passiv)");
        String medlemstype = scanner.nextLine().trim().toLowerCase();
        if(medlemstype.isEmpty()) {
            System.out.println("medlem ikke aktiv");
        }
         else{
            System.out.println("medlem er aktiv");
        }
         
        System.out.println("Har medlemmet restance? (Ja/Nej):");
        String restanceSvar = scanner.nextLine();
        boolean harRestance = restanceSvar.equalsIgnoreCase("Ja");

        System.out.println("Er du konkurrencesvømmer (Ja/Nej)");
        String svar = scanner.nextLine();
        boolean ErKonkurrenceSvømmer = svar.equalsIgnoreCase("Ja");


        if (ErKonkurrenceSvømmer) {
            System.out.println("Medlem er konkurrencesvømmer");
        } else {
            System.out.println("Medlem er ikke konkurrencesvømmer");
        }


        String svømmehold = "";
        String svømmedeciplin = "";


        if (ErKonkurrenceSvømmer) {


            System.out.println("Indtast svømmehold");
            svømmehold = scanner.nextLine();

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
    }
        public void visPrisliste () {
            if (medlemmer.isEmpty()) {
                System.out.println("ingen medlemmer endnu");
                return;
            }
            System.out.println("Prisliste for medlemmer:");
            for (Medlem medlem : medlemmer) {
                String ekstrainfo = "";
                if (medlem instanceof Konkurrencesvømmer){
                    Konkurrencesvømmer konkurrencesvømmer = (Konkurrencesvømmer) medlem;
                    ekstrainfo = ", Svømmehold " + konkurrencesvømmer.getSvømmehold() +
                            ", Svømmedisciplin:" + konkurrencesvømmer.getSvømmedeciplin();
                    
                }
                
                System.out.println("Navn: " + medlem.getNavn() + ", Pris: " + medlem.beregnPris() + "kr." + ekstrainfo);
            }
        }

        public void visMedlemmerMedRestance () {
            if (medlemmer.isEmpty()) {
                System.out.println("Ingen medlemmer registreret endnu.");
                return;
            }

            System.out.println("Medlemmer med restance:");
            boolean findesRestance = false;

            for (Medlem medlem : medlemmer) {
                if (medlem.isHarRestance()) {
                    System.out.println("Navn: " + medlem.getNavn() + ", CPR: " + medlem.getCprnr() + ekstraInfo);
                    findesRestance = true;
                }
            }


            if (!findesRestance) {
                System.out.println("Ingen medlemmer har restance.");
            }
        }
        public void beregnSamletKontigent () {
            if (medlemmer.isEmpty()) {
                System.out.println("Ingen medlemmer registreret endnu.");
                return;
            }
            double samletKontigent = 0.0;
            for (Medlem medlem : medlemmer) {
                samletKontigent += medlem.beregnPris();
            }
            System.out.println("Den samlet kontigent for alle medlemmer er: " + samletKontigent + " Kr.");
        }          }


