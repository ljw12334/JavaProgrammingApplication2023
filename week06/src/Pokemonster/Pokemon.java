package Pokemonster;

import java.util.ArrayList;

//public final class Pokemonster.Pokemon {
public abstract class Pokemon {
    //private int level;
    protected int level;
    private int hp;
    protected int evolveRate, attackRate, defenceRate;
    protected ArrayList<String> skills; // 최대 4가지 skill
    protected ArrayList<Integer> specialAttackRate; // 위력
    protected String name;

    private static int pokemonCount = 0;  // 클래스(정적) 변수

    Flyable flyable;  // 연관 관계

    public void setFlyable(Flyable flyable) {  // upcast
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.name + "이(가) ");
        this.flyable.fly();
    }

    public static int getPokemonCount() { // 클래스(정적) 메서드
        return pokemonCount;
    }

    public Pokemon() {
        //System.out.println("부모 클래스의 기본 생성자");
        pokemonCount++;
    }

    public Pokemon(int level, int hp, String name) {
        //System.out.println("부모 클래스의 매개변수 생성자");
        this.level = level;
        this.hp = hp;
        this.name = name;
        pokemonCount++;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void evolve(){  // 매개변수 제거
        if(this instanceof Pikachu){
            System.out.println("삐까삐까~");
        }else if(this instanceof Squirtle){
            System.out.println("꼬북꼬북...");
        }else if(this instanceof Charizard){
            System.out.println("자몽자몽~~");
        }

        this.level = this.level + 1;  // 매개변수 pokemon 대신에 this 사용
        this.hp = this.hp + 100;  // 레벨 업시 체력 +100
        String texts = """
                    name의 레벨이
                    level으로 증가!
                """.replace("level", this.level + "")  // pokemon 대신 this
                .replace("name", this.name);
        System.out.println(texts);
    }

    public final void info(){  // 자식클래스에서 재정의(override) 불가
        System.out.println("================");
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level);
        System.out.println("체력 : " + hp);
        System.out.println("================");
    }

    public abstract void attack();

    public void attack(Pokemon targetPokemon, int skillNumber) {
        System.out.println(this.name + "은(는) " + targetPokemon.name + "에게 " + this.skills.get(skillNumber - 1) + "을(를) 썼다!");

        int temporaryAttackRate = (this.attackRate + this.specialAttackRate.get(skillNumber - 1)) - targetPokemon.defenceRate;

        if (temporaryAttackRate < 0)
            temporaryAttackRate = 0;

        if (temporaryAttackRate == 0) {
            targetPokemon.hp--;
        } else {
            int critical = (int)(Math.random() * 24);
            if (critical >= 23) {
                temporaryAttackRate = (int)(temporaryAttackRate * 1.5f);
                System.out.println("급소에 맞았다!");
            }
            targetPokemon.hp = targetPokemon.hp - temporaryAttackRate;
        }

        if (targetPokemon.hp <= 0) {
            System.out.println(targetPokemon.name + "은(는) 쓰러졌다!");
        } else {
            System.out.println(targetPokemon.name + "의 체력이 " + targetPokemon.hp + "남았다!");
        }
    }
}