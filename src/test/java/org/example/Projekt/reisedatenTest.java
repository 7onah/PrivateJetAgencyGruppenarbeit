package org.example.Projekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reisedatenTest {

    // Ein Objekt "testreise" wird definiert und mit Eingabeparametern belegt
    Reise testreise = new Reise("Reise steht noch aus", "München", "Las Palmas de Gran Canaria", "16:00", 2025, "August", 6, 3, "Trüffel Pasta", true, "Hotel Bergblick", "klein");

    @Test
    // Es wird die erwartete Ausgabe für die Eingabeparameter definiert.
    // Die erwartete Ausgabe und die tatsächliche Ausgabe (Rückgabe der Methode "reisedaten" bei Eingabe des Objekts "testreise") wird auf Übereinstimmung getestet.
    void reisedatenTest(){
        assertEquals("Reisestatus: " + "Reise steht noch aus"
                +"\n"
                + "Flug von " + "München" + " nach " + "Las Palmas de Gran Canaria" + "\n"
                +"\n"
                + "Abflug um " + "16:00" + " den " + 6 + ". " + "August" + " " + 2025 + "\n"
                + "Anzahl der Reisenden: " + 3 + "\n"
                + "Gewählte Flugzeuggröße: " + "klein" + "\n"
                + "Kulinarische Versorgung: " + "Trüffel Pasta" +"\n"
                + "Abholservice ausgewählt: " + true +"\n"
                + "Abholort: " + "Hotel Bergblick" +"\n"
                +"\n"
                +"\n"
                + "----------------------------------------------------------"
                +"\n",
                testreise.reisedaten());
    }
}