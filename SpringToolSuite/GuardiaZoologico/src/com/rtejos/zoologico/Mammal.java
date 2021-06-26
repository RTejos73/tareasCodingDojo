package com.rtejos.zoologico;

public class Mammal {
	
	public int energyLevel;
	
	
	//constructor
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	public int displayEnergy() {		
		System.out.print("La energia actual del animal es de ");
		return this.energyLevel;
	}

}
