package LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;

public class StringDemoTest {
    public static void main(String[] args) {
        String[] strings = { "Hi", "Hello buddy", "Hello friend professor"};

//        Arrays.sort(strings); // 사전 순, sort에 미리 정의된 방식으로 문자열을 비교함

//        Arrays.sort(strings, new Comparator<String>() { // 길이 순
//            // 익명 객체 Comparator 를 만들어 override
//            @Override
//            public int compare(String o1, String o2) {
////                return o1.length() - o2.length(); // 짧은 순서
//                return o2.length() - o1.length(); // 긴 순서
//            }
//        });
        Arrays.sort(strings, (o1, o2) -> o1.length() - o2.length()); // Lambda 표현식으로 코드 간결화

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
