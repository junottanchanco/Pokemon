//Create an interface for the following methods: 
//createPokemon(String name, String type, int health): creates a Pokemon.
public interface PokemonInterface {
	Pokemon createPokemon(String name, String type, int health);
//	attackPokemon(Pokemon pokemon): lowers the attacked Pokemon's health by 10
	void attackPokemon(Pokemon pokemon);
//	pokemonInfo(Pokemon pokemon): returns the name, health, and type of the pokemon
	String pokemonInfo(Pokemon pokemon);
}
