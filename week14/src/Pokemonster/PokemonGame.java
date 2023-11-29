package Pokemonster;

import Fly.NoFly;
import Fly.Wings;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class
PokemonGame {
    public static Pokemon enemyPokemon = null;

    public static int i;
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다");

        Pokemon myPokemon = null;          //추상클래스 변수선언 가능
//            Pokemonster.Pokemon pokemon = new Pokemonster.Pokemon(); //추상클래스의 객체 생성은 불가
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.print("포켓몬을 고르세요\n1)피카츄   2)꼬부기   3)리자몽 : ");
                    int pokemonPick = scanner.nextInt();
                    if (pokemonPick == 1) {
//                        myPokemon = new Pikachu(new NoFly());
                        myPokemon = new Pikachu(() -> System.out.println("로켓 추진기로 날아갑니다"));
                        break;
                    } else if (pokemonPick == 2) {
                        myPokemon = new Squirtle(new NoFly());
                        break;
                    } else if (pokemonPick == 3) {
                        myPokemon = new Charizard(new Wings());
                        break;
                    } else {
                        System.out.println("정상적인 값이 아닙니다!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("입력 값은 숫자여야 합니다.");
                    System.out.println("예외 내용 : " + e.getMessage());
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("예외 발생");
                    System.out.println("예외 내용 : " + e.getMessage());
                    scanner.nextLine();
                }
            }

            produceEnemy();

            int menu, skillNumber;
            while (true) {
                System.out.print("\n" + myPokemon.name + "은(는) 무엇을 할까?\n1)싸운다   2)도망친다   3)상처약   4)종료 : ");
                menu = scanner.nextInt();

                if (menu == 1) {
                    while (true) {
                        System.out.println("기술 :");

                        Collection<String> skillValues = myPokemon.skills.values();
                        ArrayList<String> skillLists = new ArrayList<String>(skillValues);

//                        for (int i = 0; i < skillLists.size(); i++) {
//                            System.out.println((i + 1) + ") " + skillLists.get(i));
//                        }

                        i = 0;
                        skillLists.stream().forEach(s -> {
                            System.out.println(++i + ") " + s);
                        });

//                        for (Integer i : myPokemon.skills.keySet()) {
//                            System.out.print("   " + i + ")" + myPokemon.skills.get(i));
//                        }
                        System.out.print(" : ");

                        skillNumber = scanner.nextInt();
                        if (skillNumber >= 1 && skillNumber <= myPokemon.skills.size()) {
                            myPokemon.attack(enemyPokemon, skillNumber);
                            enemyPokemon.attack(myPokemon, (int) (Math.random() * enemyPokemon.skills.size()) + 1);
                            break;
                        } else {
                            System.out.println("메뉴에서 선택하세요");
                        }
                    }
                } else if (menu == 2) {
                    myPokemon.performFly();
                    System.out.println("현재 지역을 탈출합니다");
                    produceEnemy();
                } else if (menu == 3) {
                    System.out.println("좋은상처약을 썼다! 체력이 50 회복되었다.");
//                    UnaryOperator<Integer> healPotion = hp -> hp + 50;

//                    Function<Integer, Integer> healPotion = hp -> hp + 50;
//                    int newHp = healPotion.apply(myPokemon.getHp());
//                    myPokemon.setHp(newHp);

//                    Consumer<Pokemon> healPotion = pokemon -> pokemon.setHp(pokemon.getHp() + 50);
//                    healPotion.accept(myPokemon);

                    Supplier<Integer> healPotion = () -> 50;

                    myPokemon.setHp(healPotion.get() + myPokemon.getHp());
                    System.out.println(myPokemon.name + "의 체력이 " + myPokemon.getHp() + "로 증가했다!");

                } else if (menu == 4) {
                    System.out.println("게임을 종료합니다");
                    break;
                } else {
                    System.out.println("메뉴에서 선택하세요");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("입력 값은 숫자여야 합니다.");
            System.out.println("예외 내용 : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("객체가 생성되지 않았습니다.");
            System.out.println("예외 내용 : " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("선택 범위를 벗어났습니다.");
            System.out.println("예외 내용 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");
            System.out.println("예외 내용 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료!");
        }
    }

    public static void produceEnemy() {
        int enemyPick = (int)(Math.random() * 3);
        System.out.println("야생 포켓몬이 나타났습니다");
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
    }
}
