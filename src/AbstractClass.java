//Create an abstract class that only implements createPokemon and attackPokemon
public abstract class AbstractClass implements PokemonInterface{
	
	@Override
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}
	
	@Override
	public void attackPokemon(Pokemon pokemon) {
		int currentHealth = pokemon.getHealth()-10;
		pokemon.setHealth(currentHealth);
	}
	
}
