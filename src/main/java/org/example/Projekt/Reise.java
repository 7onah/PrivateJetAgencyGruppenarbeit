package org.example.Projekt;

public class Reise {

    // Attribute definieren
    private String reisestatus;
    private String startort;
    private String zielort;
    private String uhrzeit;
    private int jahr;
    private String monat;
    private int monatstag;
    private int personenanzahl;
    private String verpflegung;
    private boolean abholservice;
    private String abholort;
    private String jetGroesse;

    // Konstruktor
    public Reise(String reisestatus, String startort, String zielort, String uhrzeit, int jahr, String monat, int monatstag, int personenanzahl, String verpflegung, boolean abholservice, String abholort, String jetGroesse) {
        this.reisestatus = reisestatus;
        this.startort = startort;
        this.zielort = zielort;
        this.uhrzeit = uhrzeit;
        this.jahr = jahr;
        this.monat = monat;
        this.monatstag = monatstag;
        this.personenanzahl = personenanzahl;
        this.verpflegung = verpflegung;
        this.abholservice = abholservice;
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
                + "Abholservice ausgewählt: " + abholservice +"\n"
                + "Abholort: " + abholort +"\n"
                +"\n"
                +"\n"
                + "----------------------------------------------------------"
                +"\n";

    }
}
