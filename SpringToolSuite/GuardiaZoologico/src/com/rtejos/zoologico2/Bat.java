package com.rtejos.zoologico2;
import com.rtejos.zoologico.*;

public class Bat extends Mammal{
	
	public int energyLevel;
	
	//constructor
	public Bat() {
		this.energyLevel = 300;		
	}

	
	
	public void fly() {
		
		System.out.println("El animal emite un sonido al despegar");
		energyLevel = energyLevel -50;
	}
	
	
	
	public void eatHumans() {
		System.out.println("bueno, no impota");
		energyLevel = energyLevel +25;
	}
	
	
	public void attackTown() {
		System.out.println("sonido de una ciudad en llamas");
		energyLevel = energyLevel -100;
		
	}

	public int displayEnergy() {		
		System.out.print("La energia del animal es de ");
		return this.energyLevel;
	}

}
