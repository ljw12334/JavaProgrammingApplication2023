package Pokemonster;

import Fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;

public class Charizard extends Pokemon{
    public Charizard(Flyable f) {
        System.out.println("자몽자몽!");
        this.level = 36;
        this.evolveRate = 0;
        this.attackRate = 84;
//        this.attackRate = (int)(Math.random() * 11) + 74;
        this.defenceRate = 78;
//        this.setLevel(36);
        this.setHp(78);
        this.name = "리자몽";

        this.flyable = f;

//        this.skills = new String[]{"화염방사", "용의숨결", "할퀴기", "지진"};
//        this.specialAttackRate = new int[]{90, 60, 40, 100};

        this.skills = new ArrayList<>(Arrays.asList("화염방사", "용의숨결", "할퀴기", "지진"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(90, 60, 40, 100));

//        this.skills = new ArrayList<>();
//        this.specialAttackRate = new ArrayList<>();
//        this.skills.add("화염방사");
//        this.skills.add("용의숨결");
//        this.skills.add("할퀴기");
//        this.skills.add("지진");
//        this.specialAttackRate.add(90);
//        this.specialAttackRate.add(60);
//        this.specialAttackRate.add(40);
//        this.specialAttackRate.add(100);
    }

    public Charizard(int level, int hp, String name) {
        super(level, hp, name);  // 부모 클래스의 매개변수 생성자를 호출
        System.out.println("자식 클래스(리자몽)의 매개변수 생성자");
    }


    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 화염 공격을 시전합니다");
    }

    public void type(){
        System.out.println(this.name + " 화염 속성!!");
    }
}
