package com.rtejos.moparte1;

public class Ninja extends Human {
	public String name;
	
	//constructor
	public Ninja() {
		
	}
	
	public Ninja(String name) {
		this.name = name;
		stealth = 10;
	}
	
	public int steal() {
		int actual = this.stealth;
		this.stealth = this.stealth * 2;
		return actual;
	}
	
	public void runAway() {
		this.health = this.health - 10;
	}

}
