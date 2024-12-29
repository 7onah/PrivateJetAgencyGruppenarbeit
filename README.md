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
