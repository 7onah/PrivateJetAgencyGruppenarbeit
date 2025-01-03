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
Mithilfe einer if-else-if-else-Anweisung, habe ich die Anzahl der Tage je Monat/comboBoxMonat definiert bzw. die Buttons für die Monatstage un-/sichtbar gemacht.  
(Ich habe mit der switch-Anweisung eine zweite Möglichkeit gefunden, die Anweisung umzusetzen - habe sie aber mit /* ... */ auskommentiert).
Ich hab zudem weitere Kommentare zum besseren Verständnis des Codes ergänzt. 

26.12.2024 Jonah Suiter:
Durch das Auswählen einer der drei Radio-Buttons für die Flugzeuggröße werden die restlichen zwei von der Bearbeitung ausgenommen. Das konnte ich durch die Methode "setEnabled" erzielen. Zusätzlich werden andere ausgewählte Radio-Buttons, welche die Flugzeuggröße festlegen, abgewählt. Dafür habe ich die Methode "setSelected" verwendet um gleichzeitiges, mehrfaches Auswählen von Radio-Buttons zu verhindern. Dieser Mechanismus stellt sicher, dass immer nur ein Radio-Button gleichzeitig aktiviert ist um eine eindeutige Auswahl der Flugzeuggröße zu gewährleisten.

29.12.2024 Sara Paudler:
Ich habe die Methode "groesseJet" hinzugefügt, die, nach Auswahl eines Radiobuttons der Flugzeuggröße, dafür sorgt, dass im Feld textAreaReiseAusgabe dann die Wahl ausgegebn wird. Je nach Auswahl des Buttons wird "klein", "mittel" oder "groß" ausgegeben. Wenn kein Button gewählt wurde, dann wird "Keine Auswahl der Flugzeuggröße getroffen" ausgegeben.

30.12.2024 Melina Slaschjow:
Ich habe die Abholserviceauswahl hinzugefügt, sie zeigt mit hilfer einer Combobox an ob der Abholservice ausgewählt wird oder nicht. Wenn dieser nicht ausgewählt ist (Combobox wählt false) wird das Label und das Textfeld unsichtbar.

31.12.2024 Lea Zint:
Ich hab die Methode "public String verpflegung ()" hinzugefügt. Dafür habe ich den String auswahlVerpflegung definiert und initialisiert und die drei checkBoxen Champagner, Trüffel Pasta, Kaviar mit if-Anweisungen ausgestattet. Weiterhin habe ich Kommentare zum besseren Verständnis ergänzt. 

03.01.2025:
ich habe die die Methode Initialisierung Objekte hinzugefügt wird, in der die Vergangenen Reisen angezeigt werden.

01.01.2025 Jonah Suiter:
Zu Beginn habe ich eine Arraylist "reiseliste" erstellt, in die alle konfigurierten Reisen hinzugefüht werden
Danach habe einen Speichern Button hinzugefügt welcher die Methode "ausgeben" aufruft.
Ich habe mich dazu entschieden die Methode "ausgeben" zu erstellen, damit der Speichern Button übersichtlich bleibt. In die Methode habe ich den Code geschrieben welcher das Zusammenfügen von Variablen, Exception handling, einschränken von Eingaben um nur logische und sinnvolle Werte zu erlauben und das erstellen von einer neuen Reise umfasst. Dadurch konnte ich langen Code übersichtlicher und logischer struckturieren. Außerdem habe ich eine Methode "reiselisteAusgabe" erstellt, die alle Reisen in einem dafür vorgesehenen Bereich auf der GUI ausgibt.
