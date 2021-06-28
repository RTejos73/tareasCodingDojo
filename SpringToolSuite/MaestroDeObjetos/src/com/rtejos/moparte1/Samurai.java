package com.rtejos.moparte1;

public class Samurai extends Human {
	public String name;
	
	//constructor
	public Samurai() {
		
	}
	
	public Samurai(String name) {
		this.name = name;
		health = 200;
	}
	
	public void deathBlow() {
		this.health = this.health /2;
		
	}
	
	
	public void meditare() {
		this.health = this.health - (this.health / 2);		
	}
	
	
	public int howMany() {
		return this.health;		
	}
}
