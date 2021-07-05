package com.rtejos.pokemon;

public interface PokemonInterface {
	
		
	
	Pokemon createPokemon(String name, int health, String type);  // Este m�todo crea y retorna un Pokemon.
	
	String pokemonInfo(Pokemon pokemon);						  // Este m�todo devuelve un string con el name, health, y type del Pokemon.
	
	void listPokemon();											  // Lista el nombre de todos los Pokemones que tienes en la Pokedex.
	

}
