package com.rtejos.zoologico;

public class Mammal {
	
	private int energyLevel;
	
	
	//constructor
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}

	
	public int displayEnergy() {		
		System.out.print("La energia actual del animal es de ");
		return this.energyLevel;
	}



	
	public void defineEnergy(int energy) {
		this.energyLevel = energy;
		
	}

}
