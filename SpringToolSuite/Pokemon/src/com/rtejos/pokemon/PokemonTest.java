package com.rtejos.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
		Pokedex pokedex = new Pokedex();
		
		Pokemon limber = pokedex.createPokemon("Limber", 100, "Dragon");
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 100, "Dragon");
		Pokemon bolbassour = pokedex.createPokemon("Bolbassaur", 100, "fuego");
		
		limber.attackPokemon(pikachu, limber);
		pikachu.attackPokemon(limber, pikachu);
		bolbassour.attackPokemon(pikachu, bolbassour);
		
		
		
		System.out.println("\nMi lista de pokemones creados :");
		pokedex.listPokemon();
		System.out.println("Se ha(n) creado hasta el momento " +Pokedex.myPokemons + " pokemon(es)");
		System.out.println(pokedex.pokemonInfo(bolbassour));
		System.out.println(pokedex.pokemonInfo(limber));
		System.out.println(pokedex.pokemonInfo(pikachu));
		
		
	}

}
