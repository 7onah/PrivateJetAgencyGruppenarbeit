package org.example.Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// GUI-Elemente
public class ThePrivateJetAgency extends JFrame {
    private JPanel frame;
    private JLabel labelThePrivateJetAgency;
    private JLabel labelVon;
    private JTextField textFieldStartort;
    private JLabel labelNach;
    private JTextField textFieldZielort;
    private JLabel labelUhrzeit;
    private JTextField textFieldUhrzeit;
    private JLabel labelJahr;
    private JComboBox comboBoxJahr;
    private JLabel labelMonat;
    private JLabel labelMonatstag;
    private JComboBox comboBoxMonat;
    public JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JLabel labelPersonenanzahl;
    private JTextField textFieldPersonenanzahl;
    private JLabel labelServices;
    private JCheckBox checkBoxChampagner;
    private JCheckBox checkBoxTrueffelPasta;
    private JCheckBox checkBoxKaviar;
    private JLabel labelAbholservice;
    private JComboBox comboBoxAbholserviceAuswahl;
    private JLabel labelAbholort;
    private JTextField textFieldAbholort;
    private JLabel labelReise;
    private JTextArea textAreaReiseAusgabe;
    private JButton buttonSpeichern;
    private JLabel labelFlugzeuggroesse;
    private JRadioButton radioButtonFlugzeugKlein;
    private JRadioButton radioButtonFlugzeugMittel;
    private JRadioButton radioButtonFlugzeugGross;
    private JLabel labelBuchung;
    private JTextArea textAreaBuchungAusgabe;
    private JButton buttonLoeschen;
    private JScrollPane ScrollPaneReise;
    private JScrollPane ScrollPaneAlleReisen;
    private JTextField textFieldZwischenspeicher;
    private JButton buttonClear;
    private JButton buttonNurGeplanteReisen;
    private JButton alleReisenAnzeigenButton;

    public String abholort;
    public boolean abholservice;

    int day; // Variable für Monatstage definieren
    private int monatstag;  // Variable welche den Monatstag in der Reise ausgibt

    String reisestatus; // Variable die den Reisestatus angibt

    public ArrayList<Reise> reiseliste = new ArrayList<Reise>();    // Erstellen einer ArrayList namens "reiseliste", die aus einzelnen Reisen besteht

    private boolean aktiviertGross = false;     // Variable, die den Aktivierungszustand des Radio-Buttons "aktiviertGross" beschreibt. Der initiale Zustand ist false, sprich deaktiviert
    private boolean aktiviertMittel = false;    // Variable, die den Aktivierungszustand des Radio-Buttons "aktiviertMittel" beschreibt. Der initiale Zustand ist false, sprich deaktiviert
    private boolean aktiviertKlein = false;     // Variable, die den Aktivierungszustand des Radio-Buttons "aktiviertKlein" beschreibt. Der initiale Zustand ist false, sprich deaktiviert


    private ArrayList<Reise> gefilterteReisen = new ArrayList<>();  // Erstellen einer ArrayList namens "gefilterteReisen", die Reisen mit einem definierten Kriterium enthält


