public class PokemonGame {
    public static void main(String[] args) {
        Pokemon squirtle = new Pokemon("꼬부기", 1);
        Pokemon pikachu = new Pokemon("피카츄");
        Pokemon charizard = new Pokemon();

        System.out.println(pikachu.getName()
                + "의 체력은 " + pikachu.getHp()
                + "이고 레벨은 " + pikachu.getLevel()
                + "입니다");

        squirtle.evolve(squirtle);
        System.out.println(squirtle.getName());
        squirtle.evolve(squirtle);

//        pikachu.name = "피카츄";
//        charizard.name = "리자몽";

        charizard.setName("리자몽");

        pikachu.setLevel(23);
        pikachu.setHp(100);

        charizard.setLevel(36);
        //charizard.setHp(800);

        System.out.println(charizard.getName() + "의 체력은 " + charizard.getHp() + "이고 레벨은 " + charizard.getLevel() + "입니다");
        charizard.evolve(charizard);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
        pikachu.setName("라이츄");
        System.out.println(pikachu.getName());
        pikachu.evolve(pikachu);
    }
}
