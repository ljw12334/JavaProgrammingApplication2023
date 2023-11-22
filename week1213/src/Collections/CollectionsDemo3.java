package Collections;

import java.util.Stack;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(5);
        s1.push(1);
        s1.push(3);

        System.out.println(s1.pop());
        System.out.println(s1.peek()); // top에 위치한 값을 출력, 삭제는 하지 않음
        System.out.println(s1.pop());
        System.out.println(s1.pop());
//        System.out.println(s1.pop()); // EmptyStackException

        for (Integer i : s1)
            System.out.print(i + " ");

//        List<String> pokemon = List.of("피카츄", "파이리", "라이츄");
//        System.out.println(pokemon.contains("피카츄"));
//        System.out.println(pokemon.contains("꼬부기"));
//        System.out.println(pokemon.indexOf("파이리"));
//
//        List<String> p1 = new ArrayList<>(pokemon);
//        p1.add("이상해씨");
//        p1.add("지그제구리");
//
//        List<String> p2 = new ArrayList<>(pokemon);
//        p2.remove("파이리");
//        p2.add("마릴");
//
//        System.out.println(p1.containsAll(p2));
//
//        p1.removeIf(r -> r.endsWith("츄"));
//        p1.replaceAll(x -> "포켓몬 " + x);
//        p1.forEach(p -> System.out.print(p + " "));
    }
}