    // Beginn Konstruktor
    public ThePrivateJetAgency () {
        setTitle("The Private Jet Agency");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(frame);
        setSize(1200,800);
        setVisible(true);
        textAreaReiseAusgabe.setPreferredSize(new Dimension(1200,800));

        textFieldZwischenspeicher.setVisible(false); // "Zwischenspeicher" für Monatstag nicht sichtbar machen

        initObjekte(); // die Methode initObjekte wird hier initiiert. Dadurch werden die festen Objekte/feste Reisen der Array Liste "reiseliste" hinzugefügt.

        textAreaBuchungAusgabe.setText(reiselisteAusgabe()); // Die Methode "reiselisteAusgabe" wird in der Textarea "textAreaBuchungAusgabe" ausgegeben


        // <editor-fold desc="Buttons Monatstage">


        // Beginn Buttons für Monatstage mit ActionListeners
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 1; // Variable für Monatstage initialisieren
                textFieldZwischenspeicher.setText(String.valueOf(day)); // Wert der Variable day im textField "zwischenspeichern"
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 2;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 3;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 4;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 5;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 6;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 7;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 8;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 9;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 10;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 11;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 12;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 13;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 14;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 15;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 16;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 17;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 18;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 19;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 20;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 21;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 22;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 23;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 24;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 25;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 26;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 27;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 28;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 29;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 30;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        });

        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                day = 31;
                textFieldZwischenspeicher.setText(String.valueOf(day));
            }
        }); // Ende Buttons für Monatstage mit ActionListeners

        // </editor-fold>

        // <editor-fold desc="comboBox Monat">

        // Beginn: Mithilfe einer if-else-if-else-Anweisung, die Anzahl der Tage je Monat bzw. comboBoxMonat definieren:
        comboBoxMonat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String monat = comboBoxMonat.getSelectedItem().toString();

                // Werden die Monate JAN, MRZ, MAI, JUL, AUG, OKT, DEZ ausgewählt, sind 1 bis 31 Tage/Buttons sichtbar
                if (monat.equals("Januar") || monat.equals("März") || monat.equals("Mai") || monat.equals("Juli") ||
                        monat.equals("August") || monat.equals("Oktober") || monat.equals("Dezember")) {
                    button29.setVisible(true);
                    button30.setVisible(true);
                    button31.setVisible(true);

                // Wird Monat FEB ausgewählt, sind 1 bis 28 Tage/Buttons sichtbar
                } else if (monat.equals("Februar")) {
                    button29.setVisible(false);
                    button30.setVisible(false);
                    button31.setVisible(false);

                // Wird keiner der o. g. Monate ausgewählt (APR, JUN, SEP, NOV), sind 1 bis 30 Tage/Buttons sichtbar
                } else {
                    button29.setVisible(true);
                    button30.setVisible(true);
                    button31.setVisible(false);
                }
            }
        }); // Ende: Mithilfe einer if-else-if-else-Anweisung, die Anzahl der Tage je Monat bzw. comboBoxMonat definieren


        /* Beginn: Andere Möglichkeit: Mithilfe einer switch-Anweisung, die Anzahl der Tage je Monat bzw. comboBoxMonat definieren:

        String monat = comboBoxMonat.getSelectedItem().toString();

        switch (monat) {
            // Bei den Monaten/Cases JAN, MRZ, MAI, JUL, AUG, OKT, DEZ sind 1 bis 31 Tage/Buttons sichtbar
            case "Januar":
            case "März":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":

                button29.setVisible(true);
                button30.setVisible(true);
                button31.setVisible(true);
                break; // Bricht die Verarbeitung des aktuellen Blocks ab

            // Bei Monat/Cas FEB sind 1 bis 28 Tage/Buttons sichtbar
            case "Februar":

                button29.setVisible(false);
                button30.setVisible(false);
                button31.setVisible(false);
                break;

            default: // Trifft keine der o. g. Bedingungen zu (APR, JUN, SEP, NOV), sind 1 bis 30 Tage/Buttons sichtbar
                // Monate mit 30 Tagen:
                button29.setVisible(true);
                button30.setVisible(true);
                button31.setVisible(false);
                break;
        }

        Ende: Andere Möglichkeit: Mithilfe einer switch-Anweisung, die Anzahl der Tage je Monat bzw. comboBoxMonat definieren
        */

        // </editor-fold>

        // <editor-fold desc="Radio-Buttons Flugzeuggröße">

        // Action Listener für die Radio-Buttons der Flugzeuggröße:

        // Action Listener für den Radio-Button "Flugzeug Groß"
        radioButtonFlugzeugGross.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aktiviertGross = !aktiviertGross;   // Schaltet den Aktivierungsstatus von "Flugzeug Groß" in das Gegenteil um. Von aktiviert in deaktiviert, sprich von true in false
                                                    // Das Gleiche git auch von deaktiviert in aktiviert.

                // Setzt die Aktivierungsstatus der anderen Radio-Buttons auf deaktiviert (false)
                aktiviertMittel = false;
                aktiviertKlein = false;


                // Aktualisiert die anderen Radio-Buttons:
                // Deaktiviert die Auswahl und Bearbeitung der anderen Radio-Buttons, wenn "Flugzeug Groß" aktiviert ist
                radioButtonFlugzeugKlein.setEnabled(!aktiviertGross);   // Ist "Flugzeug Groß" aktiviert, wird die Bearbeitung von "Flugzeug Klein" deaktiviert
                                                                        // Ist "Flugzeug Groß" deaktiviert, wird die Bearbeitung von "Flugzeug Klein" aktiviert.
                radioButtonFlugzeugKlein.setSelected(false);            // Die Auswahl von "Flugzeug Klein" wird gelöscht
                radioButtonFlugzeugMittel.setEnabled(!aktiviertGross);  // Ist "Flugzeug Groß" aktiviert, wird die Bearbeitung von "Flugzeug Mittel" deaktiviert
                                                                        // Ist "Flugzeug Groß" deaktiviert, wird die Bearbeitung von "Flugzeug Mittel" aktiviert.
                radioButtonFlugzeugMittel.setSelected(false);           // Die Auswahl von "Flugzeug Mittel" wird gelöscht
            }
        });



        // Action Listener für den Radio-Button "Flugzeug Mittel"
        radioButtonFlugzeugMittel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aktiviertMittel = !aktiviertMittel;     // Schaltet den Aktivierungsstatus von "Flugzeug Mittel" in das Gegenteil um. Von aktiviert in deaktiviert, sprich von true in false
                                                        // Das Gleiche git auch von deaktiviert in aktiviert.

                // Setzt die Aktivierungsstatus der anderen Radio-Buttons auf deaktiviert (false)
                aktiviertGross = false;
                aktiviertKlein = false;

                // Aktualisiert die anderen Radio-Buttons:
                // Deaktiviert die Auswahl und Bearbeitung der anderen Radio-Buttons, wenn "Flugzeug Mittel" aktiviert ist
                radioButtonFlugzeugKlein.setEnabled(!aktiviertMittel);  // Ist "Flugzeug Mittel" aktiviert, wird die Bearbeitung von "Flugzeug Klein" deaktiviert
                                                                        // Ist "Flugzeug Mittel" deaktiviert, wird die Bearbeitung von "Flugzeug Klein" aktiviert.
                radioButtonFlugzeugKlein.setSelected(false);            // Die Auswahl von "Flugzeug Klein" wird gelöscht
                radioButtonFlugzeugGross.setEnabled(!aktiviertMittel);  // Ist "Flugzeug Mittel" aktiviert, wird die Bearbeitung von "Flugzeug Groß" deaktiviert
                                                                        // Ist "Flugzeug Mittel" deaktiviert, wird die Bearbeitung von "Flugzeug Groß" aktiviert.
                radioButtonFlugzeugGross.setSelected(false);            // Die Auswahl von "Flugzeug Groß" wird gelöscht
            }
        });


        // Action Listener für den Radio-Button "Flugzeug Klein"
        radioButtonFlugzeugKlein.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aktiviertKlein = !aktiviertKlein;   // Schaltet den Aktivierungsstatus von "Flugzeug Klein" in das Gegenteil um. Von aktiviert in deaktiviert, sprich von true in false
                                                    // Das Gleiche git auch von deaktiviert in aktiviert.

                // Setzt die Aktivierungsstatus der anderen Radio-Buttons auf deaktiviert (false)
                aktiviertGross = false;
                aktiviertMittel = false;

                // Aktualisiert die anderen Radio-Buttons:
                // Deaktiviert die Auswahl und Bearbeitung der anderen Radio-Buttons, wenn "Flugzeug Klein" aktiviert ist
                radioButtonFlugzeugMittel.setEnabled(!aktiviertKlein);  // Ist "Flugzeug Klein" aktiviert, wird die Bearbeitung von "Flugzeug Mittel" deaktiviert
                                                                        // Ist "Flugzeug Klein" deaktiviert, wird die Bearbeitung von "Flugzeug Mittel" aktiviert.
                radioButtonFlugzeugMittel.setSelected(false);           // Die Auswahl von "Flugzeug Mittel" wird gelöscht
                radioButtonFlugzeugGross.setEnabled(!aktiviertKlein);   // Ist "Flugzeug Klein" aktiviert, wird die Bearbeitung von "Flugzeug Groß" deaktiviert
                                                                        // Ist "Flugzeug Klein" deaktiviert, wird die Bearbeitung von "Flugzeug Groß" aktiviert.
                radioButtonFlugzeugGross.setSelected(false);            // Die Auswahl von "Flugzeug Groß" wird gelöscht
            }
        });

        // </editor-fold>

        // <editor-fold desc="comboBox Abholservice">

        comboBoxAbholserviceAuswahl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String abholserviceText = (String) comboBoxAbholserviceAuswahl.getSelectedItem();
                if (abholserviceText.equals("ja")) {
                 abholservice = true ;
            } else {
                    abholservice = false;
            }
            if (abholservice) {
                    labelAbholort.setVisible(true);
                    textFieldAbholort.setVisible(true);
                } else{
                    labelAbholort.setVisible(false);
                    textFieldAbholort.setVisible(false);

                }
            }
        });

        // </editor-fold>

        // <editor-fold desc="Speichern Button">

        // Der Speichern-Button initiiert die Methode ausgeben:
        buttonSpeichern.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgeben();

            }
        });

        // </editor-fold>

        // <editor-fold desc="nur geplante Reisen Button">

        // Dieser Button hat die Aufgabe die Methode "filtern" zu initiieren. Dadurch werden in der Textarea "textAreaBuchungAusgabe" nur die Reisen angezeigt mit den Reisestatus "Reise steht noch aus"
        buttonNurGeplanteReisen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaBuchungAusgabe.setText(null);   // Zuerst wird die Textarea komplett geleert
                filtern();  // die Methode "filtern" wird initialisiert
            }
        });

        // </editor-fold>

        // <editor-fold desc="alle Reisen anzeigen Button">

        // Dieser Button hat die Aufgabe alle Reisen in der Textarea "textAreaBuchungAusgabe" anzuzeigen
        alleReisenAnzeigenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaBuchungAusgabe.setText(reiselisteAusgabe());    // Die Methode "reiselisteAusgabe" wird initiiert und in der Textarea "textAreaBuchungAusgabe" ausgegeben
            }
        });

        // </editor-fold>

    } // Ende Konstruktor


    // <editor-fold desc="Methode Flugzeuggröße">

    public String groesseJet () { // Methode zu den Radiobuttons FlugzeugKlein, FlugzeugMittel und FlugzeugGross
        if (radioButtonFlugzeugKlein.isSelected()) { // im Feld textAreaReiseAusgabe wird später somit die jeweilige ausgewählte Größe ausgegeben
            return "klein";
        } else if (radioButtonFlugzeugMittel.isSelected()){
            return "mittel";
        } else if (radioButtonFlugzeugGross.isSelected()) {
            return "groß";
        } else {
            return "Keine Auswahl der Flugzeuggröße getroffen"; // bei keiner Auswahl wird dieser Satz ausgegeben
        }

    }

    // </editor-fold>

    // <editor-fold desc="Methode Verpflegung">

    // Beginn Methode verpflegung mithilfe von if-Anweisungen:
    public String verpflegung () {

        String auswahlVerpflegung = "";

        if (checkBoxChampagner.isSelected()) {
            auswahlVerpflegung = auswahlVerpflegung + "Champagner";
        }

        // Werden mehrere Checkboxen ausgewählt, werden sie später in der TextArea-Ausgabe mit einem Komma voneinander getrennt
        if (checkBoxTrueffelPasta.isSelected()) {
            if (!auswahlVerpflegung.isEmpty()) {
                auswahlVerpflegung = auswahlVerpflegung + ", ";
            }
            auswahlVerpflegung = auswahlVerpflegung + "Trüffel Pasta";
        }

        if (checkBoxKaviar.isSelected()) {
            if (!auswahlVerpflegung.isEmpty()) {
                auswahlVerpflegung = auswahlVerpflegung + ", ";
            }
            auswahlVerpflegung = auswahlVerpflegung + "Kaviar Blinis";
        }

        // Wenn keine Verpflegung ausgewählt wurde:
        if (auswahlVerpflegung.isEmpty()) {
            return "Keine Verpflegung gewünscht";
        }

        return auswahlVerpflegung;

    } // Ende Methode verpflegung

    // </editor-fold>

    // <editor-fold desc="Methode ausgeben">

    // Beginn der Methode ausgeben
    public void ausgeben() {

        try {
            reisestatus = "Reise steht noch aus";   // wird eine Reise über das GUI konfiguriert, wird dieser Reise automatisch der Reisestatus "Reise steht noch aus" zugewiesen
                                                    // Diese Voreinstellung wird gewählt, da es unlogisch wäre, einem Nutzer die Buchung von bereits begonnenen Reisen zu ermöglichen





            // Die Start- und Zielort-Variable der Reise wird definiert:
            String startort = textFieldStartort.getText();
            String zielort = textFieldZielort.getText();

            // Wird in die Variable Startort oder Zielort nichts eingegeben (Variable bleibt leer) wird eine Fehlermeldung ausgegeben
            if (startort.isEmpty() || zielort.isEmpty()) {
                throw new IllegalArgumentException("Bitte geben Sie Start- und Zielort an!");
            }

            // Entspricht der Startort dem Zielort, wird eine Fehlermeldung ausgegeben
            if (startort.equals(zielort)) {
                throw new IllegalArgumentException("Bitte geben Sie einen validen Zielort an!");
            }




            // Die Uhrzeit Eingabe wird definiert:
            String uhrzeit = textFieldUhrzeit.getText();
            String[] uhrzeitTeil = uhrzeit.split(":");  // Die Uhrzeit im Format Stunden:Minuten wird am Doppelpunkt in Stunden und Minuten getrennt

            // Sollte die Unterteilung in Stunden und Minuten nicht erfolgreich sein, so wird eine Fehlermeldung ausgegeben
            if (uhrzeitTeil.length != 2) {
                throw new NumberFormatException("Bitte geben Sie eine valide Uhrzeit an" + "\n" + "Die Eingabe muss das Format Stunde:Minute erfüllen");
            }

            // Der Trennungsteil vor dem Doppelpunkt wird der Variable "stunden" zugeschrieben
            String stunden = uhrzeitTeil[0];
            int stundenZahl = Integer.parseInt(stunden);

            // Der Trennungsteil nach dem Doppelpunkt wird der Variable "minuten" zugeschrieben
            String minuten = uhrzeitTeil[1];
            int minutenZahl = Integer.parseInt(minuten);

            // Festlegen, dass die angegebene Stunde dem 24-Stunden-Format entsprechen muss.
            if (stundenZahl < 0 || stundenZahl > 23) {
                throw new IllegalArgumentException("Bitte geben Sie eine valide Stundenangabe ein");
            }

            // Sicherstellen, dass die angegebenen Minuten dem 60-Minuten-Format pro Stunde entsprechen.
            if (minutenZahl < 0 || minutenZahl > 59) {
                throw new IllegalArgumentException("Bitte geben Sie eine valide Minutenangabe ein");
            }




            // Die Variable des Jahres durch Auswahl in der Combobox Jahreseingabe definieren:
            String jahrText = (String) comboBoxJahr.getSelectedItem();
            int jahr = Integer.parseInt(jahrText);




            // Variable Personenanzahl durch Eingabe im Textfeld für Personenanzahl definieren:
            String personenanzahlText = textFieldPersonenanzahl.getText();

            // Sollte das Textfeld für Personenanzahl leer sein, dann soll eine Fehlermeldung ausgegeben werden
            if (personenanzahlText.isEmpty()) {
                throw new IllegalArgumentException("Bitte geben Sie eine Personenanzahl an!");
            }

            // Sollte die Personenanzahl kleiner gleich null sein, soll eine Fehlermeldung ausgegeben werden
            int personenanzahl = Integer.parseInt(personenanzahlText);
            if (personenanzahl <= 0) {
                throw new IllegalArgumentException("Bitte geben Sie eine valide Personenanzahl an!");
            }




            // Variable der Jet Größe durch Aufrufen der Methode "groesseJet" festlegen:
            String jetGroesse = groesseJet();




            // Variable "monat" wird festgelegt durch die Auswahl in der dafür vorgesehenen ComboBox "comboBoxMonat":
            String monat = comboBoxMonat.getSelectedItem().toString();

            // Definition der Monatstags-Variable durch Zugriff auf den Zwischenspeicher, welcher die Zahl des Monatstags enthält
            String monatstagtext = textFieldZwischenspeicher.getText();


            // Versuchen den Text aus dem Monatstageszwischenspeicher in eine Zahl umzuwandeln
            // Ist dies nicht möglich oder der Monatstag ist kleiner gleich 0 oder größer als 31 werden Fehlermeldungen angezeigt
            try{
                monatstag = Integer.parseInt(monatstagtext);
            }catch(IllegalArgumentException ex){
                if (monatstag <= 0 || monatstag > 31) {
                    throw new IllegalArgumentException("Bitte wählen Sie einen Tag aus!");
                }
            }




            String service = (String) comboBoxAbholserviceAuswahl.getSelectedItem();    // Die Variable "service" wird mit einer der zwei Auswahlmöglichkeiten (ja/nein) der ComboBox "comboBoxAbholserviceAuswahl belegt
            abholort = textFieldAbholort.getText();    // Die Variable "abholort" wird durch den Inhalt des Textfeldes "textFieldAbholort" definiert



            // Wenn ein Abholservice gewählt ist und ein Abholort angegeben ist, wird die Reise in die Liste aller Reisen hinzugefügt
            if (service.equals("ja") && !abholort.isEmpty()) {
                Reise neu = new Reise(reisestatus, startort, zielort, uhrzeit, jahr, monat, day, personenanzahl, verpflegung(), abholort, jetGroesse);
                reiseliste.add(neu);    // Reise wird zur Liste aller Reisen hinzugefügt


                // Diese neue Reise wird im Anzeigefenster "Reise" nach der Methode "reisedaten" ausgegeben
                String neueReiseText = neu.reisedaten();
                textAreaReiseAusgabe.setText(neueReiseText);
                textAreaBuchungAusgabe.setText(reiselisteAusgabe());    // Außerdem wird die neue Reise durch die Methode "reiselisteAusgabe" mit den schon bestehenden Reisen im Ausgabefenster "alle Reisen" ausgegeben
            }



            // Ist ein Abholservice ausgewählt und es wurde kein Abholort angegeben, wird eine Fehlermeldung ausgegeben
            if (service.equals("ja") && abholort.isEmpty()) {
                throw new IllegalArgumentException("Bitte geben Sie einen Abholort an!");
            }



            // Wenn kein Abholservice gewählt ist und kein Abholort angegeben ist, wird die Reise in die Liste aller Reisen hinzugefügt
            if (service.equals("nein") && abholort.isEmpty()) {
                abholort = "Kein Abholservice gewählt";     // Die Variable "abholort" wird mit "Kein Abholservice gewählt" definiert, da der Abholservice abgewählt wurde
                Reise neu = new Reise(reisestatus, startort, zielort, uhrzeit, jahr, monat, day, personenanzahl, verpflegung(), abholort, jetGroesse);
                reiseliste.add(neu);     // Reise wird zur Liste aller Reisen hinzugefügt


                // Diese neue Reise wird im Anzeigefenster "Reise" nach der Methode "reisedaten" ausgegeben
                String neueReiseText = neu.reisedaten();
                textAreaReiseAusgabe.setText(neueReiseText);
                textAreaBuchungAusgabe.setText(reiselisteAusgabe());    // Außerdem wird die neue Reise durch die Methode "reiselisteAusgabe" mit den schon bestehenden Reisen im Ausgabefenster "alle Reisen" ausgegeben
            }



            // Alle Radio Buttons werden wieder zur Bearbeitung aktiviert
            radioButtonFlugzeugKlein.setEnabled(true);
            radioButtonFlugzeugMittel.setEnabled(true);
            radioButtonFlugzeugGross.setEnabled(true);




        // Sollte die Unterteilung in Stunden und Minuten nicht erfolgreich sein, so wird hier das Exception handling betrieben
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Die Stunden und Minuten müssen Zahlen sein.");

        // Gibt die jeweilige Fehlermeldung zurück, wenn eine IllegalArgumentException geworfen wird
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }



    }
    // Ende der Methode ausgeben

    // </editor-fold>

    // <editor-fold desc="Methode reiselisteAusgabe">

    // Anfang der Methode reiselisteAusgabe

    // Es werden alle Reisen in der Liste an Reisen ausgegeben
    // Dabei wird die Ausgabe nach der Methode Reisedaten gestaltet
    public String reiselisteAusgabe() {

        String gesamteReisenText = "";  // es wird ein String "gesamteReisenText" definiert der zuerst leer ist
        for (Reise reisen : reiseliste) {
            gesamteReisenText = gesamteReisenText + "\n" + reisen.reisedaten(); // Zu dem zuvor definierten String werden nun die Reisen aus der Reiseliste hinzugefügt, wobei das Ausgabeformat die Methode reisedaten festlegt
        }

        return gesamteReisenText; // Zurückgegeben wird der nun mit Reisen gefüllte String "gesamteReisenText"
    }

    // Ende der Methode reiselisteAusgabe

    // </editor-fold>

    // <editor-fold desc="Methode initObjekte">

    public void initObjekte() {
        Reise r1= new Reise("Reise wurde schon in der Vergangenheit angetreten","München","New York", "07:30",2024,"Juli",11,6, "Trüffel Platte","Hotel Bergblick", "mittel");
        reiseliste.add(r1);
        Reise r2= new Reise("Reise wurde schon in der Vergangenheit angetreten","Los Angeles","Vancouver","14:20",2023,"September",21,3,"Keine kulinarischen Service ausgewählt","Kein Abholservice ausgewählt","klein");
        reiseliste.add(r2);
        Reise r3= new Reise("Reise wurde schon in der Vergangenheit angetreten","Wien","Venedig","17:00",2021,"Dezember",3,11,"Champagner","Rizz Carlton Wien","groß");
        reiseliste.add(r3);
    }

    // </editor-fold>

    // <editor-fold desc="Methode filtern">

    // Die Methode "filtern" filtert alle Reisen nach dem Kriterium Reisestatus. Ist der Reisestatus einer Reise "Reise steht noch aus", dann wird diese Reise der Array Liste gefilterteReisen hinzugefügt.
    public void filtern() {
        String gefilterteReisenText = "";   // es wird ein String "gefilterteReisenText" definiert der zuerst leer ist

        for (Reise gefilterteReise : reiseliste) {

            if (gefilterteReise.getReisestatus().equals("Reise steht noch aus")) {  // Prüft, ob der Reisestatus "Reise steht noch aus" ist
                gefilterteReisen.add(gefilterteReise);  // Fügt die Reise zur Liste "gefilterteReisen" hinzu

                String gefilterteReiseText = gefilterteReise.reisedaten();  // Dem zuvor definierten String wird nun die Reise aus der Array Liste "gefiltertenReise" hinzugefügt, wobei das Ausgabeformat die Methode reisedaten festlegt

                gefilterteReisenText = gefilterteReisenText + gefilterteReiseText;  // Die aktuelle gefilterte Reise in Textform wird an den String aller zuvor gefilterten Reisen in Textform angehängt
            }
        }

        if (gefilterteReisen.isEmpty()) {   // Überprüft, ob keine Reisen gefiltert wurden
            textAreaBuchungAusgabe.setText("Keine Reise steht noch aus.");   // Falls keine Reisen übrig sind, zeigt es eine Meldung in "textAreaBuchungAusgabe" an

        } else {
            textAreaBuchungAusgabe.setText(gefilterteReisenText);  // Falls gefilterte Reisen vorhanden sind, zeigt es diese in Textdarstellung in der "textAreaBuchungAusgabe" an
        }
    }

    // </editor-fold>


    public static void main(String[] args) {
        ThePrivateJetAgency tpja1 = new ThePrivateJetAgency();
    }}