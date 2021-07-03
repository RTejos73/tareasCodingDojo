package com.rtejos.statico;

public class Person {
	private int age;
	private String name;
	public static int numberOfPeople = 0;
	
	public Person(int ageParam, String nameParam) {
		this.age = ageParam;
		this.name = nameParam;
		numberOfPeople++;
	}
	
	public static int peopleCount() {
		return numberOfPeople;
	}
	

}
