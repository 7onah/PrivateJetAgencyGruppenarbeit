package org.example.Projekt;

import javax.swing.*;
import java.awt.*;

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
    private JCheckBox checkBoxFruestueck;
    private JCheckBox checkBoxMittagessen;
    private JCheckBox checkBoxAbendessen;
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
    private JScrollPane JScrollPaneReise;
    private JTextField textFieldZwischenspeicher;
    private JButton buttonClear;
    private JButton buttonNurAktuelleReisen;
    private JButton alleReisenAnzeigenButton;

    public ThePrivateJetAgency () {
        setTitle("The Private Jet Agency");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(frame);
        setSize(1200,800);
        setVisible(true);

        textAreaReiseAusgabe.setPreferredSize(new Dimension(1200,800));
    }

    public static void main(String[] args) {
        ThePrivateJetAgency tpja1 = new ThePrivateJetAgency();
    }
}