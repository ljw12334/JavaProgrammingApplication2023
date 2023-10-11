package Pokemonster;

public interface Flyable {
//    public Pokemonster.Flyable(){
//
//    }

    //Pokemonster.Pokemon pokemon;

    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}
