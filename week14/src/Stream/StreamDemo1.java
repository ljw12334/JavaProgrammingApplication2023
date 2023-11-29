package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산", "서울", "대전", "대구", "서울", "경기");

        // JDK8 이전에 사용한 방식 (레거시) -> 외부 반복자 사용 (개발자 코드에서 collection에 반복마다 접근, 속도 느림)
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next();
            System.out.print(city + " ");
        }

        // Stream (모던)  -> 내부 반복자 사용 (개발자 코드에서는 처리 코드만 전달, 반복 처리는 collection에 맡김, 데이터 많을수록 유리)
        System.out.println();
        Stream<String> stream = cities.stream();

        // 병렬 처리 (여러 쓰레드 사용, 먼저 처리된것을 우선적으로 반환함, 초 대량의 데이터 처리시 매우 유리, 작은 작업에서는 오히려 불리할 수 있음)
//        Stream<String> st = cities.parallelStream();

        stream.forEach(c -> System.out.print(c + " "));
    }
}
