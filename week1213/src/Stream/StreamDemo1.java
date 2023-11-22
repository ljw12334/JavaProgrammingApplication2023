package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산", "서울", "대전", "대구", "서울", "경기");

        // JDK8 이전에 사용한 방식 (레거시)
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next();
            System.out.print(city + " ");
        }

        // Stream (모던)
        System.out.println();
        Stream<String> stream = cities.stream();
//        Stream<String> st = cities.parallelStream(); // 병렬 처리 (여러 쓰레드 사용, 먼저 처리된것을 우선적으로 반환함)

        stream.forEach(c -> System.out.print(c + " "));
    }
}
