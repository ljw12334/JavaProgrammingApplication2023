package Pokemonster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다\n야생 포켓몬이 나타났습니다");
//        System.out.println(Math.random());
//        System.out.println((int)(Math.random() * 6) + 1);
        int enemyPick = (int)(Math.random() * 3);

        try {
            Pokemon enemyPokemon = null;
            Pokemon myPokemon = null;          //추상클래스 변수선언 가능
//            Pokemonster.Pokemon pokemon = new Pokemonster.Pokemon(); //추상클래스의 객체 생성은 불가

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

            enemyPokemon.name = "상대 " + enemyPokemon.name;

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

            int menu, skillNumber;
            while (true) {
                System.out.print("\n" + myPokemon.name + "은(는) 무엇을 할까?\n1)싸운다   2)포켓몬   3)도망친다 : ");
                menu = scanner.nextInt();

                if (menu == 1) {
                    while (true) {
                        System.out.print("기술 : 1)" + myPokemon.skills.get(0) + "   2)" + myPokemon.skills.get(1) + "   3)" + myPokemon.skills.get(2) + "   4)" + myPokemon.skills.get(3) + " : ");
                        skillNumber = scanner.nextInt();
                        if (skillNumber >= 1 && skillNumber <= 4) {
                            myPokemon.attack(enemyPokemon, skillNumber);
                            break;
                        } else {
                            System.out.println("기술은 1 ~ 4번 까지만 존재합니다!\n\n");
                        }
                    }
                    enemyPokemon.attack(myPokemon, (int) (Math.random() * 4) + 1);

                } else if (menu == 2) {

                } else {
                    System.out.println("무사히 도망쳤다!");
                    break;
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("입력 값은 숫자여야 합니다.");
            System.out.println("예외 내용 : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("객체가 생성되지 않았습니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");
            System.out.println("예외 내용 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료!");
        }
    }
}
