package com.rtejos.moparte1;

public class Wizard extends Human{
	public String name;
	
	//constructor
	public Wizard() {
		intelligence = 8;
		health = 50;
	}
	
	public Wizard(String name) {
		this.name = name;
		intelligence = 8;
		health = 50;
	}
	
	
	public int healt() {	
		return this.intelligence;
		
	}

	
	public int fireBall() {
		return this.intelligence * 3;
	}
}
