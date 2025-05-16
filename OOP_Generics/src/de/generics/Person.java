package de.generics;

/**
 * Diese Klasse repräsentiert eine Person mit Eigenschaften wie Name, Alter, Standort und Geschlecht.
 */
public class Person {

    // Private Member-Variablen
    private String name;
    private int age;
    private String standort;
    private String geschlecht;

    /**
     * Konstruktor zur Initialisierung eines Person-Objekts.
     *
     * @param name      der Name der Person
     * @param age       das Alter der Person
     * @param standort  der Standort der Person
     * @param geschlecht das Geschlecht der Person
     */
    public Person(String name, int age, String standort, String geschlecht) {
        this.name = name;
        this.age = age;
        this.standort = standort;
        this.geschlecht = geschlecht;
    }

    /**
     * Gibt den Namen der Person zurück.
     *
     * @return der Name der Person
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt das Alter der Person zurück.
     *
     * @return das Alter der Person
     */
    public int getAge() {
        return age;
    }

    /**
     * Gibt den Standort der Person zurück.
     *
     * @return der Standort der Person
     */
    public String getStandort() {
        return standort;
    }

    /**
     * Gibt das Geschlecht der Person zurück.
     *
     * @return das Geschlecht der Person
     */
    public String getGeschlecht() {
        return geschlecht;
    }
}
