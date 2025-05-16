package de.generics;

import java.util.ArrayList;

public class GenericsDemo1 {
	
	public static void main (String args[]) {
		
		ArrayList<Person> persons = new ArrayList<>();
		
		persons.add( new Person("Peter", 31, "Köln", "m") );
		persons.add( new Person("Peterson", 41, "Düsseldorf", "m") );
		persons.add( new Person("Claudia", 27, "Bonn", "w") );
		persons.add( new Person("Petra", 34, "Trier", "w") );
		
		for (int i = 0; i < persons.size(); i++) {
			
			Person somebody = (Person) persons.get(i);
			
			System.out.println("Name: " + somebody.getName());
			System.out.println("Alter: " + somebody.getAge());
			System.out.println("Standort: " + somebody.getStandort());
			System.out.println("Geschlecht: " + somebody.getGeschlecht());
			System.out.println();
			
		}
	}
}
