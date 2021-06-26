package com.ftejos.zoologico;

public class Gorilla extends Mammal{
	
	
	void throwSomething() {
		System.out.println("El gorilla ha tirado un objeto a una persona y ha perdido energia");
		energyLevel = energyLevel - 5;
	}
	
	
	void eatBananas() {
		System.out.println("El gorilla se ha comido una banana y esta super contento");
		 energyLevel = energyLevel + 10;
		
	}
	
	 void climb() {
		 System.out.println("El gorilla ha escalado una pared");
		 energyLevel = energyLevel - 10;		 
	 }

}
