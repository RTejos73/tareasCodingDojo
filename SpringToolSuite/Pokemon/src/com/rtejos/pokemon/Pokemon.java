package com.rtejos.pokemon;

public class Pokemon {
	
	private String name;
	private int health;
	private String type;
	public static int count = 0;
	
	// constructor
	public Pokemon(String name, int health, String type) {	
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
	
	// metodo de atake
	void attackPokemon(Pokemon atacado, Pokemon atacante) {
		atacado.health -= 10; 
		System.out.println("El Pokemon " + atacado.getName() + 
				" ha sido atacado por " + atacante.getName() + 
				", y la salud de " + atacado.getName() +  
				" ahora es de " + atacado.getHealth());
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	
		
	
	
	
	
	
	
}
