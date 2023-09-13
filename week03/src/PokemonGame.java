public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

        pikachu.name = "피카츄";
        charizard.name = "리자몽";

        pikachu.level = 3;
        pikachu.hp = 100;

        charizard.level = 36;
        charizard.hp = 800;

        System.out.println(charizard.name + "의 체력은 " + charizard.hp + "이고 레벨은 " + charizard.level + "입니다");
        charizard.evolve(charizard.level);
        pikachu.evolve(pikachu.level);
    }
}
