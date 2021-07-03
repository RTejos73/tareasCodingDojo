package com.rtejos.mobjetos.parte1;

public class Human {
	
	private int strength = 3;		//fuerza
	private int stealth = 3;		//sigilo
	private int intelligence = 3;	//ingteligencia
	private int health = 100;		//salud
	private static int howManySamurai = 0;
	
		
	public void attack(Human human) {
		if( (human.health - this.strength) < 0 ) { 
			System.out.println("El nivel de vida del humano atacado es 0.");
			human.health = 0;
		}else {
			human.health -= this.strength;
		}
	}
	
	
	public void displayHealth() {
		if(this.health <= 0) {
			System.out.println("El nivel de vida es de 0");	
		}else {
			System.out.println("El nivel de vida es " + this.health);	
		}
	}


	public int addNewSamurai() {
		howManySamurai++;
		return howManySamurai;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}


	public void setStealth(int stealth) {
		this.stealth = stealth;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getStrength() {
		return strength;
	}


	public int getStealth() {
		return stealth;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public int getHealth() {
		return health;
	}
	
	
	
	

}
