package de.generics;

import java.util.ArrayList;

/**
 * Diese Klasse demonstriert die Verwendung von Generics in Java.
 * Sie erstellt eine Liste von Person-Objekten und zeigt deren Eigenschaften an.
 */
public class GenericsDemo1 {

    /**
     * Die Hauptmethode, die das Programm startet.
     *
     * @param args Kommandozeilenargumente (nicht verwendet)
     */
    public static void main(String args[]) {

        // Erstellen einer ArrayList zur Speicherung von Person-Objekten
        ArrayList<Person> persons = new ArrayList<>();

        // Hinzufügen von Person-Objekten zur Liste
        persons.add(new Person("Peter", 31, "Köln", "m"));
        persons.add(new Person("Peterson", 41, "Düsseldorf", "m"));
        persons.add(new Person("Claudia", 27, "Bonn", "w"));
        persons.add(new Person("Petra", 34, "Trier", "w"));

        // Iterieren durch die Liste und Anzeigen der Eigenschaften jeder Person
        for (int i = 0; i < persons.size(); i++) {
            Person somebody = persons.get(i);

            System.out.println("Name: " + somebody.getName());
            System.out.println("Alter: " + somebody.getAge());
            System.out.println("Standort: " + somebody.getStandort());
            System.out.println("Geschlecht: " + somebody.getGeschlecht());
            System.out.println();
        }
    }
}
