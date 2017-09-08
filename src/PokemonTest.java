
public class PokemonTest {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Charmander", "Fire", 999);
		Pokemon p2 = new Pokemon("Bulbasaur", "Leaf", 999);
		Pokemon p3 = new Pokemon("Squirtle", "Water", 999);
		
		Pokedex pokedex = new Pokedex();
		Pokemon p4 = pokedex.createPokemon("Pikachu", "Electric", 1000);
		Pokemon p5 = pokedex.createPokemon("MewTwo", "Psychic", 99999);
		System.out.println(pokedex.pokemonInfo(p4));
		pokedex.attackPokemon(p4);
		System.out.println(pokedex.pokemonInfo(p1));
		System.out.println(pokedex.pokemonInfo(p2));
		System.out.println(pokedex.pokemonInfo(p3));
		System.out.println(pokedex.pokemonInfo(p4));
		System.out.println(pokedex.pokemonInfo(p5));

	}

}
