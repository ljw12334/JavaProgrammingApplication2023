package Fly;

public interface Flyable {
//    public Fly.Flyable(){
//
//    }

    //Pokemonster.Pokemon pokemon;

    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}
