package de.generics;

public class Person {
	
	private String name;
	private int age;
	private String standort;
	private String geschlecht;
	
	
	
	public Person(String name, int age, String standort, String geschlecht) {
		super();
		this.name = name;
		this.age = age;
		this.standort = standort;
		this.geschlecht = geschlecht;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getStandort() {
		return standort;
	}
	public String getGeschlecht() {
		return geschlecht;
	}

}
