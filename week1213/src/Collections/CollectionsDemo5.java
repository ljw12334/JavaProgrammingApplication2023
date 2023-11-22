package Collections;

import java.util.HashMap;
import java.util.Map;

// Map
public class CollectionsDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> pokemons = Map.of("파이리", 1, "리자드", 2, "리자몽", 3, "메가리자몽X", 4, "이상해씨", 1);
//        System.out.println(pokemons);
//        System.out.println(pokemons.size());
//
//        for (String idx : pokemons.keySet())
//            System.out.println(idx + "는 " + pokemons.get(idx) + "번째 진화체입니다");

//        pokemons.put("이상해풀", 2); // of 로 생성한 경우 불변이기에 삽입 불가
//        pokemons.remove("메가리자몽X"); // 삭제도 안됨

        Map<String, Integer> pokemons2 = new HashMap<>(pokemons);

        pokemons2.put("이상해풀", 2);
        pokemons2.remove("메가리자몽X");

//        pokemons2.clear(); // 모든 요소 삭제

        for (String idx : pokemons2.keySet())
            System.out.println(idx + "는 " + pokemons2.get(idx) + "번째 진화체입니다");
    }
}
