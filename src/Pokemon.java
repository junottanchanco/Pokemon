//Create a Pokemon class with: name, health, and type member variables.
public class Pokemon {
	private String name;
	private int health;
	private String type;
// a count static variable that keeps the number of Pokemon created in the program.
	public static int count;

//	a constructor class to set the instance's name, health, and type on creation
	public Pokemon(String name, String type, int health) {
		this.health = health;
		this.type = type;
		this.name = name;
		count++;
	}
//	getters and setters for each member variable.
	
	// getter 
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static void setCount(int count) {
		Pokemon.count = count;
	}
	
	public static int getCount() {
		return count;
	}
}
