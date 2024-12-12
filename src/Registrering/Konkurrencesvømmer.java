package Registrering;
//SUBCLASS til medlemm

import java.util.ArrayList;

public class Konkurrencesvømmer extends Medlem{
    private String svømmehold;
    private ArrayList<String>svømmedecipliner;

    public Konkurrencesvømmer(String navn, int alder, String køn, int tlfnr, String cprnr,
                              String adresse,String medlemstype, String svømmehold, String svømmedeciplin) {
        super(navn, alder, køn); //kalder på superclass konstruktør
        this.svømmehold = svømmehold;
        this.svømmedecipliner = new ArrayList<>();

        svømmedecipliner.add("Butterfly"); //Default
        svømmedecipliner.add("Crawl");
        svømmedecipliner.add("Rygcrawl");
        svømmedecipliner.add("Bryst");


    }
    public String getsvømmehold() {
        return svømmehold;
    }
    public void setsvømmehold(String svømmehold) {
        this.svømmehold= svømmehold;
    }
    public ArrayList<String>getSvømmedecipliner() {
        return svømmedecipliner;

    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // kalder på superklasse metode
        System.out.println("Svømmehold: " + svømmehold);
        System.out.println("Svømmedecipliner: " + svømmedecipliner);
}


    }



