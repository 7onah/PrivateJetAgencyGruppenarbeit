package org.example.Projekt;

public class Reise {

    String reisestatus;
    String startort;
    String zielort;
    String uhrzeit;
    int jahr;
    String monat;
    int monatstag;
    int personenanzahl;
    String kulinarischeVersorgung;
    String abholort;
    String jetGroesse;

    public Reise(String reisestatus, String startort, String zielort, String uhrzeit, int jahr, String monat, int monatstag, int personenanzahl, String kulinarischeVersorgung, String abholort, String jetGroesse) {
        this.reisestatus = reisestatus;
        this.startort = startort;
        this.zielort = zielort;
        this.uhrzeit = uhrzeit;
        this.jahr = jahr;
        this.monat = monat;
        this.monatstag = monatstag;
        this.personenanzahl = personenanzahl;
        this.kulinarischeVersorgung = kulinarischeVersorgung;
        this.abholort = abholort;
        this.jetGroesse = jetGroesse;
    }
}
