package com.rtejos.mobjetos.parte2;

import com.rtejos.mobjetos.parte1.Human;

public class Ninja extends Human {

	public Ninja() {
		super.setStealth(10);
	}
	
	
	public void steal(Human human) {
		int stealthActual = super.getStealth();
		human.setHealth(human.getHealth() - this.getStealth());
		this.setHealth(getHealth() + stealthActual);
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);	
	}
	
	
	
}
