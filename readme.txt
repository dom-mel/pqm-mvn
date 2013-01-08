CSV Stock reader
================

Usage
=====

Build: mvn package
Run:   java -jar target/org.linesofcode.bht.pqm.csv-1.0-jar-with-dependencies.jar
Code coverage report: target/site/cobertura/index.html

Questions from exercise
=======================

Q: What ist the actual code quality (code coverage) of your existing software?
A: Code coverage : 68%

Q: Think on the result of the previous part, if you've less than 50% of code coverage,
   what you have to do for improving this measurement?
A: Nach der ersten Code Coverage Messung lag das Ergebnis bei 68%.
   Hierzu sei zunächst bemerkt, dass die StockEntry Klasse eine Code
   Coverage von 87% und die StockIndex Klasse eine Code Coverage von
   100% aufweist. Lediglich die Main Klasse weißt eine Code Coverage
   von 0% auf.

   Die Main Klasse beschäftigt sich lediglich mit der Ausgabe der
   gewünschten Ergebnisse. Die gesamte Fachlogik befindet sich in den
   anderen beiden Klassen. Daher ist es hier legitim die Main Klasse
   aus dem Test auszuklammern. Dies ist im Rahmen dieser Teilaufgabe
   geschehen.  Danach beträgt die Code Coverage 95%.

   Eine andere Möglichkeit wäre es, die Ausgabe eines gesamten
   Durchlaufs des Programmes zu überprüfen.


Q: Is Test-driven development (TDD) a good software development process in combination with
   code coverage? Why (not)?
A: Ja der TDD Ansatz und die Code Coverage Metrik passen gut zusammen.
   Mit ihr lässt sich messen, wie viel die vorher geschriebenen Tests
   die Implementation tatsächlich erreichen.


Q: The impact of poor component quality is magnified by the complexity of interactions.
   What is a good measurement for code coverage, 25% / 50% / 75% / 100% in general or complex  developement? Why (not)?
A: Allgemein ist eine hohe Code Coverage wünschenswert. Je nach Art und
   Komplexität des Codes sollte sich der angestrebte Wert jedoch verändern.
   Als Extrembeispiel sein hier generierte Klassen genannt. Für diese sind
   automatisierte Test meist nicht sinnvoll. Anders bei sehr komplexen oder
   sensiblen Komponenten des Systems, diese sollten eine möglichst hohe Code
   Coverage auf weißen.

Q: Is there a correlation between increasing software complexity and higher code coverage?
A: Ja es sollte einen Zusammenhang zwischen hoher Testabdeckung und
   hoher Code Komplexität geben. Wenn eine sehr komplexe Methode eine
   niedrige Testabdeckung aufweist ist dies ein Indikator für
   mögliche Bugs bzw. Probleme bei der Weiterentwicklung der Software.