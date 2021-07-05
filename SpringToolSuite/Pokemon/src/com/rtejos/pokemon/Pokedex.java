package com.rtejos.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokedex extends AbstractPokemon {
	
	public static int myPokemons = 0;							// incrementara en 1 cada que se cree un pokemon.
	public List<Pokemon> misPokemon = new ArrayList<Pokemon>();
	
	
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		misPokemon.add(super.createPokemon(pokemon.getName(), pokemon.getHealth(), pokemon.getType()));
		myPokemons++;
		return pokemon;
	}
	

	@Override
	public void listPokemon() {
		
		for (Pokemon poke : misPokemon) {
			System.out.println(poke.getName());			
		}
	}

}
