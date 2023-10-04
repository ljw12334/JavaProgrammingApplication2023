package generic;

import Pokemonster.*;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("화염방사");
        skills.add("용의숨결");
        skills.add("지진");

        for (String skill : skills) {
            System.out.println(skill);
        }
    }
}
