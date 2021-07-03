package com.rtejos.mobjetos.parte2;

import com.rtejos.mobjetos.parte1.Human;

public class Wizard extends Human {
	
	public Wizard() {		
		super.setHealth(50);
		super.setIntelligence(8);		
	}
	
	
	public void heal(Human humano) {
		System.out.println(humano.getHealth());
		humano.setHealth(humano.getHealth() + humano.getIntelligence());
		System.out.println(humano.getHealth());
	}
	
	
	public void fireBall(Human humano) {
		System.out.println(humano.getHealth());
		humano.setHealth(humano.getHealth() - (humano.getIntelligence() * 3));		
		System.out.println(humano.getHealth());		
	}
	
	
}
