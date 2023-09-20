
public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        //pikachu.setFlyable(new NoFly());  // 프로그램 실행 중 동적으로 하늘을 나는 방식을 변경
        pikachu.performFly();
        /*
        피카츄이(가) Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Flyable.fly()" because "this.flyable" is null
	at Pokemon.performFly(Pokemon.java:18)
	at PokemonGame.main(PokemonGame.java:5)
         */
    }
}
