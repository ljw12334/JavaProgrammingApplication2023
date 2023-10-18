package generic;

import Pokemonster.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo04 {
    public static void main(String[] args) {
        List<Pokemon> pokemons = new ArrayList<>(Arrays.asList(new Pikachu(new NoFly()), new Charizard(new Wings()), new Squirtle(new NoFly())));
        for (Pokemon pokemon : pokemons) {
            pokemon.performFly();
        }
    }
}
