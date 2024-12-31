package org.example.Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton buttonNurAktuelleReisen;
    private JButton alleReisenAnzeigenButton;
    public String abholort;
    public boolean abholservice;


    int day; // Variable für Monatstage definieren

    private boolean aktiviertGross = false;     // Variable, die den Aktivierungszustand des Radio-Buttons "aktiviertGross" beschreibt. Der initiale Zustand ist false, sprich deaktiviert
    private boolean aktiviertMittel = false;    // Variable, die den Aktivierungszustand des Radio-Buttons "aktiviertMittel" beschreibt. Der initiale Zustand ist false, sprich deaktiviert
    private boolean aktiviertKlein = false;     // Variable, die den Aktivierungszustand des Radio-Buttons "aktiviertKlein" beschreibt. Der initiale Zustand ist false, sprich deaktiviert

    // Beginn Konstruktor
    public ThePrivateJetAgency () {
        setTitle("The Private Jet Agency");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(frame);
        setSize(1200,800);
        setVisible(true);
        textAreaReiseAusgabe.setPreferredSize(new Dimension(1200,800));

        textFieldZwischenspeicher.setVisible(false); // "Zwischenspeicher" für Monatstag nicht sichtbar machen

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




    } // Ende Konstruktor




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








    public static void main(String[] args) {
        ThePrivateJetAgency tpja1 = new ThePrivateJetAgency();
    }}