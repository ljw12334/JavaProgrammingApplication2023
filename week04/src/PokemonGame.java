
public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다\n야생 포켓몬이 나타났습니다");
//        System.out.println(Math.random());
//        System.out.println((int)(Math.random() * 6) + 1);
        int enemyPick = (int)(Math.random() * 3);

        if (enemyPick == 0) {
            NoFly noFly = new NoFly();
            Pikachu pikachu = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            Squirtle squirtle = new Squirtle(noFly);
        } else if (enemyPick == 2) {
            Wings wings = new Wings();
            Charizard charizard = new Charizard(wings);
        } else {

        }
    }
}
