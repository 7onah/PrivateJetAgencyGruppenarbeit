package org.example.Projekt;


import static org.junit.jupiter.api.Assertions.*;

class reiselisteAusgabeTest {

    @org.junit.jupiter.api.Test
    void reiselisteAusgabe() {

        ThePrivateJetAgency agency = new ThePrivateJetAgency();


        // Hinzufügen zweier Reizen zur Arraylist "reiseliste"

        Reise reise1 = new Reise("Reise steht noch aus", "München", "Las Palmas de Gran Canaria", "16:00", 2025, "August", 6, 3, "Trüffel Pasta", true,"Hotel Bergblick", "klein");
        agency.reiseliste.add(reise1);


        Reise reise2 = new Reise("Reise steht noch aus", "München", "Rom", "12:30", 2025, "September", 20, 16, "Kaviar", false,"Kein Abholservice gewählt", "Groß");
        agency.reiseliste.add(reise2);



        // Hier wird die erwartete Ausgabe definiert
        String erwarteteAusgabe =
                "\n" +
                "Reisestatus: Reise wurde schon in der Vergangenheit angetreten\n" +
                "Flug von München nach New York\n" +
                "\n" +
                "Abflug um 07:30 den 11. Juli 2024\n" +
                "Anzahl der Reisenden: 6\n" +
                "Gewählte Flugzeuggröße: mittel\n" +
                "Kulinarische Versorgung: Trüffel Platte\n" +
                "Abholservice ausgewählt: " + true +"\n" +
                "Abholort: Hotel Bergblick\n" +
                "\n" +
                "\n" +
                "----------------------------------------------------------\n" +
                "\n" +
                "Reisestatus: Reise wurde schon in der Vergangenheit angetreten\n" +
                "Flug von Los Angeles nach Vancouver\n" +
                "\n" +
                "Abflug um 14:20 den 21. September 2023\n" +
                "Anzahl der Reisenden: 3\n" +
                "Gewählte Flugzeuggröße: klein\n" +
                "Kulinarische Versorgung: Keine kulinarischen Service ausgewählt\n" +
                "Abholservice ausgewählt: " + false +"\n" +
                "Abholort: Kein Abholservice ausgewählt\n" +
                "\n" +
                "\n" +
                "----------------------------------------------------------\n" +
                "\n" +
                "Reisestatus: Reise wurde schon in der Vergangenheit angetreten\n" +
                "Flug von Wien nach Venedig\n" +
                "\n" +
                "Abflug um 17:00 den 3. Dezember 2021\n" +
                "Anzahl der Reisenden: 11\n" +
                "Gewählte Flugzeuggröße: groß\n" +
                "Kulinarische Versorgung: Champagner\n" +
                "Abholservice ausgewählt: " + true +"\n" +
                "Abholort: Ritz Carlton Wien\n" +
                "\n" +
                "\n" +
                "----------------------------------------------------------\n"+
                "\n" +
                "Reisestatus: Reise steht noch aus\n" +
                "Flug von München nach Las Palmas de Gran Canaria\n" +
                "\n" +
                "Abflug um 16:00 den 6. August 2025\n" +
                "Anzahl der Reisenden: 3\n" +
                "Gewählte Flugzeuggröße: klein\n" +
                "Kulinarische Versorgung: Trüffel Pasta\n" +
                "Abholservice ausgewählt: " + true +"\n" +
                "Abholort: Hotel Bergblick\n" +
                "\n" +
                "\n" +
                "----------------------------------------------------------\n" +
                "\n" +
                "Reisestatus: Reise steht noch aus\n" +
                "Flug von München nach Rom\n" +
                "\n" +
                "Abflug um 12:30 den 20. September 2025\n" +
                "Anzahl der Reisenden: 16\n" +
                "Gewählte Flugzeuggröße: Groß\n" +
                "Kulinarische Versorgung: Kaviar\n" +
                "Abholservice ausgewählt: " + false +"\n" +
                "Abholort: Kein Abholservice gewählt\n" +
                "\n" +
                "\n" +
                "----------------------------------------------------------\n";

        // Die Methode "reiselisteAusgabe" wird der Variablen "echteAusgabe" zugeschrieben
        String echteAusgabe = agency.reiselisteAusgabe();

        // Überprüfen, ob die echte Ausgabe der erwarteten Ausgabe entspricht
        assertEquals(erwarteteAusgabe, echteAusgabe, "Die Ausgabe der Reiseliste ist nicht korrekt");
    }

}
