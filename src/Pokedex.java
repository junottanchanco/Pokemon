//Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).
public class Pokedex extends AbstractClass implements PokemonInterface{
	
	@Override
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: "  + pokemon.getName() + " -- Type: " + pokemon.getType() + " -- Health: " + pokemon.getHealth();
	}
}
