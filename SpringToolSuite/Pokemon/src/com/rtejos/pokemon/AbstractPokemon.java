package com.rtejos.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		return pokemon;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		String detallePokemon;
		detallePokemon = "\nName   : " + pokemon.getName() + 
						 "\nHealth : " + pokemon.getHealth() +
						 "\nType   : " + pokemon.getType();
		return detallePokemon;
	}

	

	

}
