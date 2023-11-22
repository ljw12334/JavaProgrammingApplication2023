package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산", "서울", "대전", "대구", "서울", "경기");

        Stream<String> stream = cities.stream();
        stream.forEach(c -> System.out.print(c + " "));

        // 필터: "대" 로 시작하는 것만
        System.out.println();
        stream = cities.stream();
        stream.filter(c -> c.startsWith("대")).forEach(c -> System.out.print(c + " "));

        // 필터: "산" 으로 끝나는 것만
        System.out.println();
        stream = cities.stream();
        stream.filter(c -> c.endsWith("산")).forEach(c -> System.out.print(c + " "));

        // distinct: 중복 제거
        System.out.println();
        stream = cities.stream();
        stream.distinct().forEach(c -> System.out.print(c + " "));

        // 필터: "대" 로 시작하는 것만 -> 중복 제거
        System.out.println();
        stream = cities.stream();
        stream.filter(c -> c.startsWith("대")).distinct().forEach(c -> System.out.print(c + " "));
    }
}
