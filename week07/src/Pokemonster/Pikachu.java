package Pokemonster;

import java.util.ArrayList;
import java.util.Arrays;

public class Pikachu extends Pokemon{
    public Pikachu(Flyable f) {
        System.out.println("피카피카!");
        this.level = 1;
        this.evolveRate = 1;
        this.attackRate = 55;
//        this.attackRate = (int)(Math.random() * 6) + 50;
        this.defenceRate = 40;
        this.setHp(35);
        this.name = "피카츄";
        //this.flyable = new Pokemonster.NoFly();  // Association, Has-a (Composition)
        this.flyable = f;

//        this.skills = new String[]{"10만볼트", "볼트태클", "아이언테일", "전광석화"};
//        this.specialAttackRate = new int[]{90, 120, 100, 40};

        this.skills = new ArrayList<>(Arrays.asList("10만볼트", "볼트태클", "아이언테일", "전광석화"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(90, 120, 100, 40));

//        this.skills = new ArrayList<>();
//        this.specialAttackRate = new ArrayList<>();
//        this.skills.add("10만볼트");
//        this.skills.add("볼트태클");
//        this.skills.add("아이언테일");
//        this.skills.add("전광석화");
//        this.specialAttackRate.add(90);
//        this.specialAttackRate.add(120);
//        this.specialAttackRate.add(100);
//        this.specialAttackRate.add(40);
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 전기 장판 공격을 시전합니다");
    }
// 부모클래스의 정적 메서드 getPokemonCount가 override된게 아니라
// Pokemonster.Pikachu 클래스의 자체 정적 메서드가 선언된 것
//    public static int getPokemonCount() {
//        return 7;
//    }

    public void type(){
        System.out.println(this.name +  " 전기 속성!");
    }
}
