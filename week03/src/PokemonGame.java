import version11.*;


public class PokemonGame {
    public static void main(String[] args) {
        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Charizard c1 = new Charizard();
        Charizard c2 = new Charizard(36, 100, "리자몽");

        c2.info();
        c1.info();

        System.out.println(Pokemon.getPokemonCount());
        //System.out.println(Pikachu.getPokemonCount());


        //s1.level = 1;  // 상속관계도 아니고, 같은 패키지에 있지도 않은 상황
        s1.setLevel(1);
        //System.out.println(s1.level);
        System.out.println(s1.getLevel());

        c1.evolve();
        System.out.println(c1.getLevel());
        System.out.println(c1.getHp());

        p1.attack();
        c1.attack();
        s1.attack();
    }
}
