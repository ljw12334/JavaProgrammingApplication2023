package Pokemonster;

import Fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Squirtle extends Pokemon{
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북!");
        //this.setLevel(1);
        this.level = 1;
        this.evolveRate = 2;
        this.attackRate = 48;
//        this.attackRate = (int)(Math.random() * 4) + 45;
        this.defenceRate = 65;
        this.setHp(44);
        this.name = "꼬부기";

        this.flyable = f;

//        this.skills = new String[]{"물대포", "물의파동", "몸통박치기", "하이드로펌프"};
//        this.specialAttackRate = new int[]{40, 60, 40, 120};

//        this.skills = new ArrayList<>(Arrays.asList("물대포", "물의파동", "몸통박치기", "하이드로펌프"));
//        this.specialAttackRate = new ArrayList<>(Arrays.asList(40, 60, 40, 120));

        this.skills = Map.of(1, "물대포", 2, "물의파동", 3, "몸통박치기", 4, "하이드로펌프");
        this.specialAttackRate = Map.of("물대포", 40, "물의파동", 60, "몸통박치기", 40, "하이드로펌프", 120);
//        this.skills = new HashMap<>();
//        skills.put(1, "물대포");
//        skills.put(2, "물의파동");
//        skills.put(3, "몸통박치기");
//        skills.put(4, "하이드로펌프");
//
//        this.specialAttackRate = new HashMap<>();
//        specialAttackRate.put("물대포", 40);
//        specialAttackRate.put("물의파동", 60);
//        specialAttackRate.put("몸통박치기", 40);
//        specialAttackRate.put("하이드로펌프", 120);

//        this.skills = new ArrayList<>();
//        this.specialAttackRate = new ArrayList<>();
//        this.skills.add("물대포");
//        this.skills.add("물의파동");
//        this.skills.add("몸통박치기");
//        this.skills.add("하이드로펌프");
//        this.specialAttackRate.add(40);
//        this.specialAttackRate.add(60);
//        this.specialAttackRate.add(40);
//        this.specialAttackRate.add(120);
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
