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

    public String getReisestatus() { return reisestatus; }

    public String reisedaten(){
        return "Reisestatus: " + reisestatus
                +"\n"
                + "Flug von " + startort + " nach " + zielort + "\n"
                +"\n"
                + "Abflug um " + uhrzeit + " den " + monatstag + ". " + monat + " " + jahr + "\n"
                + "Anzahl der Reisenden: " + personenanzahl + "\n"
                + "Gewählte Flugzeuggröße: " + jetGroesse + "\n"
                + "Kulinarische Versorgung: " + kulinarischeVersorgung +"\n"
                + "Abholservice: " + abholort +"\n"
                +"\n"
                +"\n"
                + "----------------------------------------------------------"
                +"\n";

    }
}
