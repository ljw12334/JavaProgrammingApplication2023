package generic;

import Pokemonster.*;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        List<Integer> specialAttackRate = new ArrayList<>();

        skills.add("화염방사");
        skills.add("용의숨결");
        skills.add("지진");

        specialAttackRate.add(90);
        specialAttackRate.add(60);
        specialAttackRate.add(100);

        for (String skill : skills) {
            System.out.println(skill);
        }
        for (Integer rate : specialAttackRate) {
            System.out.println(rate);
        }
    }
}
