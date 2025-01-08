20.12.2024 Jonah Suiter:
Nach der mündlichen Besprechung und Festlegung der GUI-Oberfläche, haben wir sie in Intellij umgesetzt.

 
20.12.2024 Sara Paudler:
Weiterhin haben wir besprochen, welche Methoden wir benötigen und unter uns aufgeteilt, wer welche und wann umsetzt.

 
22.12.2024 Sara Paudler:
Konstruktor in "The Private Jet Agency" Klasse angelegt, Größe der Text Area "Reiseausgabe" angepasst sowie eine main Methode erstellt & hinzugefügt.

23.12.2024 Sara Paudler:
Die Klasse "Reise" erstellt, die Variablen der Klasse hinzugefügt und den Konstruktor generiert.

23.12.2024 Melina Slaschjow:
Methode "Reisedaten" wurde hinzugefügt.

25.12.2024 Sara Paudler:
ActionListener für die Monatstage Buttons erstellt, die Variable "day" erstellt, das TextField Zwischenspeicher unsichtbar gemacht sowie in jedem ActionListener den jeweiligen Tag im Zwischenpeicher abgespeichert.

26.12.2024 Lea Zint:
Klasse: ThePrivateJetAgency
Methode bzw. GUI-Element: comboBoxMonat
60 Minuten
- ActionListener für comboBoxMonat generiert
- Mithilfe einer if-else-if-else-Anweisung, Anzahl der Tage je Monat/comboBox definiert bzw. Monatstage/Buttons un-/sichtbar gemacht
- Alternative Möglichkeit (einkommentiert): switch-Anweisung
- Kommentare ergänzt

26.12.2024 Jonah Suiter:
Durch das Auswählen einer der drei Radio-Buttons für die Flugzeuggröße werden die restlichen zwei von der Bearbeitung ausgenommen. Das konnte ich durch die Methode "setEnabled" erzielen. Zusätzlich werden andere ausgewählte Radio-Buttons, welche die Flugzeuggröße festlegen, abgewählt. Dafür habe ich die Methode "setSelected" verwendet um gleichzeitiges, mehrfaches Auswählen von Radio-Buttons zu verhindern. Dieser Mechanismus stellt sicher, dass immer nur ein Radio-Button gleichzeitig aktiviert ist um eine eindeutige Auswahl der Flugzeuggröße zu gewährleisten.

29.12.2024 Sara Paudler:
Ich habe die Methode "groesseJet" hinzugefügt, die, nach Auswahl eines Radiobuttons der Flugzeuggröße, dafür sorgt, dass im Feld textAreaReiseAusgabe dann die Wahl ausgegebn wird. Je nach Auswahl des Buttons wird "klein", "mittel" oder "groß" ausgegeben. Wenn kein Button gewählt wurde, dann wird "Keine Auswahl der Flugzeuggröße getroffen" ausgegeben.

30.12.2024 Melina Slaschjow:
Ich habe die Abholserviceauswahl hinzugefügt, sie zeigt mit hilfer einer Combobox an ob der Abholservice ausgewählt wird oder nicht. Wenn dieser nicht ausgewählt ist (Combobox wählt false) wird das Label und das Textfeld unsichtbar.

31.12.2024 Lea Zint:
Klasse: ThePrivateJetAgency
Methode: public String verpflegung ()
45 Minuten
- Methode "public String verpflegung ()" hinzugefügt
- String auswahlVerpflegung definiert und initialisiert
- Drei checkBoxen Champagner, Trüffel Pasta, Kaviar mit if-Anweisungen ausgestattet
- Kommentare ergänzt

01.01.2025 Jonah Suiter:
Zu Beginn habe ich eine Arraylist "reiseliste" erstellt, in die alle konfigurierten Reisen hinzugefüht werden
Danach habe einen Speichern Button hinzugefügt welcher die Methode "ausgeben" aufruft.
Ich habe mich dazu entschieden die Methode "ausgeben" zu erstellen, damit der Speichern Button übersichtlich bleibt. In die Methode habe ich den Code geschrieben welcher das Zusammenfügen von Variablen, Exception handling, einschränken von Eingaben um nur logische und sinnvolle Werte zu erlauben und das erstellen von einer neuen Reise umfasst. Dadurch konnte ich langen Code übersichtlicher und logischer struckturieren. Außerdem habe ich eine Methode "reiselisteAusgabe" erstellt, die alle Reisen in einem dafür vorgesehenen Bereich auf der GUI ausgibt.

03.01.2025 Melina Slaschjow:
Ich habe die die Methode Initialisierung Objekte hinzugefügt, welche aus fixen, schon bestehenden Reisen besteht.

04.01.2025 Jonah Suiter:
Hinzufügen des "nur geplante Reisen"-Buttons, der Methode "filtern" und dem "alle Reisen anzeigen"-Button. Der "nur geplante Reisen"-Button initiiert die Methode "filtern". Dadurch werden alle Reisen mit dem Reisestatus "Reise steht noch aus" ausgegeben. Um das zu erreichen, habe ich eine Arraylist names "gefilterteReisen" erstellt in die alle Reisen mit diesem Reisestatus gespeichert werden. Der "alle Reisen anzeigen"-Button hingegen gibt alle Reisen ungefiltert aus.

06.01.2025 Sara Paudler:
Ich habe die Methode "public void clear()" hinzugefügt, die alle Inhalte aller Textfelder und TextAreas zurücksetzt und sie somit wieder leer macht. Ebenfalls werden die Auswahlen der RadioButtons der Flugzeuggröße und CheckBoxen der Verpflegung aufgehoben. Das dient dazu, dass die Felder und Buttons/checkboxen frei sind, um eine neue Reise hinzuzufügen. Dazu habe ich noch einen ActionListener im "buttonClear" hinzugefügt, der die Methode clear aufruft und ausführt. 

07.01.2025 Lea Zint:
Klasse: ThePrivateJetAgency
Methode: public void loeschen ()
45 Minuten
- Methode loeschen() soll alle Texteingaben und jede Button-Auswahl löschen/zurückzusetzen
- ActionListener für Löschen-/Reset-Button erstellt, der die Methode auslöst

08.01.2025 Sara Paudler:
In der Klasse "Reise" unsere Variablen auf private gesetzt, damit dies übergreifend übereinstimmt.

08.01.2025 Lea Zint:
Klasse: ThePrivateJetAgency
Methode: public void loeschen () und public void clear()
30 Minuten
- Bisher haben Methoden clear und loeschen die RadioButtons nicht sauber zurückgesetzt
- Problem nun behoben, indem RadioButtons um .setSelected(false) ergänzt wurden
