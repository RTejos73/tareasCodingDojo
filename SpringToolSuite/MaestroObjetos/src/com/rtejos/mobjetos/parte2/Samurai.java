package com.rtejos.mobjetos.parte2;

import com.rtejos.mobjetos.parte1.Human;

public class Samurai extends Human{
	
	private int howMany;
	
	public Samurai() {
		super.setHealth(200);
		howMany = super.addNewSamurai();
		
	}
	
	
	public void deathBlow(Human human) {
		human.setHealth(0);
		this.setHealth(this.getHealth() / 2);
	}
	
	public void meditare() {
		this.setHealth(this.getHealth() + (this.getHealth() / 2));
	}
	
	public int howMany() {
		return howMany;
	}

}
