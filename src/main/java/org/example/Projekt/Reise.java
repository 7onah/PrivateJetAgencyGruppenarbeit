package org.example.Projekt;

public class Reise {

    // Attribute definieren
    String reisestatus;
    String startort;
    String zielort;
    String uhrzeit;
    int jahr;
    String monat;
    int monatstag;
    int personenanzahl;
    String verpflegung;
    String abholort;
    String jetGroesse;

    // Konstruktor
    public Reise(String reisestatus, String startort, String zielort, String uhrzeit, int jahr, String monat, int monatstag, int personenanzahl, String kulinarischeVersorgung, String abholort, String jetGroesse) {
        this.reisestatus = reisestatus;
        this.startort = startort;
        this.zielort = zielort;
        this.uhrzeit = uhrzeit;
        this.jahr = jahr;
        this.monat = monat;
        this.monatstag = monatstag;
        this.personenanzahl = personenanzahl;
        this.verpflegung = kulinarischeVersorgung;
        this.abholort = abholort;
        this.jetGroesse = jetGroesse;
    }

    // Methode getReisestatus
    public String getReisestatus() {
        return reisestatus;
    }

    // Definition wie die Reisen "aussehen"/ausgegeben werden sollen:
    public String reisedaten(){
        return "Reisestatus: " + reisestatus
                +"\n"
                + "Flug von " + startort + " nach " + zielort + "\n"
                +"\n"
                + "Abflug um " + uhrzeit + " den " + monatstag + ". " + monat + " " + jahr + "\n"
                + "Anzahl der Reisenden: " + personenanzahl + "\n"
                + "Gewählte Flugzeuggröße: " + jetGroesse + "\n"
                + "Kulinarische Versorgung: " + verpflegung +"\n"
                + "Abholservice: " + abholort +"\n"
                +"\n"
                +"\n"
                + "----------------------------------------------------------"
                +"\n";

    }
}
