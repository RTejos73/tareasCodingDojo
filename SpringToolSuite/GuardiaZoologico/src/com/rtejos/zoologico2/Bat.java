package com.rtejos.zoologico2;
import com.rtejos.zoologico.*;

public class Bat extends Mammal{
	
		
	//constructor
	public Bat() {
		super.defineEnergy(300);	
	}

	
	public void fly() {		
		System.out.println("El animal emite un sonido al despegar");
		setEnergyLevel(-50);
	}
	
	
	
	public void eatHumans() {
		System.out.println("bueno, no impota");
		setEnergyLevel(25);
	}
	
	
	public void attackTown() {
		System.out.println("sonido de una ciudad en llamas");
		setEnergyLevel(-100);
		
	}

	
}
