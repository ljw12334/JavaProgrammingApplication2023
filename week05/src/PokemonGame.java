import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다\n야생 포켓몬이 나타났습니다");
//        System.out.println(Math.random());
//        System.out.println((int)(Math.random() * 6) + 1);
        int enemyPick = (int)(Math.random() * 3);

        Pokemon enemyPokemon = null;
        Pokemon myPokemon = null;          //추상클래스 변수선언 가능
//        Pokemon pokemon = new Pokemon(); //추상클래스의 객체 생성은 불가

        if (enemyPick == 0) {
            NoFly noFly = new NoFly();
            enemyPokemon = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            enemyPokemon = new Squirtle(noFly);
        } else if (enemyPick == 2) {
            Wings wings = new Wings();
            enemyPokemon = new Charizard(wings);
        } else {
            System.out.println("실행되면안됨");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("포켓몬을 고르세요\n1)피카츄   2)꼬부기   3)리자몽 : ");
        int pokemonPick = scanner.nextInt();
        if (pokemonPick == 1) {
            myPokemon = new Pikachu(new NoFly());
        } else if (pokemonPick == 2) {
            myPokemon = new Squirtle(new NoFly());
        } else if (pokemonPick == 3) {
            myPokemon = new Charizard(new Wings());
        } else {
            System.out.println("정상적인 값이 아닙니다!");
        }

        int menu;
        while (true) {
            System.out.print("\n1)전투   2)도망   3)종료 : ");
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("전투 기술 : ");
                myPokemon.attack(enemyPokemon, scanner.next());
            } else if (menu == 2) {

            } else {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
