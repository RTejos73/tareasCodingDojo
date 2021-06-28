package com.rtejos.moparte1;

public class Human {
	
	public int strength;
	public int intelligence;
	public int stealth;
	public int health;
	
	
	//constructor
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;		
	}
	
	
	public int attack(int ptos) {
		return this.health - ptos;		
	}
	
	public int dispalyHealth() {
		System.out.print("La salud de ");
		return this.health;
	}
	
	

}
