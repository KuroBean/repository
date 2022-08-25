package miniPokemon;

public class Pokemon {
	private int attack;
	public Pokemon() {
		attack=2;
	}
	public void swordDance() {
		attack*=2;
		System.out.println(attack);
	}
}
