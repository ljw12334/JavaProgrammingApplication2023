package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// 파일로부터 stream 객체 생성
public class StreamDemo8 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 6000)
        );

        Stream<Fruit> fruitStream = fruitList.stream();
//        fruitStream.sorted().forEach(f -> System.out.println(f.getName() + " : " + f.getPrice()));
//        fruitStream.sorted((f1, f2) -> f2.compareTo(f1)).forEach(f -> System.out.println(f.getName() + " : " + f.getPrice())); // 내림차순

//        fruitStream.sorted(Comparator.naturalOrder()).forEach(f -> System.out.println(f.getName() + " : " + f.getPrice()));
        fruitStream.sorted(Comparator.reverseOrder()).forEach(f -> System.out.println(f.getName() + " : " + f.getPrice())); // 내림차순
    }
}
